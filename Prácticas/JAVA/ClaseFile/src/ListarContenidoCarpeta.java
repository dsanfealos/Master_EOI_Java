import java.io.File;

public class ListarContenidoCarpeta {
    public static void main(String[] args) {
        File archivo = new File(".");  // . = carpeta raíz proyecto
        //solo nombres -> Strings
//        String[] contenido = archivo.list();
//        for(String nombre : contenido){
//            System.out.println(nombre);
//        }

        //con Objetos
        File[] contenido = archivo.listFiles();
        for (File nombre : contenido){
            System.out.println(nombre.getName() + " --> directorio = " + nombre.isDirectory());
        }
    }
}
