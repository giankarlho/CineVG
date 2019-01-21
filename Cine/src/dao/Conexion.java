package dao;

import java.sql.Connection;

public class Conexion {
    
    public static Connection cn = null;
    
    public static Connection conectar() throws Exception{
        return cn;
    }
    
    public static void cerrarCnx(){
        
    }
}
