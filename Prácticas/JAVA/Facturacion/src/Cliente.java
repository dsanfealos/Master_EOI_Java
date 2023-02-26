public class Cliente {
    //Atributos
    String nombre;
    String direccion;
    String contacto;
    String nif;

    //Constructor

    public Cliente(String nombre, String direccion, String contacto, String nif) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        this.nif = nif;
    }


    //ToString

    @Override
    public String toString() {
        return "Cliente" +   // El \t es un tabulador
                "\n\t\tNombre: " + "\t\t" + nombre + '\n' +
                "\t\tDirección: " + "\t\t" + direccion +
                "\n\t\tContacto: " + "\t\t" + contacto + '\n' +
                "\t\tNIF: " + "\t\t\t" + nif
                ;
    }
}
