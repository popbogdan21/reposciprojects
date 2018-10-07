import java.util.Map;

/**
 * Generates the statistics for the FestivalStatisticThread
 */
public class StatsBuilder {
    private FestivalGate gate;

    /**
     * @param gate represents the gate used at the Festival through which the attendees pass
     */
    public StatsBuilder(FestivalGate gate) {
        this.gate = gate;
    }

    /**
     * Gathers the values from the gate at the required moment and prints them to the frame
     */
    public void getStats() {
        int sum = 0;
        sum = 0;
        String nl = System.getProperty("line.separator");
        if (!gate.getGateRegistry().isEmpty()) {
            for (Map.Entry<TicketType, AttendeeIndex> entry : this.gate.getGateRegistry().entrySet()) {
                sum += entry.getValue().getIndex();
            }
            String out;
            out = nl + "------------------------------";
            out += nl + sum + " people entered! " + nl;
            for (Map.Entry<TicketType, AttendeeIndex> entry : this.gate.getGateRegistry().entrySet()) {
                sum += entry.getValue().getIndex();
                out += entry.getValue() + " have " + entry.getKey() + " passes " + nl;
            }
            out += nl + "------------------------------" + nl;
            //usage for static reference in Main
            Main.textArea.append(out);
        }
    }
}

