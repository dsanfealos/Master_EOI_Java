import javax.swing.*;
import java.util.HashMap;

public class EjercicioHashMap {

    //partiendo de una lista del tipo email-usuario
    //crear uno o varis métodos para localizar el email introduciendo el nombre por consola o ventana emergente
    public static void main(String[] args) {
        //Introducir nombre a buscar
        String nombre;
        nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre");



        //Mapa
        HashMap<String, String> emails = new HashMap<>();
        emails.put("juan@eoi.es", "Juan");
        emails.put("maria@eoi.es", "María");
        emails.put("ana@eoi.es", "Ana");
        emails.put("anaperez@eoi.es", "Ana");
        emails.put("paco@eoi.es", "Paco");

        buscaEmail(nombre,emails);
    }

    public static void buscaEmail(String nom, HashMap<String,String> mapa){
        if (mapa.containsValue(nom)) {
            mapa.forEach((email, nombre) -> {
                if (nombre.equals(nom)) {
                    System.out.println("Nombre = " + nom + " \temail = " + email);
                }
            });
        }else{
            System.out.println("Nombre no encontrado");
        }
    }

}
