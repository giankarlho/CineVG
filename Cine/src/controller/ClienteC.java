package controller;

import dao.ClienteImpl;
import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import model.Cliente;
import vistas.panels.ClienteView;

public class ClienteC implements Serializable {

    Cliente cliente;
    List<Cliente> lstCliente;
    ClienteImpl dao;

    public ClienteC() {
        cliente = new Cliente();
        dao = new ClienteImpl();
    }

    public void registrarCliente() throws Exception {
        try {
            dao.registrar(cliente);
        } catch (Exception e) {
            System.out.println("Error en registrarCliente ClienteC " + e.getMessage());
        }
    }

    public void eliminarCliente() throws Exception {
        try {
            dao.eliminar(cliente);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarCliente() throws Exception {
        try {
            dao.modificar(cliente);
        } catch (Exception e) {
            throw e;
        }
    }

    public void variables() {
        try {
            cliente.setNomCli(ClienteView.txtNom.getText());
            cliente.setApeCli(ClienteView.txtApe.getText());
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            cliente.setNacCli(Date.valueOf(formatoFecha.format(ClienteView.jdNac.getDate())));
        } catch (Exception e) {
            System.out.println("Error en variables Cliente " + e.getMessage());
        }
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
