package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import model.Sala;

public class SalaImpl extends Conexion implements ISala {

    public static int cantidad;
    
    @Override
    public void registrar(Sala sala) throws Exception {
        try {
            String sql = "INSERT INTO SALA (numSala,capSala) VALUES (?,?)";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, sala.getNumSala());
            ps.setInt(2, sala.getCapSala());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void modificar(Sala sala) throws Exception {
        try {
            String sql = "UPDATE SALA SET numSala = ? , capSala = ?  WHERE idSala = ?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, sala.getNumSala());
            ps.setInt(2, sala.getCapSala());
            ps.setInt(3, sala.getIdSala());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void eliminar(Sala sala) throws Exception {
        try {
            String sql = "DELETE FROM SALA WHERE idSala = ?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, sala.getIdSala());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }

        public void buscar(DefaultTableModel modelo, Integer tipo, String dato) throws Exception {
        // 1: todos, 2: nombre, 3: ruc
        String sql = "";
        switch (tipo) {
            case 1:
                sql = "select * from sala";
                break;
            case 2:
                sql = "select * from sala where numSala like '%" + dato + "%'";
                break;
            case 3:
                sql = "select * from sala where capSala like '%" + dato + "%'";
                break;
        }
        String datos[] = new String[3];
        Statement st = this.conectar().createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            for (int i = 0; i < 3; i++) {
                datos[i] = rs.getString(i + 1);
            }
            modelo.addRow(datos);
            cantidad++;
        }
        rs.close();
        st.close();
    }
}
