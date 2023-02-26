public enum Productos {

    //Hacemos un enumerador con lista de productos
    //Atributos
    ORDENADOR_PORTATIL(400.30f,"Ordenador portátil\t"),
    RATON_INALAMBRICO(20.75f,"Ratón inalámbrico\t"),
    TECLADO(15.50f,"Teclado\t\t\t"),
    AURICULARES(23.50f,"Auriculares\t\t");

    private float precio;
    private String descripcion;


    //Constructor
    Productos(float precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    //getters
    public float getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    /*@Override
    public String toString() {
        return
                "Unidades: " + cantidad +
                " || " + descripcion  +
                " || precio: " + precio
                ;
    }*/
}
