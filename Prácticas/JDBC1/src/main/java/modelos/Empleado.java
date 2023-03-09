package modelos;

public class Empleado {
    private int id;
    private String nombre;
    private Oficina ofi;

    public Empleado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Oficina getOfi() {
        return ofi;
    }

    public void setOfi(Oficina ofi) {
        this.ofi = ofi;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ofi=" + ofi +
                '}';
    }
}
