public class Enteros {
    public static void main(String[] args) {
        //Tipo byte
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("En bytes son: " + Byte.BYTES);
        System.out.println("En bits son: " + Byte.SIZE);
        System.out.println("Máximo: " + Byte.MAX_VALUE);
        System.out.println("Mínimo: " + Byte.MIN_VALUE);
        System.out.println("---------------------------------");

        //Tipo short
        short numeroShort = 255;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("En bytes son: " + Short.BYTES);
        System.out.println("En bits son: " + Short.SIZE);
        System.out.println("Máximo: " + Short.MAX_VALUE);
        System.out.println("Mínimo: " + Short.MIN_VALUE);
        System.out.println("---------------------------------");

        //Tipo int
        int numeroInt = 250000;
        System.out.println("numeroShort = " + numeroInt);
        System.out.println("En bytes son: " + Integer.BYTES);
        System.out.println("En bits son: " + Integer.SIZE);
        System.out.println("Máximo: " + Integer.MAX_VALUE);
        System.out.println("Mínimo: " + Integer.MIN_VALUE);
        System.out.println("---------------------------------");

        //Tipo Long
        long numeroLong = 255550000;
        System.out.println("numeroShort = " + numeroLong);
        System.out.println("En bytes son: " + Long.BYTES);
        System.out.println("En bits son: " + Long.SIZE);
        System.out.println("Máximo: " + Long.MAX_VALUE);
        System.out.println("Mínimo: " + Long.MIN_VALUE);
        System.out.println("---------------------------------");
    }
}
