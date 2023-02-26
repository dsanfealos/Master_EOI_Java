import java.util.ArrayList;
import java.util.function.Consumer;

public class EjemploLambda {
    public static void main(String[] args) {
        ArrayList<Integer> cifras = new ArrayList<>();
        cifras.add(89);
        cifras.add(8);
        cifras.add(9);
        cifras.add(25);

        //Sin lambda
        for (Integer valor : cifras){
            System.out.println("valor = " + valor);
        }
        System.out.println("----------------------");

        //Con lambda
        cifras.forEach((n) -> System.out.println("n = " + n));

        //Bloque. No lo admite en una sola linea
        cifras.forEach((n) -> {
            if (n == 89) {
                System.out.println("El 89");
            }else{
                n *=2;
            }
            System.out.println("n = " + n);
        });
        System.out.println("----------------------");

        //Asignar lambda a variable de tipo enum
        Consumer numerar = (n) -> System.out.println("n = " + n);
        cifras.forEach(numerar);
        System.out.println("----------------------");

        //Interfaz FuncionString
        FuncionString interrogacion = (s) -> "¿" + s + "?";
        System.out.println("interrogacion.ejecuta(\"Qué tal\") = " + interrogacion.ejecuta("Qué tal"));
        FuncionString admiracion = (s) -> "¡" + s + "!";
        System.out.println("admiracion.ejecuta(\"Qué tal\") = " + admiracion.ejecuta("Muy bien"));
        System.out.println("----------------------");

        //Interfaz FuncionNumeros
        FuncionNumeros suma = (a,b) -> a + b;
        System.out.println("suma.ejecuta(5.7,6.4) = " + suma.ejecuta(5.7f, 6.4f));

    }

    //public static void imprimeTexto(String str, ){



}
