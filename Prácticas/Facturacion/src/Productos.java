public enum Productos {

    //Hacemos un enumerador con lista de productos
    //Atributos
    ORDENADOR_PORTATIL(400.30f,"Ordenador portátil",0),
    RATON_INALAMBRICO(20.75f,"Ratón inalámbrico",0),
    TECLADO(15.50f,"Teclado",0),
    AURICULARES(23.50f,"Auriculares",0);

    private float precio;
    private String descripcion;
    int cantidad;

    //Constructor
    Productos(float precio, String descripcion, int cantidad) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
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
