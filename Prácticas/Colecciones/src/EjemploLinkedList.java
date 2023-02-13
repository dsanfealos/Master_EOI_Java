import java.util.Collections;
import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        //Declaración
        LinkedList<Integer> numeros = new LinkedList<>();

        //Agregar
        numeros.add(3);
        numeros.add(5);
        numeros.add(1);
        numeros.add(12);

        recorrer(numeros);

        //add Específicos de LinkedList
        numeros.addFirst(56);
        numeros.addLast(48);
        recorrer(numeros);

        //Ordenar
        Collections.sort(numeros);
        recorrer(numeros);

        //Eliminar
        numeros.remove(3);
        recorrer(numeros);

        //Remove específicos de LinkedList
        numeros.removeFirst();
        numeros.removeLast();
        recorrer(numeros);

        //Buscar
        System.out.println("numeros.indexOf(5) = " + numeros.indexOf(5));
        System.out.println("numeros.indexOf(80) = " + numeros.indexOf(80));
        System.out.println("numeros.lastIndexOf(5) = " + numeros.lastIndexOf(5));
        System.out.println("numeros.contains(23) = " + numeros.contains(23));

    }

    public static void recorrer(LinkedList<Integer> num){
        for (int i = 0; i <num.size(); i++){
            System.out.println("num.get(" + i + ") = " + num.get(i));
        }
    }
}
