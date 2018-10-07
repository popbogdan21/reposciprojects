/**
 * Used to hold the index of particular ticket types tha have passed through the gate
 */
public class AttendeeIndex {
    private int index;

    /**
     * Every new AttendeeIndex created has to Start at 1
     */
    public AttendeeIndex() {
        this.index = 1;
    }

    /**
     * @return an int value representing the current index
     */
    public int getIndex() {
        return index;
    }

    /**
     * Increases the index by one
     */
    public void increment() {
        this.index++;
    }

    /**
     * @return a String representing the current index
     */
    @Override
    public String toString() {
        return Integer.toString(index);
    }
}
