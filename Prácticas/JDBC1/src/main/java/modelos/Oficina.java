package modelos;

public class Oficina {
    private String id;
    private String ciudad;
    private String tlf;

    public Oficina(){   //Constructor vacío

    }

    public Oficina(String id, String ciudad, String tlf) {
        this.id = id;
        this.ciudad = ciudad;
        this.tlf = tlf;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    @Override
    public String toString() {
        return id + " - " + ciudad + " - " + tlf;
    }


}
