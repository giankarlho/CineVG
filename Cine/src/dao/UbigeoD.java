package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.Ubigeo;

public class UbigeoD extends Conexion{

    // método para listar los departamentos
    public void listar_dpto(JComboBox box) throws Exception {
        box.removeAllItems();
        try {
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery("select distinct DPTOUBI from ubigeo");
            while (rs.next()) {
                box.addItem(rs.getString("DPTOUBI"));
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {           
            System.out.println(ex.getCause() +  ex.getMessage());
        }
    }

    // listar las provincias cuando tenga el texto del departamento
    public void listar_prov(JComboBox box, String dpto) throws Exception {
        box.removeAllItems();
        try {
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery("select distinct PROVUBI from ubigeo where DPTOUBI='" + dpto + "'");
            while (rs.next()) {
                box.addItem(rs.getString("PROVUBI"));
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {            
            System.out.println(ex.getCause()+ex.getMessage());
        }
    }

    // obtener toda la lista de distritos cuando se escoge el texto de la provincia
    public void listar_dist(JComboBox Box, String prov) {
        DefaultComboBoxModel value;
        try {
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery("select idUbi, distUbi from ubigeo where provUbi='" + prov + "'");
            value = new DefaultComboBoxModel();
            while (rs.next()) {
                value.addElement(new Ubigeo(rs.getString("idUbi"), rs.getString("distUbi")));
            }
            Box.setModel(value);
            st.close();
            rs.close();
        } catch (Exception ex) {
            ex.getMessage();
            System.out.println(ex.getCause());
        }
    }

}
