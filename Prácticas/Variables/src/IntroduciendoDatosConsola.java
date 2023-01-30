import java.util.Scanner;

public class IntroduciendoDatosConsola {
    public static void main(String[] args) {
        //Leer dato por consola
        String dato;
        Scanner entrada = new Scanner(System.in);  //System.in implica que recibe datos desde DENTRO de la consola.
        System.out.print("Introduce un entero ");  //Al quitar el ln del println, podemos escribir al lado.
        dato = entrada.nextLine();
        System.out.println("dato = " + dato);

        //Convertir dato a entero e introducir en consola.
        int numDecimal = Integer.parseInt(dato);
        System.out.println("numDecimal = " + numDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numDecimal));
    }
}
