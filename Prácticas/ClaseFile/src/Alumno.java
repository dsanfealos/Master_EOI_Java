public class Alumno {
    String nombre;
    String apellidos;
    String email;
    String movil;

    public Alumno(String nombre, String apellidos, String email, String movil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.movil = movil;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", movil='" + movil + '\'' +
                '}';
    }
}
