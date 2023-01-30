import java.sql.SQLOutput;

public class MetodosString {
    public static void main(String[] args) {
        String str1 = "  En un lugar de la Mancha de cuyo  ";
        String str2 = "Pepe Muñoz";
        String str3 = "PEPE MUÑOZ";

        //Longitud de caracteres del String
        System.out.println("Longitud = " + str1.length());
        //Igual
        System.out.println("Igual = " + str2.equals(str3));
        //Igual insensitivo
        System.out.println("Igual = " + str2.equalsIgnoreCase(str3));
        //Comparar
        System.out.println("Comparar = " + str2.compareTo(str3));  //Revisar grabación para entender ese "32"
        //Comparar con insensitivo
        System.out.println("Comparar insensitivo = " + str2.compareToIgnoreCase(str3));
        // Eliminar espacios al principio y al final
        System.out.println("Con espacios = |" + str1 + "|");
        System.out.println("Sin espacios = |" + str1.trim() + "|");
        //Extraer un carácter determinado (cuenta espacios, y el primer carácter cuenta como el número 0)
        System.out.println("Extrae el carácter 10 = " + str1.charAt(10));
        //Convertir en matriz
        char[] matriz = str1.toCharArray();
        System.out.println("Matriz 10 = " + matriz[10]);
        //Extraer cadena de caracteres
        System.out.println("Extraer indicando inicio y fin = " + str1.substring(0,9)); //El 9 no incluido.
        System.out.println("Extraer desde un índice = " + str1.substring(9)); //El 9 incluido.
        //Buscar
        System.out.println("Buscar carácter 1ª coincidencia = " + str1.indexOf('u'));  //Al ser un carácter, va con comillas simples.
        System.out.println("Buscar carácter 2ª coincidencia = " + str1.indexOf('u',6));
        System.out.println("Buscar palabra = " + str1.indexOf("lugar"));  //Intentemos trastear con esto y un texto de Laura Gallego.
        System.out.println("Buscar carácter última coincidencia = " + str1.lastIndexOf('u'));

    }
}
