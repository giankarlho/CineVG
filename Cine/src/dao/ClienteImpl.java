package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

public class ClienteImpl extends Conexion implements ICliente {

    public static int cantidad;
    
    @Override
    public void registrar(Cliente cliente) throws Exception {
        try {            
//            String sql = "INSERT INTO CLIENTE (NOMCLI,APECLI,NACCLI) VALUES (?,?,TO_DATE(?,'DD/MM/YYYY')";
            String sql = "INSERT INTO CLIENTE (NOMCLI,APECLI,NACCLI) VALUES (?,?,?)";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, cliente.getNomCli());
            ps.setString(2, cliente.getApeCli());
            ps.setDate(3, cliente.getNacCli());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void modificar(Cliente cliente) throws Exception {
        try {
            this.conectar();
            String sql = "UPDATE CLIENTE SET NOMCLI = ? , APECLI = ?, NACCLI = ?  WHERE IDCLI = ?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, cliente.getNomCli());
            ps.setString(1, cliente.getApeCli());
            ps.setDate(3, cliente.getNacCli());
            ps.setInt(4, cliente.getIdCli());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void eliminar(Cliente cliente) throws Exception {
        try {
            this.conectar();
            String sql = "DELETE FROM CLIENTE WHERE IDCLI = ?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, cliente.getIdCli());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }
 
    
        public void buscar(DefaultTableModel modelo, Integer tipo, String dato) throws Exception {
        // 1: todos, 2: nombre, 3: ruc, 4: apellido
        String sql = "";
        switch (tipo) {
            case 1:
                sql = "select * from cliente";
                break;
            case 2:
                sql = "select * from cliente where nomCli like '%" + dato + "%'";
                break;
            case 3:
                sql = "select * from cliente where apeCli like '%" + dato + "%'";
                break;            
        }
        String datos[] = new String[4];
        Statement st = this.conectar().createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            for (int i = 0; i < 4; i++) {
                datos[i] = rs.getString(i + 1);
            }
            modelo.addRow(datos);
            cantidad++;
        }
        rs.close();
        st.close();
    }

}
