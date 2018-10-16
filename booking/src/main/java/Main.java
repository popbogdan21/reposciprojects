import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Main builds a new database on the server
 * Creates table in the new database
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        DBUtil dbUtil = new DBUtil();

        //creating the database
        Connection connection1 = dbUtil.connection("");
        if (connection1 == null) {
            return;
        }
        Statement statement1 = null;
        statement1 = connection1.createStatement();
        statement1.executeUpdate("create database booking;");
        try {
            connection1.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //connecting to the DB
        Connection connection = dbUtil.connection("booking");
        Statement statement = null;
        if (connection == null) {
            return;
        }
        statement = connection.createStatement();
        // autocommit is off
        connection.setAutoCommit(false);
        statement.executeUpdate("create sequence accomodation_seq;");
        statement.executeUpdate("create table accomodation ("
                + "id numeric primary key not null default nextval('accomodation_seq'),"
                + "type varchar(32),"
                + "bed_type varchar(32),"
                + "max_guests int,"
                + "description varchar(512));");
        statement.executeUpdate("create sequence room_fair_seq;");
        statement.executeUpdate("create table room_fair(" +
                "id numeric primary key not null default nextval('room_fair_seq')," +
                "value double precision," +
                "season varchar(32));");
        statement.executeUpdate("create sequence accomodation_fair_relation_seq");
        statement.executeUpdate("create table accomodation_fair_relation(" +
                "id numeric primary key not null default nextval('accomodation_fair_relation_seq')," +
                "id_accomodation int,id_room_fair int, " +
                "FOREIGN KEY (id_accomodation) REFERENCES accomodation(id)," +
                "FOREIGN KEY (id_room_fair) REFERENCES room_fair(id))");
        // commit of statements
        connection.commit();
        connection.setAutoCommit(true);
        try {
            connection.close();
        } catch (SQLException e) {
        }
    }
}

