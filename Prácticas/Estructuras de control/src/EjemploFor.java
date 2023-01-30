public class EjemploFor {
    public static void main(String[] args) {
        //Mostrar del 1 al 20 con diferentes incrementos
        // Incremento 1
        /*for (int i = 1; i <= 20; i++) {  //Se usa i por ser la más común, pero vale todo
            System.out.println("i = " + i);  //En una estructura while, el i++ estaría en el propio bucle
        }
        System.out.println("-----------------");

        //Incremento 2
        for (int i = 1; i <= 20; i = i +2) {
            System.out.println("i = " + i);
        }
        System.out.println("--------------");

        //Incremento 5
        for (int i = 1; i <= 20; i = i +5) {  //Igual que i += 5
            System.out.println("i = " + i);
        }
        System.out.println("--------------");

        //Sumar del uno al veinte
        int suma = 0;
        for (int i = 1; i <= 20; i = i ++) {
            suma = suma + i;
            System.out.println("i = " + i);
        }
        System.out.println("suma = " + suma);
        System.out.println("--------------");*/

        //Mostrar caracteres cuyo código ASCII va del 65 al 90
        char caracter = 'k'; //vale lo que sea
        for (int i = 65; i <= 90; i++) {
            caracter = (char)i;  //Para convertir en char un entero
            System.out.println("i - carácter = " + i + "-" + caracter);
        }

        System.out.println("--------------");

        //Recorrer matriz
        String[] coches = {"Volvo", "Renault", "Seat", "Citroen"};
        for (int i = 0; i < coches.length; i++){
            System.out.println("coches[i] + i = " + coches[i] + " " + i);
        }

        //for each. recorre la matriz sin usar el indice
        for (String marca: coches){
            System.out.println("marca = " + marca);
        }

        //Bucles for anidados. Sirven para recorrer matrices bidimensionales
        int[][] numeros = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < numeros.length; i++){
            for (int k = 0; k < numeros[i].length; k++){
                System.out.println("numeros [" + i + "][" + k + "]" + numeros[i][k]);
            }
        }

        //Con el for each. Poco útilporque no sé en qué parte de la matriz estoy
        for(int[] mat:numeros){
            for (int valor:mat){
                System.out.println("valor = " + valor);
            }
        }
    }
}
