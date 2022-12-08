import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String[] args) {
        try {
            Statement sql=connectionDB.getConnection().createStatement();
            String Consulta="SELECT * FROM Productos";
            ResultSet Resultado=sql.executeQuery(Consulta);
            while(Resultado.next()){
                System.out.println(Resultado.getString(1) + " - "+ Resultado.getString(2));
            }
        }
        catch (SQLException ex){
            System.out.println(ex);
        }
    }
}
