import java.sql.SQLOutput;
import java.util.Random;

public class EjercicioClaveAleatoria {
    public static void main(String[] args) {
        //Generar una clave aleatoria de n dígitos
        // y que contenga a...z; A...Z, 0..1, &%$_
        // y se almacena en String password

        System.out.println("El password es -> " + generatePass(10));

        //Solución Sanfe
       /* String password = "";
        int n = 9;
        Random numRnd = new Random();
        //mayúsculas
        int[] mayus = new int[(127-65)];
        int cont = 0;
        for (int i = 0; i<100; i++) {
            int numInt = numRnd.nextInt(65,127);
            if (mayus[numInt] != numInt) {
                System.out.println("n = " + numInt);
                mayus[numInt] = numInt;
                cont++;
            }

        }*/

        //Solución 1

        /*String password = "";
        String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789&%$_";
        int longitud = 8;
        Random objRnd = new Random();
        for (int i = 0; i < longitud; i++){
            int n = objRnd.nextInt(base.length());
            password += base.charAt(n);
        }
        System.out.println("password = " + password);*/

        //Solución 2. Revisar solución de Kenya en 01/02/2023 11:00


    }

    public static String generatePass(int longitud){
        String password = "";
        String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789&%$_";
        Random objRnd = new Random();
        for (int i = 0; i < longitud; i++){
            int n = objRnd.nextInt(base.length());
            password += base.charAt(n);
        }
        return password;
    }


    //solución Kenya
    public static String generatePass2(int longitud){
        Random objetoRnd = new Random();
        String password = "";
        int cont = 0;
        while (password.length() <= longitud){
            int numASCII = objetoRnd.nextInt(33,127);
            char caracter = (char) numASCII;
            password += caracter;
            cont++;
        }
        return password;
    }

}
