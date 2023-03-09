package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static String url = "jdbc:mysql://127.0.0.1:3306/jardineria";
    private static String usu = "root";
    private static String clave = "Churrusken-7";
    private static Connection conex;
    //Este método mira si la conexión está abierta. Si es así, la devuelve sin más. Si no
    // está abierta, la crea y la devuelve
    public static Connection getConexion() throws SQLException {
        if (conex == null){
            conex = DriverManager.getConnection(url,usu,clave);
        }
        return conex;
    }
}
