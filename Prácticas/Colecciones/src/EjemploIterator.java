import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterator {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();

        coches.add("Renault");
        coches.add("Volvo");
        coches.add("Ford");
        coches.add("Seat");

        //Crear iterator
        Iterator<String> iterador = coches.iterator();
        
        //Imprimir primer elemento
        System.out.println("iterador.next() = " + iterador.next());

        //Imprimir todos
        while (iterador.hasNext()){
            System.out.println("iterador.next() = " + iterador.next());
        }
    }
}
