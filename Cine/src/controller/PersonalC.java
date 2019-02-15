package controller;

import dao.PersonalImpl;
import java.io.Serializable;
import java.util.List;
import model.Personal;
import vistas.panels.PersonalView;

public class PersonalC implements Serializable {

    Personal personal;
    List<Personal> lstPersonal;
    PersonalImpl dao;

    public PersonalC() {
        dao = new PersonalImpl();
        personal = new Personal();
    }

    public int loguin() throws Exception{        
        Personal per ;
        per = dao.listarLogin("user","1234");
        if (per.getUsuPer()==null){
            return 1;
        }else{
            return 0;
        }
    }
            
    public void registrarPersonal() throws Exception {
        try {
            dao.registrar(personal);
        } catch (Exception e) {
            System.out.println("Error en registrar Personal " + e.getMessage());
        }
    }

    public void eliminarPersonal() throws Exception {
        try {
            dao.eliminar(personal);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarPersonal() throws Exception {
        try {
            dao.modificar(personal);
        } catch (Exception e) {
            throw e;
        }
    }

    public void variables() {
        try {
            personal.setApePer(PersonalView.txtApe.getText());
            personal.setNomPer(PersonalView.txtNom.getText());
            personal.setDirPer(PersonalView.txtDir.getText());
            personal.setDniPer(PersonalView.txtDni.getText());
            personal.setIdUbi(PersonalView.txtUbigeo.getText());
            personal.setPwdPer(PersonalView.txtPass.getText());
            personal.setUsuPer(PersonalView.txtUsuario.getText());
        } catch (Exception e) {
            System.out.println("Error en variables personal " + e.getMessage());
        }
    }

    public void limpiar() {
        PersonalView.txtApe.setText("");
        PersonalView.txtNom.setText("");
        PersonalView.txtDir.setText("");
        PersonalView.txtDni.setText("");
        PersonalView.txtUbigeo.setText("");
        PersonalView.txtPass.setText("");
        PersonalView.txtUsuario.setText("");
    }

    // Getter y Setter
    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
}
