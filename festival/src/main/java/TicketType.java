import java.util.Random;

/**
 * Contains the available Festival Ticket Types
 */
public enum TicketType {
    FULL, FULLVIP, FREEPASS, ONEDAY, ONEDAYVIP;

    /**
     * Method used to generate a random TicketType;
     *
     * @return generated random TicketType;
     * Static due to the fact that ENUM cannot be instantiated
     * Static could be avoided by using a separate class that can be instantiated and
     * that would contain the getTicket method
     */
    public static TicketType getTicket() {
        Random random = new Random();
        int randomPosition = random.nextInt(TicketType.values().length);
        return TicketType.values()[randomPosition];
    }
}
