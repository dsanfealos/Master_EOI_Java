import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        //Definir datos válidos de usuario y password
        //Solicitar usuario y password por consola
        //Usar métodos de String y lógicos
        //Resultado True o False
        //JOptionPane. showInputDialog crea un cuadro fuera de la consola para introducir datos.

        String user = "Daniel";
        String pass = "entra";
        String datouser ="", datopass = "";

        Scanner entrada = new Scanner(System.in);
        /*System.out.println("Introduce tu usuario ");
        String datouser = entrada.nextLine();

        System.out.println("Introduce tu contraseña ");
        String datopass = entrada.nextLine();*/

        //El if sólo hará la condición una vez, mientras que el while crearía un bucle.
        /*if (datouser.equals(usuario)){
            if (datopass.equals(password)){
                System.out.println("Acceso concedido");
            }else{
                System.out.println("La contraseña es incorrecta");
            }
        }else{
            System.out.println("El usuario es incorrecto");
        }*/

        System.out.println("Introduce tu usuario ");
        datouser = entrada.nextLine();

        while (!datouser.equals(user)){
            System.out.println("El usuario es incorrecto");
            System.out.println("Introduce tu usuario ");
            datouser = entrada.nextLine();

           /* if (datouser.equals(user)){
                System.out.println("Introduce tu usuario ");
            }*/
        }
        System.out.println("Introduce tu contraseña ");
        datopass = entrada.nextLine();

        while (!datopass.equals(pass)){
            System.out.println("La contraseña es incorrecta");
            System.out.println("Introduce tu contraseña ");
            datopass = entrada.nextLine();

           /* if (datopass.equals(pass)){
                System.out.println("Introduce tu contraseña ");
            }*/
        }
        entrada.close();
        System.out.println("Acceso concedido");
    }
}
