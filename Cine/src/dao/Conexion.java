package dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection cnx = null;

    public static Connection conectar() throws Exception {
        if (cnx != null) {
            return cnx;
        }
        InputStream inputStream
                = Conexion.class.getClassLoader().getResourceAsStream("propiedades/db.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            String user = properties.getProperty("user");
            String pwd = properties.getProperty("pwd");
            String url = properties.getProperty("url");
            String driver = properties.getProperty("driver");
            Class.forName(driver).newInstance();
            cnx = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el: " + ex.getMessage());
        }
        return cnx;
    }

    public static void cerrarCnx() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }

    public static void main(String[] args) throws Exception {
        conectar();
        if (cnx != null) {
            System.out.println("abierta");
        } else {
            System.out.println("cerrada");
        }
    }
}
