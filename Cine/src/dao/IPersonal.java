package dao;

import java.util.List;
import model.Personal;

public interface IPersonal {

    void registrar(Personal personal) throws Exception;

    void modificar(Personal Personal) throws Exception;

    void eliminar(Personal personal) throws Exception;

    List<Personal> listar();

}
