import org.junit.Before;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Performs the insert and print operations from DB
 */
public class DBUtilTest {
    private List<Accomodation> accomodations = new ArrayList<>();
    private List<RoomFair> roomFairs = new ArrayList<>();

    /**
     * @throws Exception Populates the accomodations and roomFairs list that will be used in the insertIntoDB
     */
    @Before
    public void setUp() throws Exception {
        accomodations.add(new Accomodation(1, "Single", "single", 1, "Single Room"));
        accomodations.add(new Accomodation(2, "Double", "double", 2, "Double Room"));
        accomodations.add(new Accomodation(3, "Premier", "double", 2, "Premier Room"));
        accomodations.add(new Accomodation(4, "Double Twin", "twin", 2, "Twin Double Room"));
        accomodations.add(new Accomodation(5, "Family", "double+single", 3, "Double Room"));
        accomodations.add(new Accomodation(6, "Deluxe", "kingsize", 2, "Deluxe Room"));
        roomFairs.add(new RoomFair(1, 100, "peak season"));
        roomFairs.add(new RoomFair(2, 50, "extra season"));
        roomFairs.add(new RoomFair(3, 200, "peak season"));
        roomFairs.add(new RoomFair(4, 100, "extra season"));
        roomFairs.add(new RoomFair(5, 250, "peak season"));
        roomFairs.add(new RoomFair(6, 125, "extra season"));
        roomFairs.add(new RoomFair(7, 200, "peak season"));
        roomFairs.add(new RoomFair(8, 100, "extra season"));
        roomFairs.add(new RoomFair(9, 300, "peak season"));
        roomFairs.add(new RoomFair(10, 150, "extra season"));
        roomFairs.add(new RoomFair(11, 400, "peak season"));
        roomFairs.add(new RoomFair(12, 200, "extra season"));
    }


    /**
     * Inserts the data from the Lists in the DB
     * For the purpose of this exercise the rooms have only two types of fairs
     * peak season and extra season
     * The insert algorithm is structured this way because for every record
     * in table accomodation it will insert two coresponding records in room_fair and
     * accomodation_fair_relation
     * Uses PreparedStatement as requested
     * Uses DBUtil
     */
    @org.junit.Test
    public void insertIntoDB() {
        DBUtil dbUtil = new DBUtil();
        Connection conn = dbUtil.connection("booking");
        if (conn == null)
            return;
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        PreparedStatement ps3 = null;
        try {
            ps = conn.prepareStatement("insert into accomodation" +
                    " (id, type, bed_type, max_guests, description) values (?, ?, ?, ?, ?)");
            ps2 = conn.prepareStatement("insert into room_fair (id, value, season) values (?, ?, ?)");
            ps3 = conn.prepareStatement("insert into accomodation_fair_relation " +
                    "(id, id_accomodation, id_room_fair) values (?, ?, ?)");
            int step = 0;
            for (int i = 0; i < accomodations.size(); i++) {
                ps.setInt(1, accomodations.get(i).getId());
                ps.setString(2, accomodations.get(i).getType());
                ps.setString(3, accomodations.get(i).getBed_type());
                ps.setInt(4, accomodations.get(i).getMax_guests());
                ps.setString(5, accomodations.get(i).getDescription());
                ps2.setInt(1, roomFairs.get(i + step).getId());
                ps2.setDouble(2, roomFairs.get(i + step).getValue());
                ps2.setString(3, roomFairs.get(i + step).getSeason());
                ps3.setInt(1, i + step);
                ps3.setInt(2, accomodations.get(i).getId());
                ps3.setInt(3, roomFairs.get(i + step).getId());
                ps.executeUpdate();
                ps2.executeUpdate();
                ps3.executeUpdate();
                //step is used to insert two values in room_fair coresponding to the fair for the room in accomodation
                //for each season
                step++;
                ps2.setInt(1, roomFairs.get(i + step).getId());
                ps2.setDouble(2, roomFairs.get(i + step).getValue());
                ps2.setString(3, roomFairs.get(i + step).getSeason());
                ps3.setInt(1, i + step);
                ps3.setInt(2, accomodations.get(i).getId());
                ps3.setInt(3, roomFairs.get(i + step).getId());
                ps2.executeUpdate();
                ps3.executeUpdate();
            }
        } catch (SQLException e) {
            System.err.println("Cannot insert database: " + e.getMessage());
        } finally {
            if (ps != null) try {
                ps.close();
            } catch (SQLException e) {
            }
        }
    }

    /**
     * @throws SQLException Collects data from the DB and prints it out to the console
     *                      Uses DBUtil, BookingDao and Booking
     */
    @org.junit.Test
    public void extractFromDB() throws SQLException {
        DBUtil dbUtil = new DBUtil();
        Connection conn = dbUtil.connection("booking");
        if (conn == null)
            return;
        BookingDAO bookingDAO = new BookingDAO(conn);
        List<Booking> bookingTypes = bookingDAO.getAllAsList();
        for (Booking b : bookingTypes) {
            System.out.println("Room type:" + b.getType() + " -- price: " +
                    b.getValue().toString() + " -- during: " + b.getSeason());
        }
    }
}