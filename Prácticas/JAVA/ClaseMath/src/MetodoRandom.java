public class MetodoRandom {
    public static void main(String[] args) {
        //Math.random() produce un número aleatorio entre 0.0 y 1.0 (no incluido), devolviendo un double.
        //Para conseguir un entero
      for (int i = 0; i<100; i++) {
            System.out.println(Math.random());
        }

        System.out.println("-----------------------------");

        //Con 2 decimales
        for (int i = 0; i<100; i++) {
            int n = (int)(Math.random() * 100);  //Lo convertimos en número entero
            System.out.println("n = " + n);
            float k = n;
            System.out.println("k / 100 = " + k / 100);
            System.out.println("-----------------------------");
        }

        //Aleatorio del 0 al 100
        for (int i = 0; i < 100; i++){
            int n = (int)(Math.random() * 101);  //Aunque saliese un 100,9 la conversión a int lo transfomraría en 100.
            System.out.println("n = " + n);
        }
        System.out.println("-----------------------------");


        //Aleatorio del 1 al 90 (Bingo)
        for (int i = 0; i < 100; i++){
            int n = 1 + (int)(Math.random() * 90);  //El 1 + es para que nunca sea 0 el número generado
            System.out.println("n = " + n);
        }
        System.out.println("-----------------------------");

        //Juego del Bingo (sin paradas)
        //Solucion 1
        int[] bingo = new int[91];
        int cont = 0;
        while(cont < 90){
            int n = 1 + (int)(Math.random() * 90);
            if (bingo[n] != n) {  //Si un número no ha salido ya...
                System.out.println("n = " + n);
                bingo[n] = n;  //Asignamos el valor 5 (por ej.) a posicion 5
                cont++;
            }
        }
        System.out.println("-----------------------------");

        //Solucion 2
        int[] bingo1 = new int[90];
        cont = 0;
        while(cont < 90){
            int n = 1 + (int)(Math.random() * 90);
            if (bingo1[n-1] != n) {  //Para no tener que añadir un número de espacio a la matriz
                System.out.println("n = " + n);
                bingo1[n-1] = n;
                cont++;
            }
        }

        System.out.println("-----------------------------");

        //Bingo - Número a número. Un único número aleatorio entre 1 y 90.
        int[] bingo2 = new int[90];
        //Debería ser controlado desde la consola. Cada vez que pulse una tecla se ejecuta
        boolean salir = false;
        while(!salir) {
            int n = 1 + (int) (Math.random() * 90);
            if (bingo2[n - 1] != n) {
                System.out.println("n = " + n);
                bingo2[n - 1] = n;
                salir = true;  //En cuanto un número sale no repetido, acaba el bucle.
            }
            //salir cuando ya estén todos los números
            //Contador
        }

    }
}
