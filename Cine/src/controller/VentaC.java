package controller;

import java.io.Serializable;
import dao.VentaD;
import java.util.List;
import javax.annotation.PostConstruct;
import model.Venta;

public class VentaC implements Serializable{
    
    private Venta venta = new Venta();
    private Venta selecteVenta;
    private List<Venta> listVenta;
    private List<Venta> listarPorVenta;
    

    @PostConstruct
    public void iniciar() {

        try {
            ListarVenta();
        } catch (Exception e) {
        }
    }

    private void ListarVenta() throws Exception {
        VentaD dao;
        try {
            dao = new VentaD();
            listVenta = dao.listarVenta();
        } catch (Exception e) {
            throw e;
        }
    }

    public void guardarVenta() throws Exception {
        VentaD dao;
        try {
            dao = new VentaD();
            dao.guardarVenta(venta);
            ListarVenta();           
            limpiarVenta();
        } catch (Exception e) {
           
        }
        
    }
    
   private void limpiarVenta() {
        venta = new Venta();
    }
    public void modificarVenta() {
        VentaD dao;
        try {
            dao = new VentaD();
            dao.modificarVenta(selecteVenta);
            ListarVenta();          
            limpiarVenta();
        } catch (Exception e) {
        }
    }


    public void eliminarVenta() throws Exception {
        VentaD dao;
        try {
            dao = new VentaD();
            dao.eliminarSala(selecteVenta);
            lstVenta();
        } catch (Exception e) {
            throw e;
        }
     }
    

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Venta getSelecteVenta() {
        return selecteVenta;
    }

    public void setSelecteVenta(Venta selecteVenta) {
        this.selecteVenta = selecteVenta;
    }

    public List<Venta> getListVenta() {
        return listVenta;
    }

    public void setListVenta(List<Venta> listVenta) {
        this.listVenta = listVenta;
    }

    public List<Venta> getListarPorVenta() {
        return listarPorVenta;
    }

    public void setListarPorVenta(List<Venta> listarPorVenta) {
        this.listarPorVenta = listarPorVenta;
    }

    
 

    private void lstVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      }
