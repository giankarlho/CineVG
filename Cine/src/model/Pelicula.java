package model;

public class Pelicula {
    
    private int idPeli;
    private String genPeli;
    private String idiPeli;
    private String durPeli;
    private String tipPeli;
    private String claPeli;
    
    public Pelicula(int idPeli, String genPeli, String idiPeli, String durPeli, String tipPeli, String claPeli) {
        this.idPeli = idPeli;
        this.genPeli = genPeli;
        this.idiPeli = idiPeli;
        this.durPeli = durPeli;
        this.tipPeli = tipPeli;
        this.claPeli = claPeli;
    }

    public int getIdPeli() {
        return idPeli;
    }

    public void setIdPeli(int idPeli) {
        this.idPeli = idPeli;
    }

    public String getGenPeli() {
        return genPeli;
    }

    public void setGenPeli(String genPeli) {
        this.genPeli = genPeli;
    }

    public String getIdiPeli() {
        return idiPeli;
    }

    public void setIdiPeli(String idiPeli) {
        this.idiPeli = idiPeli;
    }

    public String getDurPeli() {
        return durPeli;
    }

    public void setDurPeli(String durPeli) {
        this.durPeli = durPeli;
    }

    public String getTipPeli() {
        return tipPeli;
    }

    public void setTipPeli(String tipPeli) {
        this.tipPeli = tipPeli;
    }

    public String getClaPeli() {
        return claPeli;
    }

    public void setClaPeli(String claPeli) {
        this.claPeli = claPeli;
    }
  
}
