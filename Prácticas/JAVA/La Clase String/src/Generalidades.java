import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class Generalidades {
    //26/01/2023
    public static void main(String[] args) {
        // Declaraciones
        String nombre = new String("Eduardo");
        System.out.println("nombre = " + nombre);
        String apellido = "Corral";
        System.out.println("apellido = " + apellido);

        // "escapar" las comillas (Usar comillas usando la barra \)
        String bienvenida = "El nombre auténtico de Pepe es \"José\" Martín";
        System.out.println("bienvenida = " + bienvenida);

        //Concatenar
        System.out.println("El nombre completo es = " + nombre + " " + apellido);
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("nombreCompleto = " + nombreCompleto);

        //Comparar
        String uno = "Eduardo Corral";
        String dos = new String("Eduardo Corral");
        System.out.println("uno = " + uno);
        System.out.println("dos = " + dos);
        System.out.println("uno == dos -> " + (uno == dos));  //Incorrecto
        //El equals tiene en cuenta mayúsculas y minúsculas.
        System.out.println("uno.equals(dos) -> " + uno.equals(dos));  //Correcto uso de comparación en Strings

    }
}
