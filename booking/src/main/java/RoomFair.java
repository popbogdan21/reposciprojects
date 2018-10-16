/**
 * Used to simulate an entry in the room_fair table from the DB
 * * Methods are self explanatory
 * * There is no class simulating the table  accomodation_fair_relation due tot the fact that the values can be
 * * generated form the valus in this class and RoomFair
 * * Please consult the DBUtilTest CLass
 */
public class RoomFair {
    private int id;
    private double value;
    private String season;

    /**
     * @param id     The fair id
     * @param value  The price
     * @param season The season type
     */
    public RoomFair(int id, double value, String season) {
        this.id = id;
        this.value = value;
        this.season = season;
    }

    public int getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public String getSeason() {
        return season;
    }
}
