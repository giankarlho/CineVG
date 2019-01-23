
package controller;

import java.io.Serializable;
import dao.SalaD;
import java.util.List;
import javax.annotation.PostConstruct;
import model.SalaM;

public class SalaC implements Serializable{
    
    private SalaM sala = new SalaM();
    private SalaM selecteSala;
    private List<SalaM> listSala;
    private List<SalaM> listarPorSala;
    

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
        sala = new SalaM();
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

  

    public SalaM getSala() {
        return sala;
    }

    public void setSala(SalaM sala) {
        this.sala = sala;
    }

    public SalaM getSelecteSala() {
        return selecteSala;
    }

    public void setSelecteSala(SalaM selecteSala) {
        this.selecteSala = selecteSala;
    }

    public List<SalaM> getListSala() {
        return listSala;
    }

    public void setListSala(List<SalaM> listSala) {
        this.listSala = listSala;
    }

    public List<SalaM> getListarPorSala() {
        return listarPorSala;
    }

    public void setListarPorSala(List<SalaM> listarPorSala) {
        this.listarPorSala = listarPorSala;
    }

  

 

    private void lstEmpresa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
 }
 

