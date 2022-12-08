import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDB {
    public static Connection getConnection() {
        String connectionUrl = "jdbc:sqlserver://pruebarjcm1.database.windows.net;"
                + "database=prueba1;"
                + "user=ricardo;"
                + "password=Abc123!#;"
                + "encrypt=true;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";
        try {
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
}
