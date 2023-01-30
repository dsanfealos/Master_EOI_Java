import java.util.Scanner;

public class IntroduciendoDatosErrores {
    public static void main(String[] args) {
        //Leer dato por consola
        String dato;
        Scanner entrada = new Scanner(System.in);  //System.in implica que recibe datos desde DENTRO de la consola.
        System.out.print("Introduce un entero ");  //Al quitar el ln del println, podemos escribir al lado.
        dato = entrada.nextLine();
        System.out.println("dato = " + dato);

        //Convertir dato a entero
        int numDecimal = 0;
        
        //Control de error en la conversión de dato a entero.
        try{
            numDecimal = Integer.parseInt(dato);
            //En catch ponemos el tipo de error esperado, y lo llamamos e (valen otros)
        }catch (NumberFormatException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("ERROR - Has de introducir un número entero");
            //Volvemos a llamar a la rutina para reiniciar el programa y
            // que se pueda volver a introducir un número si hay error.
            main(args);
            System.exit(0);  //Para evitar que ejecute lo que resta de código, por lo que el resultado no sale alterado.
        }

        
        // y representarlo en diferentes sistemas
        System.out.println("numDecimal = " + numDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numDecimal));
    }
}
