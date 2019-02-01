package controller;

import dao.ClienteImpl;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import model.Cliente;


public class ClienteC {
    
    private Cliente cliente = new Cliente();
    private List<Cliente> lstCliente;
    
    
    @PostConstruct
    public void inicio(){
        try {
            listarCliente();
        } catch (Exception ex) {
            Logger.getLogger(ClienteC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void registrarCliente() throws Exception {
        ClienteImpl dao;
        try {
            dao = new ClienteImpl();
            dao.registrar(cliente);
            listarCliente();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarCliente() throws Exception {
        ClienteImpl dao;
        try {
            dao = new ClienteImpl();
            dao.eliminar(cliente);
            listarCliente();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void listarCliente() throws Exception {
        ClienteImpl dao;
        try {
            dao = new ClienteImpl();
            lstCliente = dao.listar();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarCliente() throws Exception {
        ClienteImpl dao;
        try {
            dao = new ClienteImpl();
            dao.modificar(cliente);
            listarCliente();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void limpiar(){
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
