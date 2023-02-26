public class EjemploInterfaz implements Interface1{
    //Atributos
    String nombre;
    String apellidos;
    //...

    //Métodos de la clase

    public EjemploInterfaz(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String nombreCompleto(){
        return nombre + " " + apellidos;
    }

    //Métodos del Interfaz - Implementar
    @Override
    public void metodoInterfaz1() {
        System.out.println("Método del Interfaz 1");
    }

    @Override
    public void metodoInterfaz1B() {
        System.out.println("Soy el B");
    }

}
