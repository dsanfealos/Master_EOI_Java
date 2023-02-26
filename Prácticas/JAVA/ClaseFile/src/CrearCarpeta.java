import java.io.File;

public class CrearCarpeta {
    public static void main(String[] args) {
        //Para crear carpetas
        File archivo = new File("carpeta2/subcarpeta2/subcarpeta");
        System.out.println(archivo.mkdirs());
    }
}
