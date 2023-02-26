public class Operadores {
    public static void main(String[] args) {
        //Incremento y decremento
        int a = 10;
        System.out.println("a = " + a);  //El valor que le hemos dado (10)
        System.out.println("++a = " + ++a);  //11, porque ha incrementado en 1 la a
        System.out.println("a = " + a);  //11, porque nuestra variable ha cambiado
        System.out.println("a++ = " + a++); //11 porque hace la operación después de enseñarnos el valor de a previo a la operación.
        System.out.println("a = " + a); //12 porque a ha vuelto a cambiar.
        System.out.println("--a = " + --a); //Lo mismo en sentido contrario.
        System.out.println("a-- = " + a--);
        System.out.println("a = " + a);

        // módulo es el resto de la división entera
        //Esto sirve para diferenciar entre pares e impares.
        int b = 2;
        int c = 8;
        System.out.println("módulo = " + (c % b));  //El símbolo % es el de módulo. En divisiones exactas será igual a 0.


        //Operadores de asignación
        // += y -=
        c += b; //c = c + b;
        System.out.println("c += b -> " + c);
        c -= b; //c = c - b;
        System.out.println("c -= b -> " + c);

        // *= y /=
        c *= 2; //c = c * 2;
        System.out.println("c *= 2 -> " + c);
        c /= 4; // c = c / 4;
        System.out.println("c /= 4 -> " + c);

        // %=
        c %= 3; //c = c % 3;
        System.out.println("c %= 3 -> " + c);

        //Operaciones relacionales
        System.out.println("b > c = " + (b > c));  //True. Lo ponemos entre paréntesis para que no lo lea como String.
        System.out.println("b >= c = " + (b >= c));  //True
        System.out.println("b < c = " + (b < c));  //False
        System.out.println("b <= c = " + (b <= c));  //False
        System.out.println("b == c = " + (b == c));  //False
        System.out.println("b != c = " + (b != c));  //True


        //Operador ternario
        //Tipo variable = (condición) ? valor1(true) : valor2(false);
        //if(condición) then {variable = valor1;} else {variable = valor2}; EN JAVA NO SE USA THEN
        int resultado = (c < a) ? 3 : 5;
        System.out.println("resultado = " + resultado);

        //Operadores lógicos
        System.out.println("(c < a) AND (b < a) = " + ((c < a) && (b < a)));  //Muestra si ambos son verdaderos
        System.out.println("(c > a) Or (b > a) = " + ((c > a) || (b > a)));  //Verdadero si alguno de ellos es verdadero
        System.out.println("NOT(b > a) = " + !(b > a));  //Dice verdadero si la afirmación es falsa. Se usa cuando queremos realizar una acción al recibir una acción como falsa.
        

    }
}
