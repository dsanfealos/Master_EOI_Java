import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;


public class Factura {
    public static void main(String[] args) {
        //Ejercico que hay que mandar a Eduardo. Cumplir lo del word. Nº de factura de 10 dígitos.
        //TODO
        //generar nº de factura (aleatorio) DONE
        //obtener la fecha actual(date.local)
        //imprimir toda la factura como el word


        //Introducir datos de cliente
        //a - leo los datos en variables independientes y uso un constructor
        //b- creo objeto cliente vacío y voy leyendo los datos introducidos

        //Entrada Scanner
        /*Scanner entrada = new Scanner(System.in);
        System.out.println(" Introduce los datos del cliente:");
        System.out.print("Nombre:");
        String nombre = entrada.nextLine();
        System.out.print("Dirección:");
        String direccion = entrada.nextLine();
        System.out.print("Contacto:");
        String contacto = entrada.nextLine();
        System.out.print("NIF:");
        String nif = entrada.nextLine(); */

        String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random k = new Random();
        String numero = "";
        for (int i = 0; i < 10; i++){  //10 dñigitos
            int aleatorio = k.nextInt(base.length());
            numero += base.charAt(aleatorio);
        }


        System.out.println("Introduce los datos del cliente: ");   //Este método ahorra líneas de código, aunque hace lo mismo que no poner el método y usar lo comentado.
        String nombre = introduceDato("Nombre");
        String direccion = introduceDato("Dirección");
        String contacto = introduceDato("Contacto");
        String nif = introduceDato("NIF");

        //Declarando cliente

        Cliente cliente1 = new Cliente(nombre,direccion,contacto,nif);


        //Productos comprados

        System.out.println(" Introduce los productos: ");
        //LineaFactura[] lineasFactura = new LineaFactura[10];  //Hasta 10 productos en una misma factura - out of bonds si me paso
        ArrayList<LineaFactura> lineasFactura = new ArrayList<>();
        boolean salir = false;
        int indice = 0;  //Sólo para almacenar lineas factura en array fijo
        while (salir != true) {
            int unidades = Integer.parseInt(introduceDato("Unidades (0 = Salir)"));
            //metemos el if para salir antes de ejecutar la línea de código que pide el tipo de producto
            if (unidades == 0) {
                salir = true;
            }else {
                String tipoProducto = introduceDato("Tipo de producto: 1 - Ordenador portátil, 2 - Ratón inalámbrico, 3 - Teclado, 4 - Auriculares");
                Productos producto;
                switch (tipoProducto) {  //Para que al elegir un número nos dé un producto
                    case "1":
                        producto = Productos.ORDENADOR_PORTATIL;
                        break;
                    case "2":
                        producto = Productos.RATON_INALAMBRICO;
                        break;
                    case "3":
                        producto = Productos.TECLADO;
                        break;
                    case "4":
                        producto = Productos.AURICULARES;
                        break;
                    default:
                        producto = Productos.TECLADO;  //Le ponemos el valor más barato para que no moleste, pero deberíamos hacer un bloque de respuesta de errores
                }
                //Conseguimos los atributos del producto
                LineaFactura linea = new LineaFactura(unidades, producto.getDescripcion(), producto.getPrecio());  //Creamos una matriz que tenga como valores unidades, descripción de producto y precio de producto
                lineasFactura.add(linea);  //Cada lineasFactura que hagamos, se añadirá a la matriz creada justo antes (que es para guardar todas)
                //lineasFactura[indice] = linea; //Array estático
                //indice++;
                //System.out.println(linea.toString());
            }
        }

        //Fecha

        //LocalDate hoy= LocalDate.now(ZoneId.of("Europe/Madrid"));  //Usar esto para la fecha

        //Impresión de factura
        System.out.flush();   //Para borrar la consola. No parece funcionar.

        System.out.println("\n\n---------------------------");
        float totalFactura = 0;
        String comercio = "Consum";
        String conComercio = "info@consum.es";
        String direcComercio = "C/Vinos, 3-4";
        String nifComercio = "07649876S";

        System.out.println("Fecha: " + fechaHoy());
        System.out.println(" ");
        System.out.println("Comercio: \t" + comercio);
        System.out.println("Dirección: \t" + direcComercio);
        System.out.println("Contacto: \t" + conComercio);
        System.out.println("NIF: \t\t" + nifComercio);
        System.out.println("-----------------------------");
        System.out.println("\nNº de factura: " + numero + "\n");
        System.out.println(cliente1.toString());
        System.out.println("-----------------------------" + "\n");

        for (LineaFactura lin:lineasFactura){
            if (lin != null) {
                System.out.println(lin.toString());
                totalFactura += lin.getPrecioT();

            }
        }
        System.out.println("\n");
        //Para ver el total a pagar
        float tipoIVA= 21;
        float cantidadPagar = totalFactura *(1 + tipoIVA / 100);
        //System.out.println("Total factura = " + totalFactura + "\nIVA: " + totalFactura * tipoIVA / 100 + "\nTotal a pagar: " + cantidadPagar);

        System.out.printf("Total factura: \t\t%.2f\nIVA: \t\t\t\t%.2f\nA pagar: \t\t\t%.2f", totalFactura,totalFactura * tipoIVA / 100,cantidadPagar);  //El %.2f indica la cantidad de decimales que queremos

        /*Productos prod1 = Productos.ORDENADOR_PORTATIL;
        prod1.setCantidad(1);
        Productos prod2 = Productos.AURICULARES;
        prod2.setCantidad(2);
        System.out.println(prod1.toString());
        System.out.println(prod2.toString());*/

    }

    public static String introduceDato(String mensaje){
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje + ": ");
        return entrada.nextLine();
    }

    public static String fechaHoy(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato.format(new Date());
        return fecha;
    }

}
