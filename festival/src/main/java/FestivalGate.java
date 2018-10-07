import java.util.HashMap;

/**
 * FestivalGate simulates the gate through which Festival attendees pass
 */
public class FestivalGate {
    private HashMap<TicketType, AttendeeIndex> gateRegistry = new HashMap<>();

    public FestivalGate() {
    }

    /**
     * @param attendee The thread which represent the attendee
     *                 that has to pass through the gate
     *                 Method has a synchronized sequence that allow only one attendee(thread) to pass through the gate
     */
    public void validateTicket(FestivalAttendeeThread attendee) {
        String nl = System.getProperty("line.separator");
        //only one person can pass through
        synchronized (this) {
            try {
                //Using sleep for the  FestivalAttendeeThread to simulate gate passage
                Thread.currentThread().sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (gateRegistry.containsKey(attendee.getTicketType())) {
                gateRegistry.get(attendee.getTicketType()).increment();
            } else {
                gateRegistry.put(attendee.getTicketType(), new AttendeeIndex());
            }
            //usage of static reference in Main
            Main.textArea.append("A person with a " + attendee.getTicketType() + "  passed through the gate from " +
                    Thread.currentThread().getName() + nl);
        }
    }

    /**
     * @return a HashMap containing the info regarding the persons which have passed through the gate
     */
    public HashMap<TicketType, AttendeeIndex> getGateRegistry() {
        return gateRegistry;
    }
}
