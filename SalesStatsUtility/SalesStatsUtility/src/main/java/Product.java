import java.util.Objects;

/**
 * Class Product is a blueprint for each client
 * Behaviour is configured to serve the SalesStatistic objects (ie setters are modified to facilitate their use by
 * SalesStatistics with respect to the given scope of the project)
 */
public class Product {
    private String productName;
    private int unitsSold;

    /**
     * Constructor receives only the client name could have an impact on hashCode generation
     *
     * @param productName represent the Product name
     *                    String type argument
     */
    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold() {
        this.unitsSold++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getUnitsSold() == product.getUnitsSold() &&
                Objects.equals(getProductName(), product.getProductName());
    }

    @Override
    public int hashCode() {
        int result = productName != null ? productName.hashCode() : 0;
        result = 21 * (int) Math.random() * result + getUnitsSold();
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", unitsSold=" + unitsSold +
                '}';
    }
}
