import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemploRegex {
    public static void main(String[] args) {
        //Pattern
        //Mirar en "Excepciones" > "PatternMatcher" para más explicaciones.
        //Sólo puede usarse en String.
        String texto = "En un lugar de La Mancha de cuyo nombre";
        String patron = "mancha";
        busqueda(patron,texto);


        //Que contenga cualquiera de los textos separados por |.
        patron = "lugar|sitio|ubicación"; //a|b|c para encontrar "a", "b" o "c".
        busqueda(patron,texto);

        //Que contenga (al menos) una vez lo que hay detrás del punto".".
        patron = ".de";  //Para al menos una mayus? TODO Comprobar
        busqueda(patron,texto);

        //Que el texto empiece por lo que hay detrás del ^.
        patron = "^en";
        busqueda(patron,texto);

        //Que el texto termine en lo que hay antes del dólar.
        patron = "bre$";
        busqueda(patron,texto);

        //Qué contenga un dígito (0-9)
        patron = "\\d";
        busqueda(patron,texto);

        //Que contenga un espacio en blanco
        patron = "\\s";
        busqueda(patron,texto);

        //Que empieza o termina por lo que hay (indistintamente) delante o detrás de \\b
        patron = "nombre\\b";
        busqueda(patron,texto);
        patron = "en\\b";
        busqueda(patron,texto);

        //Que contenga caracteres definidos en un rango ([a-z] por ejemplo), letras y números incluidos.
        patron = "[x-z]";
        busqueda(patron,texto);
        System.out.println("texto\b");  // El \b es para borrar el último carácter de un texto
        System.out.println(texto + "\b");  //Sirve también con variables declaradas
        patron = "[3-6]";
        busqueda(patron,texto);

        //Que contenga la palabra y {n} veces el caracter antes de las llaves. (luggg en este caso)
        patron = "lug{3}";
        busqueda(patron,texto);

        //Que contenga al menos 2 dígitos juntos (aunque no sean consecutivos numéricamente) entre 5 y 9
        patron = "[5-9]{2}";
        busqueda(patron,texto);

        //Password con al menos una mayúscula, una minúscula, un dígito y un carácter especial.
        //y al menos 8 caracteres

        //Al menos tiene un elemento dentro de ese rango. ?= significa una búsqueda o pregunta. El . es si existe lo que hay tras el punto. El *[] es para "todo el intervalo".
        //Escribir entre paréntesis cada condición deseada. El ".{8,}" significa que tenga entre 8 e infinitos caracteres.
        texto = "4455Acb%";
        patron = "(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[@#%^&+]).{8,}";
        busqueda(patron,texto,true);

        // Email. Puede empezar por "-", "_", número o minúscula
        texto = "eoi_eduardo@corral.es";
        patron = "^[a-z0-9_]+[[a-z0-9_-]\\.]*\\@[a-z0-9_]+((-[a-z0-9_]+)|([a-z0-9_]*))\\.[a-z]{2,}$";  //El asterisco indica que hay sí o sí al menos un caracter que es una @. EL COSO ESTÁ MAL. Usa esto adictosaltrabajo.com/2015/01/29/regexsam  y  freeformatter.com/java-regex-tester.html#ad-output
        //patron = "^\\w+[\\w-\\.]*\\@\\w+((-\\w+)|(\\w*))\\.[a-z]{2,}$";  // el \\w incluye alfanumérico y "_".
        busqueda(patron,texto,true);
    }

    public static void busqueda(String patron,String texto){
        Pattern miPatron = Pattern.compile(patron, Pattern.CASE_INSENSITIVE);
        Matcher miMatcher = miPatron.matcher(texto);
        System.out.println("miMatcher.find(" + patron + ") = " + miMatcher.find());
    }

    //Le metemos el boolean para que sea diferente del otro método y poder usarlo sin el CASE_INSENSITIVE
    public static void busqueda(String patron, String texto, boolean sensitivo){
        Pattern miPatron = Pattern.compile(patron);
        Matcher miMatcher = miPatron.matcher(texto);
        System.out.println("miMatcher.find(" + patron + ") = " + miMatcher.find());
    }

}
