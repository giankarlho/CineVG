package dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

    public static Connection cnx = null;

    public static Connection conectar() throws Exception {
        InputStream inputStream
            = Conexion.class.getClassLoader().getResourceAsStream("propiedades/db.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            String user = properties.getProperty("user");
            String pwd = properties.getProperty("pwd");
            String url = properties.getProperty("url");
            String driver = properties.getProperty("driver");
            Class.forName(driver);
            cnx = DriverManager.getConnection(url, user, pwd);
        } catch (Exception e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
        return cnx;
 
    }
    
    public static Connection getCnx() {
        return cnx;
    }

    public static void setCnx(Connection cnx) {
        Conexion.cnx = cnx;
    }
    
    

    public static void cerrarCnx() throws SQLException {
        if(cnx!=null){
            cnx.close();
        }
    }
}
