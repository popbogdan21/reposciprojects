import org.junit.jupiter.api.Assertions;

import javax.xml.soap.SAAJMetaFactory;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Sales statistics
 */
class SalesStatisticTest {

    @org.junit.jupiter.api.Test
    void addSale() {
        // initialisation of sale
        Sale sale= new Sale(2,"AppleSmartphone",100,"John");
        //initialisation of product
        Product pr1= new Product("AppleSmartphone");
        pr1.setUnitsSold(2);
        //initialisation of client
        Client client1=new Client("John");
        client1.setTotalAmountSpent(sale.getOrderNr()*sale.getPrice());
        client1.setNumberOfOrders(client1.getNumberOfOrders());
        //initialisation of expected HashMaps
        HashMap<String,Product> productsListHashMap= new HashMap<>();
        HashMap<String,Client> clientListHashMap= new HashMap<>();

        productsListHashMap.put(pr1.getProductName(),pr1);
        clientListHashMap.put(client1.getName(),client1);

        //sale initialisation
        SalesStatistic salesStatistic= new SalesStatistic();
        salesStatistic.addSale(sale);

        Assertions.assertEquals(clientListHashMap,salesStatistic.getClientHashMap());
        Assertions.assertEquals(productsListHashMap,salesStatistic.getProductsHashMap());
    }

    @org.junit.jupiter.api.Test
    void getProductStatistics() {
        //generating unsorted Product collection
        HashMap<String,Product> productsListHashMap= new HashMap<>();
        List<Product> productsList= new ArrayList<>();
        Product pr1= new Product("AppleSmartphone");
        pr1.setUnitsSold(20);
        productsListHashMap.put(pr1.getProductName(),pr1);
        Product pr2= new Product("SamsungSmartphone");
        pr2.setUnitsSold(10);
        productsListHashMap.put(pr2.getProductName(),pr2);
        Product pr3= new Product("HuaweiSmartphone");
        pr3.setUnitsSold(30);
        productsListHashMap.put(pr3.getProductName(),pr3);
       // generating expected list
        List<Product> expectedProductsList= new ArrayList<>();
        Product exPr1=new Product ("HuaweiSmartphone");
        exPr1.setUnitsSold(30);
        expectedProductsList.add(exPr1);
        Product exPr2=new Product ("AppleSmartphone");
        exPr2.setUnitsSold(20);
        expectedProductsList.add(exPr2);
        Product exPr3=new Product ("SamsungSmartphone");
        exPr3.setUnitsSold(10);
        expectedProductsList.add(exPr3);
        SalesStatistic salesStatistic= new SalesStatistic();
        Assertions.assertEquals(expectedProductsList, salesStatistic.getProductStatistics(productsListHashMap));
    }

    @org.junit.jupiter.api.Test
    void getClientStatisticsByOrders() {
        //building expected client HashMap
        Client client1=new Client("John");
        client1.setNumberOfOrders(1);
        client1.setTotalAmountSpent(100);
        Client client2=new Client("John");
        client2.setNumberOfOrders(client1.getNumberOfOrders());
        client2.setTotalAmountSpent(200);
        Client client3=new Client("Jane");
        client3.setTotalAmountSpent(100);
        client3.setNumberOfOrders(1);
        HashMap<String,Client> clientListHashMap= new HashMap<>();
        clientListHashMap.put(client3.getName(),client3);
        clientListHashMap.put(client1.getName(),client1);
        clientListHashMap.get(client1.getName()).setTotalAmountSpent(200);
        clientListHashMap.get(client1.getName()).setNumberOfOrders(1);
        //generating sales to be added to the statistics
        Sale sale= new Sale(1,"AppleSmartphone",100,"John");
        Sale sale2= new Sale(1,"AppleSmartphone",100,"Jane");
        Sale sale3= new Sale(1,"AppleSmartphone",200,"John");
        SalesStatistic salesStatistic= new SalesStatistic();
        salesStatistic.addSale(sale);
        salesStatistic.addSale(sale2);
        salesStatistic.addSale(sale3);
        //Hash Map to Collection  for comparison
        Collection<Client> clientscollections = clientListHashMap.values();
        List<Client> clientscollections1 =new ArrayList<>();
        int i=0;
        for(Map.Entry<String,Client>entry :clientListHashMap.entrySet()){
            clientscollections1.add(i,(Client) entry.getValue());
        }
        Collections.sort(clientscollections1, new Comparator<Client>() {
            @Override
            public int compare(Client o1, Client o2) {
                if (o2.getTotalAmountSpent() > o1.getTotalAmountSpent()) {
                    return 1;
                }
                if (o2.getTotalAmountSpent() < o1.getTotalAmountSpent()) {
                    return -1;
                }
                return 0;
            }
        });
        Assertions.assertEquals(clientscollections1, salesStatistic.getClientStatisticsByAmountSpent());

    }

    @org.junit.jupiter.api.Test
    void getClientStatisticsByAmountSpent() {
        //building expected client HashMap
        Client client1=new Client("John");
        client1.setNumberOfOrders(1);
        client1.setTotalAmountSpent(100);
        Client client3=new Client("Jane");
        client3.setTotalAmountSpent(200);
        client3.setNumberOfOrders(1);
        HashMap<String,Client> clientListHashMap= new HashMap<>();
        clientListHashMap.put(client3.getName(),client3);
        clientListHashMap.put(client1.getName(),client1);
        //generating sales to be added to the statistics
        Sale sale= new Sale(1,"AppleSmartphone",100,"John");
        Sale sale2= new Sale(1,"AppleSmartphone",200,"Jane");
        SalesStatistic salesStatistic= new SalesStatistic();
        salesStatistic.addSale(sale);
        salesStatistic.addSale(sale2);
        //Hash Map to Collection  for comparison
        List<Client> clientscollections =new ArrayList<>();
        int i=0;
        for(Map.Entry<String,Client>entry :clientListHashMap.entrySet()){
            clientscollections.add(i,(Client) entry.getValue());
        }
        //needs cast else test fails, with identical values
        Assertions.assertEquals(clientscollections, salesStatistic.getClientStatisticsByAmountSpent());
    }
}