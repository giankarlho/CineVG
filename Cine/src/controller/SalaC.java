package controller;

import java.io.Serializable;
import dao.SalaImpl;
import java.util.List;
import javax.annotation.PostConstruct;
import model.Sala;
import vistas.panels.SalaView;

public class SalaC implements Serializable {

    Sala sala;
    List<Sala> lstSala;
    SalaImpl dao;

    public SalaC() {
        sala = new Sala();
        dao = new SalaImpl();
    }

    public void registrarSala() throws Exception {
        try {
            dao.registrar(sala);
        } catch (Exception e) {
            System.out.println("Error en registrarCliente SalaC " + e.getMessage());
        }
    }

    public void eliminarSala() throws Exception {
        try {
            dao.eliminar(sala);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarSala() throws Exception {
        try {
            dao.modificar(sala);
        } catch (Exception e) {
            throw e;
        }
    }

    public void variables() {
        try {
            sala.setNumSala(Integer.parseInt(SalaView.txtNum.getText()));
            sala.setCapSala(Integer.parseInt(SalaView.txtCap.getText()));
        } catch (Exception e) {
            System.out.println("Error en variables Cliente " + e.getMessage());
        }
    }

    public void limpiar() {
        SalaView.txtNum.setText("");
        SalaView.txtCap.setText("");
    }
    
        public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public List<Sala> getLstSala() {
        return lstSala;
    }

    public void setLstSala(List<Sala> lstSala) {
        this.lstSala = lstSala;
    }

    public SalaImpl getDao() {
        return dao;
    }

    public void setDao(SalaImpl dao) {
        this.dao = dao;
    }

}
