package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;

public class ClienteImpl extends Conexion implements ICliente {

    @Override
    public void registrar(Cliente cliente) throws Exception {
        try {
            this.conectar();
            String sql = "INSERT INTO CLIENTE (NOMCLI,APECLI,NACCLI) VALUES (?,?,TO_DATE(?,'DD/MM/YYYY')";
            PreparedStatement ps = this.getCnx().prepareStatement(sql);
            ps.setString(1, cliente.getNomCli());
            ps.setString(2, cliente.getApeCli());
            ps.setDate(3, cliente.getNacCli());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void modificar(Cliente cliente) throws Exception {
        try {
            this.conectar();
            String sql = "UPDATE CLIENTE SET NOMCLI = ? , APECLI = ?, NACCLI = ?  WHERE IDCLI = ?";
            PreparedStatement ps = this.getCnx().prepareStatement(sql);
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
            PreparedStatement ps = this.getCnx().prepareStatement(sql);
            ps.setInt(1, cliente.getIdCli());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Cliente> listar(){
        List<Cliente> lista = null;
        ResultSet rs;
        try {
            this.conectar();
            String sql = "SELECT * FROM CLIENTE";
            PreparedStatement ps = this.getCnx().prepareCall(sql);
            rs = ps.executeQuery();
            lista = new ArrayList();
            Cliente cm;
            while(rs.next()){
                cm = new Cliente();                
                cm.setIdCli(rs.getInt("IdCli"));
                cm.setNomCli(rs.getString("NomCli"));
                cm.setApeCli(rs.getString("ApeCli"));
                cm.setNacCli(rs.getDate("NacCli"));
                lista.add(cm);
            }
        } catch (Exception e) {
            try {
                throw e;
            } catch (Exception ex) {
                Logger.getLogger(ClienteImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

}
