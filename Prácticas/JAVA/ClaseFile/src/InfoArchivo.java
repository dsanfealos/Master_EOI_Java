import java.io.File;

public class InfoArchivo {
    public static void main(String[] args) {
        File archivo = new File("miArchivo.txt");
        if (archivo.exists()){
            System.out.println("archivo.getName() = " + archivo.getName());
            System.out.println("archivo.getAbsolutePath() = " + archivo.getAbsolutePath());
            System.out.println("archivo.getPath() = " + archivo.getPath());
            System.out.println("archivo.canExecute() = " + archivo.canExecute());
            System.out.println("archivo.canRead() = " + archivo.canRead());
            System.out.println("archivo.canWrite() = " + archivo.canWrite());
            System.out.println("archivo.isHidden() = " + archivo.isHidden());
            System.out.println("archivo.length() = " + archivo.length());
            System.out.println("archivo.isFile() = " + archivo.isFile());
            System.out.println("archivo.isDirectory() = " + archivo.isDirectory());
            System.out.println("archivo.getTotalSpace() = " + archivo.getTotalSpace());
        }else{
            System.out.println("Archivo no encontrado");
        }
    }
}
