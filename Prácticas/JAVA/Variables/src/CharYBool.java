public class CharYBool {
    public static void main(String[] args) {
        //Tipo char
        //Carácter
        char caracter = '@';
        System.out.println("caracter = " + caracter);

        //Unicode
        char caracter1 = '\u0021';
        System.out.println("caracter1 = " + caracter1);

        //ASCII (Los 31 primeros caracteres no son imprimibles)
        char caracter2 = 66;
        System.out.println("caracter2 = " + caracter2);

        char caracter3 = 'a';
        System.out.println("caracter3 = " + caracter3);

        //Tipo Booleano
        boolean dato = true; //false también vale
        System.out.println("dato = " + dato);

        int a,b;
        a = 4;
        b = 7;
        dato = a > b;
        System.out.println("dato = " + dato);
        dato = a < b;
        System.out.println("dato = " + dato);
        dato = (b - a) != 3;//¿Es b-a distinto de 3?
        //Si escribimos soutv, en la parte del texto ya aparece nuestra variablie
        System.out.println("dato = " + dato);
    }
}
