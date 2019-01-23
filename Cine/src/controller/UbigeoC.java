package controller;

import java.io.Serializable;
import dao.UbigeoD;
import java.util.List;
import javax.annotation.PostConstruct;
import model.UbigeoM;

public class UbigeoC implements Serializable{
    
    private UbigeoM ubigeo = new UbigeoM();
    private UbigeoM selecteUbigeo;
    private List<UbigeoM> listUbigeo;
    private List<UbigeoM> listarPorUbigeo;
    

    @PostConstruct
    public void iniciar() {

        try {
            ListarUbigeo();
        } catch (Exception e) {
        }
    }

    private void ListarUbigeo() throws Exception {
        UbigeoD dao;
        try {
            dao = new UbigeoD();
            listUbigeo = dao.listarUbigeo();
        } catch (Exception e) {
            throw e;
        }
    }

    public void guardarUbigeo() throws Exception {
        UbigeoD dao;
        try {
            dao = new UbigeoD();
            dao.guardarUbigeo(ubigeo);
            ListarUbigeo();           
            limpiarVenta();
        } catch (Exception e) {
           
        }
        
    }
    
   private void limpiarUbigeo() {
        ubigeo = new UbigeoM();
    }
    public void modificarUbigeo() {
        UbigeoD dao;
        try {
            dao = new UbigeoD();
            dao.modificarUbigeo(selecteUbigeo);
            ListarUbigeo();          
            limpiarUbigeo();
        } catch (Exception e) {
        }
    }


    public void eliminarUbigeo() throws Exception {
        UbigeoD dao;
        try {
            dao = new UbigeoD();
            dao.eliminarUbigeo(selecteUbigeo);
            lstUbigeo();
        } catch (Exception e) {
            throw e;
        }
     }

    public UbigeoM getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(UbigeoM ubigeo) {
        this.ubigeo = ubigeo;
    }

    public UbigeoM getSelecteUbigeo() {
        return selecteUbigeo;
    }

    public void setSelecteUbigeo(UbigeoM selecteUbigeo) {
        this.selecteUbigeo = selecteUbigeo;
    }

    public List<UbigeoM> getListUbigeo() {
        return listUbigeo;
    }

    public void setListUbigeo(List<UbigeoM> listUbigeo) {
        this.listUbigeo = listUbigeo;
    }

    public List<UbigeoM> getListarPorUbigeo() {
        return listarPorUbigeo;
    }

    public void setListarPorUbigeo(List<UbigeoM> listarPorUbigeo) {
        this.listarPorUbigeo = listarPorUbigeo;
    }

    private void lstUbigeo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void limpiarVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }