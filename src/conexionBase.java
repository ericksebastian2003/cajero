import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionBase {
    public Connection conexionBases(){

        String url = "jdbc:mysql://localhost:3306/cajeroBD";
        String usuarioDB="root";
        String password ="";
        try {
            Connection conexion = DriverManager.getConnection(url, usuarioDB, password);
            JOptionPane.showMessageDialog(null,"Con exito");
            return conexion;
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null,"La conexión no se realizó de manera correcta");

            return null;
        }
    }
}
