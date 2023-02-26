import java.io.File;

public class BorrarCarpeta {
    public static void main(String[] args) {
        File archivo = new File("carpeta1");
        if (archivo.exists()){
            if (archivo.delete()){
                System.out.println("Se ha eliminado " + archivo.getName());
            }else{
                if (archivo.isDirectory()){
                    System.out.println("La carpeta " + archivo.getName() + " no está  vacía. Tiene " + archivo.list().length + " archivos");
                }
                System.out.println("No he podido eliminar " + archivo.getName());
            }
        }else{
            System.out.println("La carpeta " + archivo.getName() + " no existe.");
        }
    }
}
