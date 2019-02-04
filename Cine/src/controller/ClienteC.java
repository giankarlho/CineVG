package controller;

import dao.ClienteImpl;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import vistas.panels.ClienteView;

public class ClienteC {

    Cliente cliente = new Cliente();
    List<Cliente> lstCliente;
    ClienteImpl dao;

    public ClienteC() {

    }

    public void registrarCliente() throws Exception {
        dao = new ClienteImpl();
        try {
            dao.registrar(cliente);
//            listarCliente();
        } catch (Exception e) {
            System.out.println("Error en registrarCliente ClienteC " + e.getMessage());
        }
    }

    public void eliminarCliente() throws Exception {
        ClienteImpl dao;
        try {
            dao = new ClienteImpl();
            dao.eliminar(cliente);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarCliente() throws Exception {
        ClienteImpl dao;
        try {
            dao = new ClienteImpl();
            dao.modificar(cliente);
        } catch (Exception e) {
            throw e;
        }
    }

    public void variables() {
        cliente.setNomCli(ClienteView.txtNom.getText());
        cliente.setApeCli(ClienteView.txtApe.getText());
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        cliente.setNacCli(Date.valueOf(formatoFecha.format(ClienteView.jdNac.getDate())));
    }

    public void limpiar() {
        ClienteView.txtApe.setText("");
        ClienteView.txtNom.setText("");
    }

    // Generado por Java
    public void limpiarModelo() {
        cliente = new Cliente();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getLstCliente() {
        return lstCliente;
    }

    public void setLstCliente(List<Cliente> lstCliente) {
        this.lstCliente = lstCliente;
    }

}
