import javax.lang.model.SourceVersion;

public class Casting {
    public static void main(String[] args) {
        // Widenning casting (Ensanchamiento)
        byte miByte = 68; //1 Byte
        System.out.println("miByte = " + miByte);

        short miShort = miByte;  //Paso de 1 a 2 bytes
        System.out.println("miShort = " + miShort);

        int miInt = miShort;  //Paso de 2 a 4 bytes. Podría usar miByte también.
        System.out.println("miInt = " + miInt);

        long miLong = miInt;  //Paso de 4 a 8 bytes
        System.out.println("miLong = " + miLong);

        float miFloat = miLong; //Paso de 8 bytes entero a 4 bytes real
        System.out.println("miFloat = " + miFloat);

        double miDouble = miFloat; //Paso 4 bytes real a 8 bytes real
        System.out.println("miDouble = " + miDouble);
        System.out.println("----------------------------------");
        
        //Narrowing casting (estrechamiento)
        miDouble = 456468.56e38d;
        System.out.println("miDouble = " + miDouble);
        
        miFloat = (float)miDouble;  //Escribir (float) para convencer a la máquina de que es un valor float.
        System.out.println("miFloat = " + miFloat);  //Muestra infinito porque el número es demasiado grande para float.

        miLong = (long)miDouble;
        System.out.println("miLong = " + miLong); //Muestra el máximo de long

        miInt = (int)miDouble;
        System.out.println("miInt = " + miInt);

        miShort = (short)miDouble;
        System.out.println("miShort = " + miShort);//Muestra -1 porque ha perdido información

        miByte = (byte)miDouble;
        System.out.println("miByte = " + miByte);

        miFloat = 1455.12246f;
        System.out.println("valor entero = " + (int)miFloat); //(int) antes de una variable para declararla número entero en ese punto.
        System.out.println("decimales = " + (miFloat-(int)miFloat));
        
    }
}
