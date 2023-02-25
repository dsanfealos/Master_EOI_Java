import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class EjemploStream {
    public static void main(String[] args) {


        //Filter
        Stream<String> nombres7 = Stream.of("María", "Jorge", "Marta", "Ana");
        nombres7.filter(nom -> nom.contains("a") && nom.contains("M")) //¿Qué Strings contienen "a" y "M"?
                .filter(nom -> nom.contains("t"))  //Podemos concatenar filtros
                .forEach(n -> System.out.println("n = " + n));

        System.out.println("-------------------------");

        //anyMatch y allMatch
        //Al menos uno coincide
        boolean nombres8 = Stream.of("María","Jorge","Marta","Ana")
                .map(nom -> nom.toUpperCase())
                .anyMatch(nom -> nom.contains("A"));

        System.out.println("nombres8 = " + nombres8);
        System.out.println("-------------------------");

        //Todos los elementos cumplen la condicion
        boolean nombres9 = Stream.of("María","Jorge","Marta","Ana")
                .map(nom -> nom.toUpperCase())
                .filter(nom -> nom.contains("M"))
                .allMatch(nom -> nom.contains("A"));
        System.out.println("nombres9 = " + nombres9);
        System.out.println("-------------------------");

        //Count
        long contador = Stream.of("María","Jorge","","Marta","Ana")
                .filter(nom -> !nom.isEmpty())
                .filter(nom -> nom.contains("a"))
                .count();
        System.out.println("contador = " + contador);
        System.out.println("-------------------------");

        //Distinct
        Stream<String> nombres10 = Stream.of("Juan","María", "Jorge","Juan", "Marta","Juan", "Ana")
                .distinct();
        nombres10.forEach(System.out::println);
        System.out.println("-------------------------");

        //Reduce
        String nombres11 = Stream.of("Juan","María", "Jorge","Juan", "Marta","Juan", "Ana")
                .distinct()
                .reduce("Resultado concatenado = ", (a,b) -> a + "," + b);  //a es la identidad
        System.out.println("nombres11 = " + nombres11);
        System.out.println("-------------------------");

        //Stream de numeros enteros
        //Reduce
        Stream<Integer> numeros = Stream.of(5,10,15,20,25);
        int resultado = numeros.reduce(0,(a,b) -> a + b);  //Empieza en 0 la suma
          //empieza en 1 la multiplicador
        System.out.println("resultado = " + resultado);
        System.out.println("-------------------------");

        //Rangos Numéricos
        //Sum
        //IntStream numeros1 = IntStream.range(5,20)  //El 20 no está incluido
        IntStream numeros1 = IntStream.rangeClosed(5,20)  //El 20 sí está incluido
                .peek(System.out::println); //Pilla todos los números
        System.out.println("numeros1.sum() = " + numeros1.sum());  //Suma de todos
        System.out.println("-------------------------");

        //Estadísticas
        IntStream numeros3 = IntStream.rangeClosed(5,20)
                .peek(System.out::println);

        IntSummaryStatistics estadistica = numeros3.summaryStatistics();
        System.out.println("estadistica.getMax() = " + estadistica.getMax());
        System.out.println("estadistica.getMin() = " + estadistica.getMin());


        Stream<Integer> numeros4 = Stream.of(5,10,15,20,25)
                .peek(System.out::println);

        //IntSummaryStatistics estadistica2 = numeros4.summaryStatistics();  //No se puede
//        System.out.println("estadistica.getMax() = " + estadistica2.getMax());
//        System.out.println("estadistica.getMin() = " + estadistica2.getMin());



    }
}
