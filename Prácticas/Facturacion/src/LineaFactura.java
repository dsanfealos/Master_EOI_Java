public class LineaFactura {
    //Atributos
    private int unidades;
    private String producto;
    private float precio;
    private float precioT;

    //Constructor

    public LineaFactura(int unidades, String producto, float precio) {
        this.unidades = unidades;
        this.producto = producto;
        this.precio = precio;
        this.precioT = precio * unidades;

    }


    //Método


    public String getProducto() {
        return producto;
    }

    public float getPrecio() {
        return precio;
    }

    public float getPrecioT() {
        return precioT;
    }

    @Override
    public String toString() {
        return "Unidades: " + unidades + " || Producto: " + producto + " || Precio: " + precio + " || Precio total: " + precioT;
    }
}
