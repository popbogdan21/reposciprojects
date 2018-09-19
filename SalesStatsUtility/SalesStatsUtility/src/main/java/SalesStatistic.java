import java.util.*;

/**
 * SalesStatistic class handles the sales statistics
 * clients and products are stored in two HashMaps
 */
public class SalesStatistic {
    private HashMap<String, Client> clients = new HashMap<>();
    private HashMap<String, Product> products = new HashMap<>();

    /**
     * @param sale represent a Sale objects that is added to the statistics
     *             updates the HashMaps that contain Client and Product statistics
     */
    public void addSale(Sale sale) {
        Client client = getClientFromMap(sale.getClientName());
        Product product = getProductFromMap(sale.getProduct());
        client.setNumberOfOrders(client.getNumberOfOrders());
        client.setTotalAmountSpent(sale.getPrice()*sale.getOrderNr());
        product.setUnitsSold(sale.getOrderNr());
    }

    /**
     * @param clientName the client that made the sale
     * @return a Client reference- either a new object or an existing object in the HashMap
     */
    private Client getClientFromMap(String clientName) {
        Client client = null;
        if (!clients.containsKey(clientName)) {
            client = new Client(clientName);
            clients.put(clientName, client);
        } else {
            client = clients.get(clientName);
        }
        return client;
    }

    /**
     * @param productName the product that was sold
     * @return a Product reference- either a new object or an existing object in the HashMap
     */
    private Product getProductFromMap(String productName) {
        Product product = null;
        if (!products.containsKey(productName)) {
            product = new Product(productName);
            products.put(productName, product);
        } else {
            product = products.get(productName);
        }
        return product;
    }

    /**
     * Used to generate the product sales statistics
     *
     * @return a sorted List<Product> by number of units sold
     */
    public List<Product> getProductStatistics(HashMap<String, Product>  products) {
        Collection<Product> productsCollections = products.values();
        List<Product> productsList = new ArrayList<>(productsCollections);
        // I could have defined classes for Comparators but I never used the in-line declaration so I wanted to try it
        //Sorry if it is more difficult to read
        Collections.sort(productsList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getUnitsSold() - o1.getUnitsSold();
            }
        });
        return productsList;
    }

    /**
     * Used to generate the product sales statistics
     *
     * @return a sorted List<Client> by number of orders that each client made
     */
    public List<Client> getClientStatisticsByOrders() {
        Collection<Client> clientscollections = clients.values();
        List<Client> clientsList = new ArrayList<>(clientscollections);
        Collections.sort(clientsList, new Comparator<Client>() {
            @Override
            public int compare(Client o1, Client o2) {
                return o2.getNumberOfOrders() - o1.getNumberOfOrders();
            }
        });
        return clientsList;
    }

    /**
     * Used to generate the product sales statistics
     *
     * @return a sorted List<Client> by the amount of money that each client has spent
     */
    public List<Client> getClientStatisticsByAmountSpent() {
        Collection<Client> clientscollections = clients.values();
        List<Client> clientsList = new ArrayList<>(clientscollections);
        Collections.sort(clientsList, new Comparator<Client>() {
            @Override
            public int compare(Client o1, Client o2) {
                if (o2.getTotalAmountSpent() > o1.getTotalAmountSpent()) {
                    return 1;
                }
                if (o2.getTotalAmountSpent() < o1.getTotalAmountSpent()) {
                    return -1;
                }
                return 0;
                // THIS would be a bug!!!! Even with the added correction factor*10000000
                // return (int) ((o2.getTotalAmountSpent()-o1.getTotalAmountSpent())*10000000);
            }
        });
        return clientsList;
    }

    /**
     * @return the Hashmap of the products
     * added for unit testing
     */
    public HashMap<String, Product> getProductsHashMap(){
        return products;
    }

    /**
     * @return the HashMap of the clients
     * added for unit testing
     */
    public HashMap<String, Client> getClientHashMap(){
        return clients;
    }
}
