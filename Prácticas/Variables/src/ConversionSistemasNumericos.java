public class ConversionSistemasNumericos {
    public static void main(String[] args) {
        //Escribir en binario omitiendo las 4 primeras cifras implica que son 0000.
        //Lo hemos puesto como binario porque sí. Convertimos Decimal al resto de
        // sistemas numéricos.
        int numDecimal = 0b1110;
        System.out.println("numDecimal = " + numDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numDecimal));

    }
}
