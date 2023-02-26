public class Wrapper {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(123456); //Asignado valor a un int wrapper
        Integer e = 123456;  //Es mejor la de arriba
        System.out.println(" e == i -> " + (e == i) );  //Falso porque son objetos y pasa como con strings, contienen lo mismo pero no son iguales. Usemos equals.
        System.out.println("i.equals(e) = " + i.equals(e));
        System.out.println("i.compareTo(e)" + i.compareTo(e));  //Compara sus contenidos. 0 significa true (son iguales) y 1 significa false (son distintos).

        System.out.println("i = " + i);
        String s = i.toString();  //transformar de entero a string
        System.out.println("s = " + s);

        int j = i.intValue();  //Convierte el Integer en un tipo primitivo.
        long l = i.longValue();
        float f = i.floatValue();
        double d = i.doubleValue();

        System.out.println(i.getClass());  //Solo funciona con wrappers, no con primitivos.
        
        int k = Integer.parseInt("123456");  //Convertimos string en int
        System.out.println("k = " + k);

        System.out.println("To Hexadecimal = " + Integer.toHexString(123456));
        System.out.println("To Octal = " + Integer.toOctalString(123456));
        System.out.println("To Bin = " + Integer.toBinaryString(123456));

        //Long
        Long varlong = 12345567899L;  //Añadir L al final
        System.out.println("varlong = " + varlong);
        String str = varlong.toString();
        System.out.println("str = " + str);
        d =  varlong.doubleValue();
        System.out.println("d = " + d);
        System.out.println("bits = " + Long.bitCount(12354646)); //Número de bits

        //Float y Double (igual que anterior
        System.out.println(Double.isNaN(33456777));  //isNAN significa ¿No un número? Da falso porque sí es un número.
        System.out.println(Double.isNaN('s')); //Un carácter tiene una representación numérica

        // Character
        Character c = Character.valueOf('1');
        Character c1 = 'b';
        System.out.println("c1 = " + c1);
        char c2 = c.charValue();
        System.out.println("c.charValue() = " + c2);
        System.out.println("c.isDigit() = " + c.isDigit(c)); //¿El carácter es un número (true) o letra (false)?
        System.out.println("Character.isAlphabetic(c) -> " + Character.isAlphabetic(c));  //Es una letra A-Z?
        System.out.println("Character.isUpperCase(c1) -> " + Character.isUpperCase(c1));
    }
}
