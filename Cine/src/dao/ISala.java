package dao;

import model.Sala;

public interface ISala {

    void registrar(Sala sala) throws Exception;

    void modificar(Sala sala) throws Exception;

    void eliminar(Sala sala) throws Exception;
}
