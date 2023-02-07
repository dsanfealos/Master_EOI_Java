public enum TipoCoche {
    SEDAN("Sedan","Mediano",4),
    STATION_WAGON("Familiar","Grande",5),
    HATCHBACK("Hatchback","Compacto",5),
    PICKUP("PicUp","Furgoneta abierta",2),
    COUPE("Coupé","Deportivo",2),
    SUV("SUV","Todoterreno urbano",5);  //Aquí sí hace falta el ;

    private final String nombre;  //Se usa el private en los atributos, aunque en los apuntes ponga public
    private final String descripcion;
    private final int numPuertas;


    //Usar el constructor
    TipoCoche(String nombre, String descripcion, int numPuertas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numPuertas = numPuertas;
    }


    //Usar Getter
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}
