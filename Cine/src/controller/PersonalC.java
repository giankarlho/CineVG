package controller;

import dao.PersonalImpl;
import java.io.Serializable;
import java.util.List;
import javax.swing.JOptionPane;
import model.Personal;
import vista.control.Loguin;
import vista.control.Principal;
import vistas.panels.PersonalView;

public class PersonalC implements Serializable {

    Personal personal;
    List<Personal> lstPersonal;
    PersonalImpl dao;

    public PersonalC() {
        personal = new Personal();
    }

    public void loguin() throws Exception {
        dao = new PersonalImpl();
        Personal per;
        per = dao.listarLogin(Loguin.txtUsuario.getText().toUpperCase().trim(), Loguin.txtClave.getText().toUpperCase().trim());
//        per = dao.listarLogin("user", "1234");
        if (per.getNomPer() == null) {
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrecta");
        } else {
            Principal principal = new Principal();
            principal.setVisible(true);
            Principal.lblUserApe.setText(per.getApePer());
            Principal.lblUserNom.setText(per.getNomPer());
            if (per.getTipPer()==2){ // no es administrador
                Principal.btnPersonal.setEnabled(false);
                Principal.btnSala.setEnabled(false);
            }
            Loguin loguin = new Loguin();
            loguin.setVisible(false);
        }
    }

    public void registrarPersonal() throws Exception {
        try {
            dao = new PersonalImpl();
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
