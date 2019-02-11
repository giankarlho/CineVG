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
            ResultSet rs = st.executeQuery("select NUMUBI, DISTUBI from ubigeo where PROVUBI='" + prov + "'");
            value = new DefaultComboBoxModel();
            while (rs.next()) {
                value.addElement(new Ubigeo(rs.getString("NUMUBI"), rs.getString("DISTUBI")));
            }
            Box.setModel(value);
            st.close();
            rs.close();
        } catch (Exception ex) {
            ex.getMessage();
            System.out.println(ex.getCause());
        }
    }

//    // para edición del ubigeo: actualizar
//    public void listar_provxDist(JComboBox box, String ubi) throws Exception {
//        box.removeAllItems();
//        try {
//            Statement st = this.conectar().createStatement();
//            ResultSet rs = st.executeQuery("select PROVUBI from ubigeo where NUMUBI='" + ubi + "'");
//            while (rs.next()) {
//                box.addItem(rs.getString("PROVUBI"));
//            }
//            st.close();
//            rs.close();
//        } catch (SQLException ex) {
//            ex.getMessage();
//            System.out.println(ex.getCause());
//        }
//    }
//
//    public void listar_distxUbigeo(JComboBox Box, String ubi) {
//        DefaultComboBoxModel value;
//        try {
//            Statement st = this.conectar().createStatement();
//            ResultSet rs = st.executeQuery("select NUMUBI, DISTUBI from ubigeo where NUMUBI='" + ubi + "'");
//            value = new DefaultComboBoxModel();
//            Box.setModel(value);
//            while (rs.next()) {
//                value.addElement(new Ubigeo(rs.getString("NUMUBI"), rs.getString("DISTUBI")));
//            }
//            st.close();
//            rs.close();
//        } catch (Exception ex) {
//            ex.getMessage();
//            System.out.println(ex.getCause());
//        }
//    }
//
//    public void listar_dptoxProv(JComboBox box, String ubi) throws Exception {
//        box.removeAllItems();
//        try {
//            Statement st = this.conectar().createStatement();
//            ResultSet rs = st.executeQuery("select DPTOUBI from ubigeo where NUMUBI='" + ubi + "'");
//            while (rs.next()) {
//                box.addItem(rs.getString("DPTOUBI"));
//            }
//            st.close();
//            rs.close();
//        } catch (SQLException ex) {
//            ex.getMessage();
//            System.out.println(ex.getCause());
//        }
//    }
//
//    public Ubigeo listarPorId(int id) throws Exception {
//        Ubigeo ubi = new Ubigeo();
//        try {
//            String sql = "SELECT * FROM UBIGEO WHERE NUMUBI=?";
//            PreparedStatement ps = this.conectar().prepareStatement(sql);
//            ps.setInt(1, id);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                ubi.setDptoUbi(rs.getString("DPTOUBI"));
//                ubi.setProvUbi(rs.getString("PROVUBI"));
//                ubi.setDistUbi(rs.getString("DISTUBI"));
//            }
//            rs.close();
//            ps.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return ubi;
//    }

}
