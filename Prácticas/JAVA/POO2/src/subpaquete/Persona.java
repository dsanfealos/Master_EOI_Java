package subpaquete;
//Se podría importar Amigos, pero si sabemos la dirección. En principio no se puede importar algo de nivel superior
//así que copiamos el coso

public class Persona {  //Esta clase Persona es distinta de la otra de nivel superior, pero no hay problema aunque se llame igual porque está dentro de un paquete

    //Atributos
    private String nombre;
    private String apellidos;
    private String email;
    private Amigos mejorAmigo; // No lo encuentra (si no lo copiamos) porque está en otro paquete
    private String direccion;

    //Constructor
    public Persona(String nombre, String apellidos, String email, Amigos mejorAmigo, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.mejorAmigo = mejorAmigo;
        this.direccion = direccion;
    }
    //Setter y Getter. De esta forma, mejorAmigo sólo puede asignarse a uno de los valores de la lista de 5 nombres de Amigos.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Amigos getMejorAmigo() {
        return mejorAmigo;
    }

    public void setMejorAmigo(Amigos mejorAmigo) {
        this.mejorAmigo = mejorAmigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre= " + nombre + '\n' +
                "apellidos = " + apellidos + '\n' +
                "email = " + email + '\n' +
                "mejorAmigo = " + mejorAmigo +
                "\ndireccion = " + direccion + '\n' +
                '}';
    }
}
