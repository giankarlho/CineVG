package dao;

import model.Pelicula;


public interface IPelicula {

    void registrar(Pelicula pelicula) throws Exception;

    void modificar(Pelicula pelicula) throws Exception;

    void eliminar(Pelicula pelicula) throws Exception;


}
