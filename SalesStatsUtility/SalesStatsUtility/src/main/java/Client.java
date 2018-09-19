import java.util.Objects;

/**
 * Class Client is a blueprint for each client
 * Behaviour is configured to serve the SalesStatistic objects (ie setters are modified to facilitate their use by
 * SalesStatistics with respect to the given scope of the project)
 */
public class Client {
    private String name;
    private int numberOfOrders;
    // i used double here because i was under the impression that a sale can contain more than one item
    // this turned out to be useful for me because i encountered a problem in the Comparator in SalesStatistics class
    // and learned something :))
    private double totalAmountSpent;

    /**
     * Constructor receives only the client name
     * Could have an impact on hashCode generation
     *
     * @param name represent the Client name
     *             String type argument
     */
    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders++;
    }

    public double getTotalAmountSpent() {
        return totalAmountSpent;
    }

    public void setTotalAmountSpent(double newAmountSpent) {
        this.totalAmountSpent += newAmountSpent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return getNumberOfOrders() == client.getNumberOfOrders() &&
                Double.compare(client.getTotalAmountSpent(), getTotalAmountSpent()) == 0 &&
                Objects.equals(getName(), client.getName());
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 21 * result + getNumberOfOrders();
        result = (int) (21 * result + getTotalAmountSpent());
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", numberOfOrders=" + numberOfOrders +
                ", totalAmountSpent=" + totalAmountSpent +
                '}';
    }
}
