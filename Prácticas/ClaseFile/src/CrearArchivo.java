import java.io.File;
import java.io.IOException;

public class CrearArchivo {
    public static void main(String[] args) {
        try{
        File archivo = new File("miarchivo.txt");
        //devuelve true si lo crea y false si no
        if (!archivo.exists()){
            archivo.createNewFile();
            System.out.println("Archivo " +archivo.getName());
        }else{
            System.out.println("El archivo ya existe");
        }
        }catch(IOException e){
            System.out.println("Error al crear el archivo");
            System.out.println("e = " + e);
        }
    }

}
