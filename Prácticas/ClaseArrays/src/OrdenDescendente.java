import java.util.Arrays;

public class OrdenDescendente {
    public static void main(String[] args) {
        //Ordenar un array numérico en orden descendente
        int[] numeros = {2,7,9,3,1,5};
        ordenInverso(numeros);

        for (int i:numeros){
            System.out.println("i = " + i);
        }
        System.out.println("----------------------------");

        //Ordenar un array String en orden descendente
        String[] colores = {"azul","rojo","verde","amarillo","naranja"};
        ordenInverso(colores);

        for (String i:colores){
            System.out.println("i = " + i);
        }

    }
    //Lo metemos en un método porque lo aplicaremos también a Strings
    public static void ordenInverso(int[] num){
        Arrays.sort(num);  //Para ordenar el número antes
        int[] auxiliar = Arrays.copyOf(num,num.length); //Lo hacemos para no machacar la matriz inicial
        for (int i = 0; i < num.length; i++){
            int indice = num.length - i - 1;  //-1 porque el primer valor es 0
            num[i] = auxiliar[indice];

        }

    }

    public static void ordenInverso(String[] col){
        Arrays.sort(col);
        String[] aux = Arrays.copyOf(col,col.length);
        for (int i = 0; i < col.length; i++){
            int indice = col.length - i - 1;
            col[i] = aux[indice];

        }
    }

}
