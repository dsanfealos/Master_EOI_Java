import java.util.Random;

public class JavaUtilRandom {
    public static void main(String[] args) {
        Random objetoRnd = new Random();
        int numInt = objetoRnd.nextInt(); //next.Int genera un num aleatorio de tipo entero
        System.out.println("numInt = " + numInt);

        long numLong = objetoRnd.nextLong();
        System.out.println("numLong = " + numLong);

        float numFloat = objetoRnd.nextFloat();
        System.out.println("numFloat = " + numFloat);

        double numDouble = objetoRnd.nextDouble();
        System.out.println("numDouble = " + numDouble);  //En float y double es entre 0 y 1
        
        //Rangos 0...n
        for (int i = 0; i<100; i++) {
            numInt = objetoRnd.nextInt(91);  //Hemos puesto un límite en 91 (no incluido)
            System.out.println("numInt = " + numInt);
        }

        System.out.println("-------------------------------------");

        //Rango n...m

        for (int i = 0; i<100; i++) {
            numFloat = objetoRnd.nextFloat(34,58);  //Podemos establecer un intervalo
            System.out.println("numFloat = " + numFloat);  //Ahora sí supera el 1
        }

        //48...90
        numInt = 48 + objetoRnd.nextInt(90 -48 + 1);  //Lo mismo pero si te quieres complicar la vida


    }
}
