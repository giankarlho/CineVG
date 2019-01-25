package dao;

import java.sql.Connection;

public class Conexion {
    
    public static Connection cn = null;
    
    public static Connection conectar() throws Exception{
        String user="";
        String pwd = "";
        String url ="";
        String driver ="";
        return cn;
    }
    
    public static void cerrarCnx(){
        
    }
}
