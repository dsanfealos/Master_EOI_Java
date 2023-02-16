import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {

        //Para buscar un texto dentro de un string
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);  //Creamos el patrón "w3schools". Usar UNICODE_CASE cuando tengamos letras fuera del alfabeto inglés (ñ, ç, etc).
        Matcher matcher = pattern.matcher("Visit W3Schools!");  //Buscamos el patrón en el mensaje.
        boolean matchFound = matcher.find();  //¿Se encuentra el patrón?
        if (matchFound){
            System.out.println("Match found.");
        }else{
            System.out.println("Match not found.");
        }
    }
}
