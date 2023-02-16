import java.awt.*;
import java.io.File;

public class EjercicioListarCarpeta {
    static int nivel = -1;  //Se declara como static para poder usarse en el método
    public static void main(String[] args) {
        //Listar el contenido de una carpeta y de sus subcarpetas mostrando el tamaño de los archivos
        File archivo = new File(".");
        recorrer(archivo);
    }
    public static void recorrer(File ruta){
        //Sube un nivel cada vez que entra en un directorio
        nivel++;

        File[] contenido = ruta.listFiles();

        for (File nombre : contenido){

            for (int i = 0; i < nivel; i++){
                System.out.print("\t");
            }
            if (nombre.isDirectory()){
            System.out.println(Colores.cambiarColor(nombre.getName(),Colores.GREEN));  //Para cambiar el color a un texto
            recorrer(nombre);
            }else{
                System.out.println("--" + nombre.getName() + " -- Tamaño (Bytes): " + nombre.length());
            }
        }
        nivel--;
    }
}
