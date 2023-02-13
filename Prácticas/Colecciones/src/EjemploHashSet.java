import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
        //Declaración
        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(4);
        numeros.add(5);
        numeros.add(12);
        numeros.add(7);
        numeros.add(9);


        //Agregar duplicado
        System.out.println(numeros.add(7));  //da falso
        numeros.add(7);  //No se agrega, ya que ya existe
        recorrer(numeros);

        //Eliminar
        numeros.remove(23); //Seleciono el valor (no el índice) de lo que quiero borrar
        recorrer(numeros);

        //Buscar
        System.out.println("numeros.contains(23) = " + numeros.contains(23));
        System.out.println("numeros.contains(5) = " + numeros.contains(5));


        //vaciar el hashSet
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());
        numeros.clear();
        System.out.println("numeros.isEmpty() = " + numeros.isEmpty());


    }

    public static void recorrer(HashSet<Integer> num){
        for (Integer n : num){
            System.out.println("n = " + n);
        }
        System.out.println("--------------------");
    }
}
