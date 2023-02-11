package abstraccion;

abstract class Persona {  //abstract en lugar de public, no se puede generarn objetos de ella y está destinada a ser siempre una superclase
    //atributos
    protected String nombre;  //protected porque están destinados a ser heredados
    protected String apellidos;
    protected String email;

    //métodos abstractos
    abstract public void registro();
    abstract public void editar();
    abstract public void borrar();

    //metodos "normales"
    public String nombreCompleto(){
        return this.nombre + " " + this.apellidos;
    }

    //Constructor

    public Persona(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }
}
