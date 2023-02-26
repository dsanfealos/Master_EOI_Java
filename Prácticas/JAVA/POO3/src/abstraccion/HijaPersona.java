package abstraccion;

public class HijaPersona extends Persona{  //poner el ratón encima y hacer click en "Implementar métodos" o generar "Override methods".
    public String domicilio;

    public void visitarAPapa(){
        System.out.println("Visito a mi padre.");
    }
    @Override
    public void registro() {
        System.out.println("Registro de Usuario");
    }

    @Override
    public void editar() {
        System.out.println("Modifico datos usuario");
    }

    @Override
    public void borrar() {
        System.out.println("Eliminar usuario");
    }

    public HijaPersona(String nombre, String apellidos, String email, String domicilio) {
        super(nombre, apellidos, email);
        this.domicilio = domicilio;
    }
}
