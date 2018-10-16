import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Used to access the data from the DB
 * Uses DBUtil and Booking
 */
public class BookingDAO {
    Connection connection;

    /**
     * @param connection the connection to the DB
     */
    public BookingDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * @return a list of Bookings that represents the room types and prices during each season
     * @throws SQLException Uses JOIN
     */
    public List<Booking> getAllAsList() throws SQLException {
        List<Booking> bookings = new ArrayList<>();
        if (connection == null) {
            System.out.println("No connection");
        } else {
            Statement st = connection.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT type,room_fair.value, room_fair.season FROM accomodation " +
                    "INNER JOIN accomodation_fair_relation on accomodation_fair_relation.id_accomodation=accomodation.id " +
                    "INNER JOIN room_fair on room_fair.id=accomodation_fair_relation.id_room_fair;");
            while (resultSet.next()) {
                Booking booking = new Booking();
                booking.setType(resultSet.getString("type"));
                booking.setValue(resultSet.getDouble("value"));
                booking.setSeason(resultSet.getString("season"));
                bookings.add(booking);
            }
        }
        return bookings;
    }
}
