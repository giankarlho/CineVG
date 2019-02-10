
package controller;

import dao.PeliculaImpl;
import java.util.List;
import model.Pelicula;
import vistas.panels.PeliculaView;


public class PeliculaC {
    Pelicula pelicula = new Pelicula();
    List<Pelicula> lstPelicula;
    PeliculaImpl dao;
    
    public PeliculaC() {

    }

    public void registrarPelicula() throws Exception {
        dao = new PeliculaImpl();
        try {
            dao.registrar(pelicula);
        } catch (Exception e) {
            System.out.println("Error en registrarCliente ClienteC " + e.getMessage());
        }
    }

    public void eliminarPelicula() throws Exception {
        PeliculaImpl dao;
        try {
            dao = new PeliculaImpl();
            dao.eliminar(pelicula);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarPelicula() throws Exception {
        PeliculaImpl dao;
        try {
            dao = new PeliculaImpl();
            dao.modificar(pelicula);
        } catch (Exception e) {
            throw e;
        }
    }

    public void variables() {
        pelicula.setClaPeli(PeliculaView.txtClasificacion.getText());
        pelicula.setDurPeli(PeliculaView.txtDuracion.getText());
        pelicula.setGenPeli(PeliculaView.txtGenero.getText());
        pelicula.setIdiPeli(PeliculaView.txtIdioma.getText());
        pelicula.setNomPeli(PeliculaView.txtNombre.getText());
        pelicula.setTipPeli(PeliculaView.txtTipo.getText());
    }

    public void limpiar() {
        PeliculaView.txtClasificacion.setText("");
        PeliculaView.txtDuracion.setText("");
        PeliculaView.txtGenero.setText("");
        PeliculaView.txtIdioma.setText("");
        PeliculaView.txtNombre.setText("");
        PeliculaView.txtTipo.setText("");
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public List<Pelicula> getLstPelicula() {
        return lstPelicula;
    }

    public void setLstPelicula(List<Pelicula> lstPelicula) {
        this.lstPelicula = lstPelicula;
    }

    public PeliculaImpl getDao() {
        return dao;
    }

    public void setDao(PeliculaImpl dao) {
        this.dao = dao;
    }
}
