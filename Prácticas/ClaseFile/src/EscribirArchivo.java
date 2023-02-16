import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void main(String[] args) {
        try {
            FileWriter escribir = new FileWriter("miArchivo.txt");
            escribir.write("Escribir en mi archivo.txt desde java\r");
            escribir.write("Segunda linea\r");
            escribir.close();
            System.out.println("Escritura terminada");
        }catch(IOException e){
            System.out.println("No existe");
            System.out.println(e);
        }
    }
}
