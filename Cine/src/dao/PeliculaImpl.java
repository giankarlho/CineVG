package dao;

import java.util.List;
import model.Pelicula;


public class PeliculaImpl extends Conexion implements IPelicula {

    @Override
    public void registrar(Pelicula pelicula) throws Exception {
        System.out.println("ey");
    }

    @Override
    public void modificar(Pelicula pelicula) throws Exception {
    }

    @Override
    public void eliminar(Pelicula pelicula) throws Exception {
   }

    @Override
    public List<Pelicula> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
