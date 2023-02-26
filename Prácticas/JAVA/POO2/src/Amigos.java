public enum Amigos {
    PEPE ("José Marín","629 456 789", "pepe@gmail.com"),
    ALEX ("Alejandro","658 593 374","alex@gmail.com"),
    MERCHE ("Mercedes", "693 900 211", "merche@gmail.com"),
    LUCY("Lucía","621 294 557", "lucy@gmail.com"),
    PACO("Francisco","665 431 227","paco@gmail.com");

    private final String nombre;
    private final String telefono;
    private final String correo;

    //Constructor
    Amigos(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    //Getter
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Amigos: " +
                "\nnombre = " + nombre + '\n' +
                "télefono = " + telefono + '\n' +
                "correo = " + correo + '\n' ;
    }
}
