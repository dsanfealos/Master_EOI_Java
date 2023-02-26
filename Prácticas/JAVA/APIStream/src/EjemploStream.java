import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class EjemploStream {
    public static void main(String[] args) {

        // Crear Stream desde un lista de datos
        Stream<String> nombres = Stream.of("María","Jorge","Pepe","Ana");
        //nombres.forEach(n -> System.out.println(n));
        nombres.forEach(System.out::println);
        System.out.println("----------------------------------------");

        // Crear Stream desde Matriz
        String[] arraynom = {"María","Jorge","Pepe","Ana"};
        Stream<String> nombres1 = Arrays.stream(arraynom);
        nombres1.forEach(System.out::println);
        //... una vez operado (ejecutado) el stream no hay datos
        // nombres1.forEach(System.out::println);
        System.out.println("----------------------------------------");

        // Crear Stream "contruyendolo" con Stream builder
        Stream<String> nombres2 = Stream.<String>builder()
                .add("María")
                .add("Jorge")
                .add("Pepe")
                .add("Ana")
                .build();
        nombres2.forEach(System.out::println);
        System.out.println("----------------------------------------");

        // Crear Stream desde una lista
        ArrayList<String> arrnombres = new ArrayList<>();
        arrnombres.add("María");
        arrnombres.add("Jorge");
        arrnombres.add("Pepe");
        arrnombres.add("Ana");

//        Stream<String> nombres3 = arrnombres.stream();
//        nombres3.forEach(System.out::println);
        arrnombres.stream().forEach(System.out::println);
        System.out.println("----------------------------------------");

        // Operador map y peek
        Stream<String> nombres4 = Stream.of("María","Jorge","Pepe","Ana");
        nombres4//.peek(nom -> System.out.println("nom antes = " + nom))
                .map(nom -> nom.toUpperCase())
                //.peek(nom -> System.out.println("nom despues = " + nom))
                .map(nom -> nom.toLowerCase())
                .forEach(System.out::println);
        System.out.println("----------------------------------------");

        // Convertir en coleccion
        Stream<String> nombres5 = arrnombres.stream();
        List<String> lista = nombres5.map(nom -> nom.toUpperCase())
                .map(nom -> nom.toLowerCase())
                .collect(Collectors.toList());

        lista.forEach(System.out::println);
        System.out.println("----------------------------------------");

        // Convertir en objetos Usuario
        Stream<String> nombres6 = arrnombres.stream();
        nombres6.map(nombre -> new Usuario(nombre,null,null,null))
                .peek(us -> System.out.println("us.getNombre() = " + us.getNombre()))
                .forEach(us -> System.out.println(us.toString()));

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
