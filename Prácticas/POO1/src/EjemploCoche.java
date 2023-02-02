public class EjemploCoche {
    public static void main(String[] args) {
        // Método statico
        Coche.llamarEmergencias();
        System.out.println("Coche.eCall = " + Coche.eCall);
        System.out.println("Coche.distintivo = " + Coche.distintivo);

        // "Instanciar" o crear un objeto.
        Coche miCoche = new Coche();  // miCoche es el objeto creado, y se puede poner miCoche.atributo para establecer sus atributos.
        Coche tuCoche = new Coche();

        miCoche.marca = "Ford";
        miCoche.modelo = "Mondeo";
        miCoche.color = "Negro";
        miCoche.combustible = "Diesel";
        miCoche.cilindrada = 2000;
        miCoche.deposito = 50;

        /* miCoche.eCall = "911";*/ //No se puede hacer porque es constante

        tuCoche.marca = "Renault";

        System.out.println("miCoche.marca = " + miCoche.marca);
        System.out.println("miCoche.modelo = " + miCoche.modelo);
        System.out.println("miCoche.color = " + miCoche.color);
        System.out.println("miCoche.combustible = " + miCoche.combustible);
        System.out.println("miCoche.cilindrada = " + miCoche.cilindrada + "cc");
        System.out.println("--------------------------------");

        //Modificación de atributos estáticos. Mínima cantidad de staticos imprescindibles, por favor.
        System.out.println("Coche.distintivo = " + Coche.distintivo);
        System.out.println("tuCoche.distintivo = " + tuCoche.distintivo);
        System.out.println("miCoche.distintivo = " + miCoche.distintivo);
        miCoche.distintivo = "F";
        System.out.println("tuCoche.eCall = " + tuCoche.eCall); //Sí se puede imprimir una constante.
        System.out.println("Coche.distintivo = " + Coche.distintivo);  //Al ser estático, la modificación afecta tanto a la clase como a los objetos.
        System.out.println("tuCoche.distintivo = " + tuCoche.distintivo);
        System.out.println("miCoche.distintivo = " + miCoche.distintivo);



        System.out.println("--------------------------------");
        System.out.println(miCoche.detallesCoche());  //Usamos el método con los atributos establecidos.
        System.out.println("--------------------------------");
        System.out.println("consumo = " + miCoche.consumo(600) + " l/100km");
        System.out.println("consumo = " + miCoche.consumo(600,50) + " l/100km");

    }
}
