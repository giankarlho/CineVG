package model;

import java.sql.Date;

public class Cliente {
    //idCli     nomCli   apeCli   nacCli
    private int idCli;
    private String nomCli;
    private String apeCli;
    private Date nacCli;

    public Cliente() {
    }
    
    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getApeCli() {
        return apeCli;
    }

    public void setApeCli(String apeCli) {
        this.apeCli = apeCli;
    }

    public Date getNacCli() {
        return nacCli;
    }

    public void setNacCli(Date nacCli) {
        this.nacCli = nacCli;
    }
}
