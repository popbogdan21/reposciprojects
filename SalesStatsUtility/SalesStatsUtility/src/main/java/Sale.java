public class Sale {
    private int orderNr;
    private String productName;
    private int price;
    private String clientName;

    public Sale(int orderNr, String product, int price, String clientName) {
        this.orderNr = orderNr;
        this.productName = product;
        this.price = price;
        this.clientName = clientName;
    }

    public int getOrderNr() {
        return orderNr;
    }

    public void setOrderNr(int orderNr) {
        this.orderNr = orderNr;
    }

    public String getProduct() {
        return productName;
    }

    public void setProduct(String product) {
        this.productName = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
