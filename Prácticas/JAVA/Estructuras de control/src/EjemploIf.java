import java.util.Scanner;

public class EjemploIf {
    public static void main(String[] args) {
        // 1 - Definir los datos válidos de login
        String usuario = "daniel";
        String password = "entra";

        // 2 -Solicitar usuario y password por consola

        Scanner entrada = new Scanner(System.in);
        System.out.print("Usuario: ");  //print sin ln para que escribamos junto al texto.
        String us = entrada.next();  //next.Line lee toda una línea, y next lee la primera palabra
        System.out.print("Contraseña: ");
        String pw = entrada.next();

        // 3 - Comprobar Login
        //Solución 1
        boolean login = usuario.equals(us) && password.equals(pw);
        System.out.println("login = " + login);

        //Solución 2
        //nombre = (condición) ? nombre si true : nombre si false
        String mensaje = (usuario.equals(us) && password.equals(pw)) ? "Has accedido al programa" : "Credenciales erróneas";
        System.out.println("Resultado : " + mensaje);

        //Variante
        if(usuario.equals(us) && password.equals(pw)){
            //instrucciones de acceso
            System.out.println("Has accedido al programa");
        }else{
            System.out.println("Credenciales erróneas");
            main(args);
            System.exit(0);
        }
        entrada.close(); //Para cerrar el Scanner

        //if...else if...
        int a, b, c;
        a = 2;
        b = 2;
        c = 2;
        //Es lo mismo que
        /*int a = 2;
        int b = 2;
        int c = 2;*/

        if(a < b){  //Es a<b?. Este grupo de intrucciones se cumple antes de comprobar la condición 2.
            System.out.println("a < b");
        }else if(b < c){   //O b <c?
            System.out.println("b < c");
        }else{  //Si ninguna se cumple, hacemos...
            System.out.println("Ninguna de las anteriores");
        }

        //Comentarios en función de la nota
        int nota = 7;
        if(nota < 5){
            System.out.println("Suspenso");
        }else if(nota < 7){
            System.out.println("Aprobado");
        }else if(nota < 9){
            System.out.println("Notable");
        }else if(nota < 10){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("Matrícula de honor");
        }

        //
    }
}
