package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import model.Pelicula;

public class PeliculaImpl extends Conexion implements IPelicula {

    public static int cantidad;

    @Override
    public void registrar(Pelicula pelicula) throws Exception {
        try {
            String sql = "INSERT INTO PELICULA (NOMPELI,GENPELI,CLAPELI,TIPPELI,IDIPELI,DURPELI) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, pelicula.getNomPeli());
            ps.setString(2, pelicula.getGenPeli());
            ps.setString(3, pelicula.getClaPeli());
            ps.setString(4, pelicula.getTipPeli());
            ps.setString(5, pelicula.getIdiPeli());
            ps.setString(6, pelicula.getDurPeli());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void modificar(Pelicula pelicula) throws Exception {
        try {
            String sql = "UPDATE PELICULA SET GENPELI = ? , IDIPELI = ?, DURPELI = ?, TIPPELI = ?, CLAPELI = ?, NOMPELI = ?  WHERE IDPELI = ?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, pelicula.getGenPeli());
            ps.setString(2, pelicula.getIdiPeli());
            ps.setString(3, pelicula.getDurPeli());
            ps.setString(4, pelicula.getTipPeli());
            ps.setString(5, pelicula.getClaPeli());
            ps.setString(6, pelicula.getNomPeli());
            ps.setInt(7, pelicula.getIdPeli());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void eliminar(Pelicula pelicula) throws Exception {
        try {
            String sql = "DELETE FROM PELICULA WHERE IDPELI = ?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, pelicula.getIdPeli());
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
                sql = "select * from pelicula";
                break;
            case 2:
                sql = "select * from pelicula where genpeli like '%" + dato + "%'";
                break;
            case 3:
                sql = "select * from pelicula where tippeli like '%" + dato + "%'";
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
