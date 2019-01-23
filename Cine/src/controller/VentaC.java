package controller;

import java.io.Serializable;
import dao.VentaD;
import java.util.List;
import javax.annotation.PostConstruct;
import model.VentaM;

public class VentaC implements Serializable{
    
    private VentaM venta = new VentaM();
    private VentaM selecteVenta;
    private List<VentaM> listVenta;
    private List<VentaM> listarPorVenta;
    

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
        venta = new VentaM();
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
    

    public VentaM getVenta() {
        return venta;
    }

    public void setVenta(VentaM venta) {
        this.venta = venta;
    }

    public VentaM getSelecteVenta() {
        return selecteVenta;
    }

    public void setSelecteVenta(VentaM selecteVenta) {
        this.selecteVenta = selecteVenta;
    }

    public List<VentaM> getListVenta() {
        return listVenta;
    }

    public void setListVenta(List<VentaM> listVenta) {
        this.listVenta = listVenta;
    }

    public List<VentaM> getListarPorVenta() {
        return listarPorVenta;
    }

    public void setListarPorVenta(List<VentaM> listarPorVenta) {
        this.listarPorVenta = listarPorVenta;
    }

    
 

    private void lstVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      }
