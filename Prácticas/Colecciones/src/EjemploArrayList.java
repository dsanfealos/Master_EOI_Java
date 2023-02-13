
import java.util.ArrayList;
import java.util.Collections;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); //no acepta tipos primitivos

        //Agregar elementos
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        numeros.add(9);
        numeros.add(3);
        numeros.add(2);
        numeros.add(4);
        numeros.add(8);

        //Dimensión
        System.out.println(numeros.size());
        recorrer(numeros);

        //Obtener un valor de una posición determinada
        System.out.println(numeros.get(4));

        //Recorrer ArrayList
        for (Integer valor : numeros){
            System.out.println("valor = " + valor);
        }

        //Insertar un elemento en una posición determinada
        numeros.add(2,11);
        recorrer(numeros);

        //Modificar el valor de una posición
        numeros.set(2,12);
        recorrer(numeros);

        //Eliminar una posición determinada
        numeros.remove(2);
        recorrer(numeros);

        //Buscar un número por su valor
        System.out.println("numeros.indexOf(3) = " + numeros.indexOf(3)); //si hay varios iguales, te muestra sólo el primero
        System.out.println("-------------------------");

        //Ordenar ArrayList
        Collections.sort(numeros);
        recorrer(numeros);

        //Si un elemento está contenido en un ArrayList
        System.out.println("numeros.contains(7) = " + numeros.contains(7));  //Contiene el elemento x?
        System.out.println("numeros.contains(7) = " + numeros.contains(57));
        System.out.println("-------------------------");

        //Eliminar todo
        numeros.clear();
        recorrer(numeros);
    }

    public static void recorrer(ArrayList<Integer> num){  //Static porque pretendo utilizarlo dentro de un método statico main
        for (int i = 0; i < num.size(); i++){
            System.out.println("numeros.get(" + i + ")= " + num.get(i));
        }
        System.out.println("-------------------------");
    }
}
