public class FestivalAttendeeThread implements Runnable {
    private TicketType ticketType;
    private FestivalGate festivalGate;

    /**
     * @return the TicketType of the attendee
     */
    public TicketType getTicketType() {
        return ticketType;
    }

    /**
     * @param ticketType the ticket which the attendee has been assigned by the getTicket() method in class TicketType
     * @param festivalGate the gate onto which the Attendee will pass
     *                     this was a requirement in the assignment
     */
    public FestivalAttendeeThread(TicketType ticketType, FestivalGate festivalGate) {
        this.ticketType = ticketType;
        this.festivalGate = festivalGate;
    }

    /**
     * Method that validates the ticket
     * Calls a method from FestivalGate class
     */
    public void run() {
            this.festivalGate.validateTicket(this);
        }
    }

