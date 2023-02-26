import java.util.Scanner;

public class Ejercicio2ConBoolean {
    public static void main(String[] args) {
        //Definir datos válidos de usuario y password
        //Solicitar usuario y password por consola
        //Usar métodos de String y lógicos
        //Resultado True o False
        //JOptionPane. showInputDialog crea un cuadro fuera de la consola para introducir datos.

        //Sólo hace falta meter Scanner una vez, hasta nombre.close
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu usuario ");
        String datouser = entrada.nextLine();


        System.out.println("Introduce tu contraseña ");
        String datopass = entrada.nextLine();
        entrada.close();  //Sirve para cerrar Scanner

        //comparar
        boolean compararUsuario = datouser.equals("Daniel");
        boolean compararPassword = datopass.equals("entra");
        System.out.println("¿Usuario correcto? = " + compararUsuario);
        System.out.println("¿Contraseña correcta? = " + compararPassword);

    }
}
