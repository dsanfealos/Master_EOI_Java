public class SistemasNumericos {
    public static void main(String[] args) {
        //En decimal. Vale tanto int como short, byte y long,
        // pero estos últimos se utilizan sólo a la hora de optimizar la memoria.
        int numDecimal = 14;
        System.out.println("numDecimal = " + numDecimal);

        //Desde binario a decimal.
        int numBinario = 0b00001110;
        System.out.println("numBinario = " + numBinario);

        //Desde octal a decimal
        int numOctal = 016;
        System.out.println("numOctal = " + numOctal);

        //Desde hexadecimal a decimal.
        // Da igual escribir en mayúscula o minúscula la letra.
        int numHexadecimal = 0x0e;
        System.out.println("numHexadecimal = " + numHexadecimal);
        System.out.println("---------------------------------------");


    }
}
