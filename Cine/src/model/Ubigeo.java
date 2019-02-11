package model;

public class Ubigeo {
    private String idUbi;
    private String dptoUbi;
    private String provUbi;
    private String distUbi;

    public String getIdUbi() {
        return idUbi;
    }

    public Ubigeo() { // para instanciar un objeto
    }

    public Ubigeo(String idUbi, String distUbi) { // para obtener el idUbi en el Combo
        this.idUbi = idUbi;
        this.distUbi = distUbi;
    }
      

    public void setIdUbi(String idUbi) {
        this.idUbi = idUbi;
    }

    public String getDptoUbi() {
        return dptoUbi;
    }

    public void setDptoUbi(String dptoUbi) {
        this.dptoUbi = dptoUbi;
    }

    public String getProvUbi() {
        return provUbi;
    }

    public void setProvUbi(String provUbi) {
        this.provUbi = provUbi;
    }

    public String getDistUbi() {
        return distUbi;
    }

    public void setDistUbi(String distUbi) {
        this.distUbi = distUbi;
    }
    
    
}
