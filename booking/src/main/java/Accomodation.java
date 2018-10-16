/**
 * Used to simulate an entry in the accomodation table from the DB
 * Methods are self explanatory
 * There is no class simulating the table  accomodation_fair_relation due tot the fact that the values can be
 * generated form the valus in this class and RoomFair
 * Please consult the DBUtilTest CLass
 */
public class Accomodation {
    private int id;
    private String type;
    private String bed_type;
    private int max_guests;
    private String description;

    /**
     * @param id          The idetificator of the accomodation
     * @param type        The room type
     * @param bed_type    The bed type
     * @param max_guests  The maximum number of allowed guests
     * @param description The description of the room
     */
    public Accomodation(int id, String type, String bed_type, int max_guests, String description) {
        this.id = id;
        this.type = type;
        this.bed_type = bed_type;
        this.max_guests = max_guests;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getBed_type() {
        return bed_type;
    }

    public int getMax_guests() {
        return max_guests;
    }

    public String getDescription() {
        return description;
    }

}
