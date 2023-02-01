import java.util.Arrays;

public class MetodosArrays {
    public static void main(String[] args) {
        String[] colores1 = {"azul","Rojo","verde","amarillo","naranja"};
        int[] numeros = {3,2,5,4,3,6};
        int[] numeros1 = {2,8,3,5,4,9};

        //Buscar. OJO con este método, que funciona fatal. Sólo arrays ordenados y con valores únicos.
        System.out.println("Arrays.binarySearch(numeros,6) = " + Arrays.binarySearch(numeros,3));  //Dice en qué posición se encuentra el valor (sólo la primera coincidencia.
        System.out.println("Arrays.binarySearch(numeros,6) = " + Arrays.binarySearch(numeros,3,6,3));  //buscar el valor (key) desde posición 2 a posición 6 (no incluidos).


        //Ordenar
        Arrays.sort(numeros);
        for (int a:numeros){
            System.out.println("a = " + a);
        }
        System.out.println("Arrays.binarySearch(numeros,3) = " + Arrays.binarySearch(numeros,3));  //Dice en qué posición se encuentra el valor (sólo la primera coincidencia.
        System.out.println("Arrays.binarySearch(numeros,2º3) = " + Arrays.binarySearch(numeros,3,6,3));  //buscar el valor (key) desde posición 2 a posición 6 (no incluidos).

        System.out.println("----------------------");

        Arrays.sort(colores1);  //Ordenación lexicográfica, que es su código ascii, por lo que es alfabética pero las mayúsculas tienen preferencia.
        for (String color:colores1){
            System.out.println("color = " + color);
        }

        //Comparar. funciona raro también
        System.out.println("Arrays.equals(numeros,numeros1) = " + Arrays.equals(numeros, numeros1));
        System.out.println("Arrays.compare(numeros, numeros1) = " + Arrays.compare(numeros, numeros1));
        System.out.println("Arrays.compare(numeros,1,5, numeros1,1,5) = " + Arrays.compare(numeros,2,4, numeros1,3,5));

        //copiar
        int[] copia = Arrays.copyOf(numeros,numeros.length);
        for (int a:copia){
            System.out.println("a = " + a);
        }
        System.out.println("--------------------------");

        //copiar desde una posición
        int[] copiaRango = Arrays.copyOfRange(numeros,2,numeros.length);
        for (int a:copia){
            System.out.println("a = " + a);
        }
        System.out.println("--------------------------");

        //Rellenar
         int[] miMatriz = new int[8]; //Al crear con String, el vacío es null. Al crear con int, el vacío es 0.
         for (int i:miMatriz){
             System.out.println("i = " + i);
         }
        System.out.println("--------------------------");

         Arrays.fill(miMatriz,1); //Rellenamos con valor 1
        for (int i:miMatriz){
            System.out.println("i = " + i);
        }
        System.out.println("--------------------------");

        //Bidimensional
        int[][] bidi = new int[3][4];
        bidi[0][0] = 23;

        int[][] bidi1 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        int[][] bidi2 = new int[4][];  //la segunda no la defino, para ponerla de diferentes tamaños a continuación.
        bidi2[0] = new int[4];
        bidi2[1] = new int[3];
        bidi2[2] = new int[7];
        bidi2[3] = new int[2];

        int[][] bidi3 = {{1,2,3,13,14},{4,5,6},{7,8,9,15},{10,11}};
        for (int i = 0; i < bidi3.length; i++){
            for (int j =0; j < bidi3[i].length; j++){
                System.out.println("bidi3[" + i + "][" + j + "] = " + bidi3[i][j]);
            }
        }

    }
    //Método de búsqueda por McTxus.
    public static int search(int arr[], int x)

    {

        int N = arr.length;

        for (int i = 0; i < N; i++) {

            if (arr[i] == x)

                return i;

        }

        return -1;

    }
}
