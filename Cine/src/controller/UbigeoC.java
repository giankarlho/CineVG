package controller;

import java.io.Serializable;
import dao.UbigeoD;
import java.util.List;
import javax.annotation.PostConstruct;
import model.Ubigeo;

public class UbigeoC implements Serializable{
    
    private Ubigeo ubigeo = new Ubigeo();
    private Ubigeo selecteUbigeo;
    private List<Ubigeo> listUbigeo;
    private List<Ubigeo> listarPorUbigeo;
    

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
        ubigeo = new Ubigeo();
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

    public Ubigeo getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(Ubigeo ubigeo) {
        this.ubigeo = ubigeo;
    }

    public Ubigeo getSelecteUbigeo() {
        return selecteUbigeo;
    }

    public void setSelecteUbigeo(Ubigeo selecteUbigeo) {
        this.selecteUbigeo = selecteUbigeo;
    }

    public List<Ubigeo> getListUbigeo() {
        return listUbigeo;
    }

    public void setListUbigeo(List<Ubigeo> listUbigeo) {
        this.listUbigeo = listUbigeo;
    }

    public List<Ubigeo> getListarPorUbigeo() {
        return listarPorUbigeo;
    }

    public void setListarPorUbigeo(List<Ubigeo> listarPorUbigeo) {
        this.listarPorUbigeo = listarPorUbigeo;
    }

    private void lstUbigeo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void limpiarVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }