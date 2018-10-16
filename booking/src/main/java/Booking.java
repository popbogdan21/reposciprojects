/**
 * Class is used to simulate the requested results
 * Methods are self explanatory
 */
public class Booking {
    String type;
    Double value;
    String season;


    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
