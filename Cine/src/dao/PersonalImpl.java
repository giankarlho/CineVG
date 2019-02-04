package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Personal;

public class PersonalImpl extends Conexion implements IPersonal {

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
            this.conectar();
            String sql = "DELETE FROM PERSONAL WHERE IdPer = ?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, personal.getIdPer());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Personal> listar() {
        List<Personal> lista = null;
        ResultSet rs;
        try {            
            String sql = "SELECT * FROM PERSONAL";
            PreparedStatement ps = this.conectar().prepareCall(sql);
            rs = ps.executeQuery();
            lista = new ArrayList();
            Personal cm;
            while (rs.next()) {
                cm = new Personal();
                cm.setIdPer(rs.getInt("IdPer"));
                cm.setNomPer(rs.getString("NomPer"));
                cm.setApePer(rs.getString("ApePer"));
                cm.setDniPer(rs.getString("DniPer"));
                cm.setDirPer(rs.getString("DirPer"));
                cm.setTipPer(rs.getString("TipPer"));
                cm.setSexPer(rs.getString("SexPer"));
                cm.setUsuPer(rs.getString("UsuPer"));
                cm.setPwdPer(rs.getString("PwdPer"));
                cm.setIdUbi(rs.getString("IdUbi"));
                lista.add(cm);
            }
        } catch (Exception e) {
            try {
                throw e;
            } catch (Exception ex) {
                Logger.getLogger(PersonalImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }
}
