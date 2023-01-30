public class Reales {
    public static void main(String[] args) {
        //Tipo float, siempre escribir f al final.
        float numeroFloat = 3.2564e4f;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("En bytes son: " + Float.BYTES);
        System.out.println("En bits son: " + Float.SIZE);
        System.out.println("Máximo: " + Float.MAX_VALUE);
        System.out.println("Mínimo: " + Float.MIN_VALUE);
        System.out.println("Máximo exponente: " + Float.MAX_EXPONENT);
        System.out.println("Mínimo exponente: " + Float.MIN_EXPONENT);
        System.out.println("Infinito positivo: " + Float.POSITIVE_INFINITY);
        System.out.println("Infinito negativo: " + Float.NEGATIVE_INFINITY);
        System.out.println("---------------------------------");

        //Tipo double, no es obligatorio escribir d al final,
        // pero es recomendable para no confundirse
        double numeroDouble = 45.69788721d;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("En bytes son: " + Double.BYTES);
        System.out.println("En bits son: " + Double.SIZE);
        System.out.println("Máximo: " + Double.MAX_VALUE);
        System.out.println("Mínimo: " + Double.MIN_VALUE);
        System.out.println("Máximo exponente: " + Double.MAX_EXPONENT);
        System.out.println("Mínimo exponente: " + Double.MIN_EXPONENT);
        System.out.println("Infinito positivo: " + Double.POSITIVE_INFINITY);
        System.out.println("Infinito negativo: " + Double.NEGATIVE_INFINITY);
        System.out.println("---------------------------------");

    }
}
