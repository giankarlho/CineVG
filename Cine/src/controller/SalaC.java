
package controller;

import java.io.Serializable;
import dao.SalaD;
import java.util.List;
import javax.annotation.PostConstruct;
import model.Sala;

public class SalaC implements Serializable{
    
    private Sala sala = new Sala();
    private Sala selecteSala;
    private List<Sala> listSala;
    private List<Sala> listarPorSala;
    

    @PostConstruct
    public void iniciar() {

        try {
            ListarSala();
        } catch (Exception e) {
        }
    }

    private void ListarSala() throws Exception {
        SalaD dao;
        try {
            dao = new SalaD();
            listSala = dao.listarSala();
        } catch (Exception e) {
            throw e;
        }
    }

    public void guardarSala() throws Exception {
        SalaD dao;
        try {
            dao = new SalaD();
            dao.guardarSala(sala);
            ListarSala();           
            limpiarSala();
        } catch (Exception e) {
           
        }
    }

    public void modificarSala() {
        SalaD dao;
        try {
            dao = new SalaD();
            dao.modificarSala(selecteSala);
            ListarSala();          
            limpiarSala();
        } catch (Exception e) {
        }
    }

    private void limpiarSala() {
        sala = new Sala();
    }

    public void eliminarSala() throws Exception {
        SalaD dao;
        try {
            dao = new SalaD();
            dao.eliminarSala(selecteSala);
            lstEmpresa();
        } catch (Exception e) {
            throw e;
        }
     }

  

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Sala getSelecteSala() {
        return selecteSala;
    }

    public void setSelecteSala(Sala selecteSala) {
        this.selecteSala = selecteSala;
    }

    public List<Sala> getListSala() {
        return listSala;
    }

    public void setListSala(List<Sala> listSala) {
        this.listSala = listSala;
    }

    public List<Sala> getListarPorSala() {
        return listarPorSala;
    }

    public void setListarPorSala(List<Sala> listarPorSala) {
        this.listarPorSala = listarPorSala;
    }

    private void lstEmpresa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
 }
 

