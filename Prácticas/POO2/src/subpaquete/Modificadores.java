package subpaquete;

public class Modificadores {
    public String nombre;
    protected String apellidos;
    private int edad;

    public void nombreCompleto(){  //Si no está en la misma carpeta que la clase que lo llama, no funciona a menos que escribamos public.
        System.out.println(nombre + " " + apellidos + " tiene " + edad + " años.");

    }

    private void tonteria(){
        System.out.println("Hola tú");
    }

    public Modificadores(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void llamaTonteria(){
        tonteria();
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Modificadores{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
