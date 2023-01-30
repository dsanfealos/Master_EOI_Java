import java.sql.SQLOutput;

public class EjemploWhile {
    public static void main(String[] args) {
        //Recorrer los primeros 20 números naturales
        //while
        int contador = 0;
        while(contador <= 20){
            System.out.println("contador = " + contador);
            contador++; //Debo indicar que aumenta, pero ya dentro del bucle
        }

        //do...while
        contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        }while (contador <= 20);

        //Recorrer matriz
        String[] coches = {"Volvo", "Renault", "Seat", "Citroen"};
        //while.
        int i = 0;
        while (i < coches.length){
            System.out.println("coches[i] + i = " + coches[i] + " " + i);
            i++;
        }

        //do...while
        i = 0;
        do {
            System.out.println("coches[i] + i = " + coches[i] + " " + i);
            i++;
        }while (i < coches.length);
        System.out.println("-----------------------");

        // Diferente condición salida
        boolean salir = false;
        i = 0;
        while(salir == false){  //También vale (!salir)
            System.out.println("coches[i] + i = " + coches[i] + " " + i);

            if(coches[i] == "Seat") { //Para detener el bucle si esto se cumple
                salir = true;  //Aquí cambiariamos el true por !salir
            }
            i++;  //Lo bajamos para que la comparación del final (Volvo) ocurra correctamente
        }
        System.out.println("------------------");

        // break y continue
        // break interrumpe el bucle
        for (String marca:coches){
            System.out.println("marca = " + marca);
            if (marca == "Seat"){
                break;  //Para detener bucle, pero no el programa
            }
        }
        System.out.println("------------------");

        i = 0;
        while (i < coches.length){
            System.out.println("coches[i] + i = " + coches[i] + " " + i);
            if (coches[i] =="Seat") break; //Cuando es una sola línea de código, no necesitamos las llaves
            i++;
        }
        System.out.println("------------------");

        //continue

        for (String marca:coches){
            if (marca == "Seat"){
                continue;  //Saltamos "Seat"
            }
            System.out.println("marca = " + marca);
        }

        System.out.println("------------------");

        i= 0;
        while (i < coches.length){
            if (coches[i] == "Seat"){
                i++;
                continue;  //Ignora el resto del bucle y lo reinicia, por lo que salta estas 2 siguientes líneas.
            }
            System.out.println("coches[i] + i = " + coches[i] + " " + i);
            i++;
        }
        System.out.println("------------------");
        System.out.println("Resto del programa");

    }
}
