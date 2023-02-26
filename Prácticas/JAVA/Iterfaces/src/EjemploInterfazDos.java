public class EjemploInterfazDos implements Interface1, Interface2{
    //Atributos
    String nombre;
    String apellidos;
    //...

    //Métodos de la clase

    public EjemploInterfazDos(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String nombreCompleto(){
        return nombre + " " + apellidos;
    }

    //Métodos del Interfaz - Implementar
    @Override
    public void metodoInterfaz1() {
        System.out.println("Método del Interfaz 1.");
    }

    @Override
    public void metodoInterfaz1B() {
        System.out.println("Hola B");
    }

    @Override
    public void metodoInterfaz2() {
        System.out.println("Método del Interfaz 2.");
    }
}
