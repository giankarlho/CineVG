
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
            System.out.println("Error en registrar Pelicula PeliculaC " + e.getMessage());
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
        pelicula.setDurPeli(PeliculaView.txtDuracion.getText());
        pelicula.setGenPeli(PeliculaView.cbGenero.getSelectedItem().toString());
        pelicula.setIdiPeli(PeliculaView.cbIdioma.getSelectedItem().toString());
        pelicula.setNomPeli(PeliculaView.txtNombre1.getText());
        
        //TIPO
        if(PeliculaView.rbDoblada.isSelected() == true ){
           pelicula.setTipPeli("D");          
        }
        else if(PeliculaView.rbSubtitulada.isSelected() == true)
        {
            pelicula.setTipPeli("S");
        }
        
        //CLASIFICACION        
        if(PeliculaView.rbPrimero.isSelected() == true){
            pelicula.setClaPeli("R");
        }
        else if(PeliculaView.rbSegundo.isSelected() == true)
        {
            pelicula.setClaPeli("PG");
        }
        else if(PeliculaView.rbTercero.isSelected() == true)
        {
            pelicula.setClaPeli("14A");
        }
        else if(PeliculaView.rbCuarto.isSelected() == true)
        {
            pelicula.setClaPeli("18A");
        }
        else if(PeliculaView.rbQuinto.isSelected() == true)
        {
            pelicula.setClaPeli("G");
        }
    }

    public void limpiar() {
        PeliculaView.txtDuracion.setText("");
        PeliculaView.txtNombre1.setText("");
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
