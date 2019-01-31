/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Pelicula;

/**
 *
 * @author Valentin
 */
public interface IPelicula {

    void registrar(Pelicula pelicula) throws Exception;

    void modificar(Pelicula pelicula) throws Exception;

    void eliminar(Pelicula pelicula) throws Exception;

    List<Pelicula> listar();

}
