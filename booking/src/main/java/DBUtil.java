import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Establishes a connection with the server and the DB
 * In order to function it one should modify pw field with their own password
 */
public class DBUtil {

    private final String type = "postgresql";
    private final String host = "localhost";
    private final String port = "5432";
    private String dbName = "";
    private String user = "postgres";
    //PLEASE INPUT YOUR PASSWORD
    private String pw = "THIS IS WHERE YOU SHOULD PUT YOUR PASSWORD";


    /**
     * @param dbName represents the DB u are trying to establish a connection with
     *               If the String is "" the the connection is with the default template
     *               I used this in Main to create the new database booking
     * @return the connection
     */
    public Connection connection(String dbName) {
        try {
            Class.forName("org.postgresql.Driver").newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }
        this.dbName = dbName;
        DriverManager.setLoginTimeout(60);
        Connection conn = null;
        try {
            String url = new StringBuilder()
                    .append("jdbc:")
                    .append(type)
                    .append("://")
                    .append(host)
                    .append(":")
                    .append(port)
                    .append("/")
                    .append(dbName)
                    .append("?user=")
                    .append(user)
                    .append("&password=")
                    .append(pw).toString();
            conn = (Connection) DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println("Cannot connect to the database: " + e.getMessage());
        }
        return conn;
    }

}


