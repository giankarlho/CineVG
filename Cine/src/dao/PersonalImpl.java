package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import model.Personal;

public class PersonalImpl extends Conexion implements IPersonal {

    public static int cantidad;
    
    @Override
    public void registrar(Personal personal) throws Exception {
        try {            
            String sql = "INSERT INTO PERSONAL (NomPer,ApePer,DniPer,DirPer,TipPer,SexPer,UsuPer,PwdPer,IdUbi)";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, personal.getNomPer());
            ps.setString(2, personal.getApePer());
            ps.setString(3, personal.getDniPer());
            ps.setString(4, personal.getDirPer());
            ps.setString(5, personal.getTipPer());
            ps.setString(6, personal.getSexPer());
            ps.setString(7, personal.getUsuPer());
            ps.setString(8, personal.getPwdPer());
            ps.setString(9, personal.getIdUbi());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public void modificar(Personal personal) throws Exception {
        try {            
            String sql = "UPDATE PERSONAL SET NomPer=?,ApePer=?,DniPer=?,DirPer=?,TipPer=?,SexPer=?,UsuPer=?,PwdPer=?,IdUbi=?  WHERE IdPer = ?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, personal.getNomPer());
            ps.setString(2, personal.getApePer());
            ps.setString(3, personal.getDniPer());
            ps.setString(4, personal.getDirPer());
            ps.setString(5, personal.getTipPer());
            ps.setString(6, personal.getSexPer());
            ps.setString(7, personal.getUsuPer());
            ps.setString(8, personal.getPwdPer());
            ps.setString(9, personal.getIdUbi());
            ps.setInt(10, personal.getIdPer());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void eliminar(Personal personal) throws Exception {
        try {            
            String sql = "DELETE FROM PERSONAL WHERE IdPer = ?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, personal.getIdPer());
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
                sql = "select * from PERSONAL";
                break;
            case 2:
                sql = "select * from PERSONAL where nomCli like '%" + dato + "%'";
                break;
            case 3:
                sql = "select * from PERSONAL where apeCli like '%" + dato + "%'";
                break;
            case 4:
                sql = "select * from PERSONAL where apeCli like '%" + dato + "%'";
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
