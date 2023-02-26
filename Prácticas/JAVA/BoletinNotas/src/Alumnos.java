public enum Alumnos {

    //Atributos
    DANIEL_SANFELIX("Daniel Sanfélix","Plaza Iglesia, 3-5","daniel@gmail.es","1ºJAVA"),
    PEPE_URRUTIA("Pepe Urrutia","Plaza España, 2-4","pepe@gmail.es","1ºJAVA"),
    ANDREA_GARCIA("Andrea García","C/ Albacete, 32-7","andrea@gmail.es","1ºJAVA"),
    LAURA_GOMEZ("Laura Gómez","C/ Taberna, 13-1","laura@gmail.es","1ºJAVA"),
    ALEJANDRO_PASCAL("Alejandro Pascal","Plaza Agustín, 7-4","alejandro@gmail.es","1ºJAVA"),
    JAVIER_COSTA("Javier Costa","C/ Kikos, 22-2","javier@gmail.es","1ºJAVA"),
    FERNANDO_ALOS("Fernando Alós","C/ Ríos, 65-5","fernando@gmail.es","1ºJAVA"),
    IRENE_PEREZ("Irene Pérez","C/ Artesanos, 13-5","irene@gmail.es","1ºJAVA"),
    MURIEL_PENASCO("Muriel Peñasco","Plaza Caballeros, 5-6","muriel@gmail.es","1ºJAVA"),
    CARLOS_VIVAS("Carlos Vivas","C/ Velázquez, 28-9","carlos@gmail.es","1ºJAVA");

    final String nombre;
    final String direccion;
    final String contacto;
    final String grupo;



    //Constructor
    Alumnos(String nombre, String direccion, String contacto, String grupo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        this.grupo = grupo;
    }

    //To string

    @Override
    public String toString() {
        return "Alumno: " +
                "Nombre: " + nombre +
                "\n\t\tDirección: " + direccion +
                "\n\t\tContacto: " + contacto +
                "\n\t\tGrupo: " + grupo;
    }
}
