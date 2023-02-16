import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivo {
    public static void main(String[] args) {
        try{
            File archivo = new File("miarchivo.txt");
            Scanner leer = new Scanner(archivo);
            int nl=1;

            while(leer.hasNextLine()){
                String linea= leer.nextLine();
                System.out.println("linea "+nl+"= " + linea);
                nl++;
            }
            System.out.println("fin del archivo");
        }catch(FileNotFoundException e){
            System.out.println("file not found");
            System.out.println(e.toString());

        }
    }
}
