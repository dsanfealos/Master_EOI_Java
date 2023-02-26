public class GeneralidadesArrays {
    public static void main(String[] args) {
        //Declaraciones
        String[] colores1 = {"azul","rojo","verde","amarillo","naranja"};

        String[] colores2 = new String[5]; //Vacío
        for (int i = 0; i < colores1.length; i++){
            System.out.println("colores1[i] = " + colores1[i]);
        }

        System.out.println("-----------------------------------");

        for (int i = 0; i < colores2.length; i++){
            System.out.println("colores2[i] = " + colores2[i]);
        }
        System.out.println("-----------------------------------");

        //Asignar valores
        colores2[0] = "azul";
        colores2[1] = "rojo";
        colores2[2] = "blanco";
        colores2[3] = "amarillo";
        colores2[4] = "negro";

        for (int i = 0; i < colores2.length; i++){
            System.out.println("colores2[i] = " + colores2[i]);
        }
        System.out.println("-----------------------------------");

        //copiar una matriz en otra
        for (int i = 0; i < colores1.length; i++){
            colores2[i] = colores1[i];
            System.out.println("colores2[i] = " + colores2[i]);
        }
        System.out.println("-----------------------------------");

        //matriz inversa
        // colores2[0]= colores1[4]
        // colores2[1]= colores1[3]
        // colores2[2]= colores1[2]
        // colores2[3]= colores1[1]
        // colores2[4]= colores1[0]

        for (int i = 0; i < colores2.length; i++){
            int indice = colores2.length - i - 1;  //-1 porque el primer valor es 0
            colores2[i] = colores1[indice];
            System.out.println("colores2[" + i +"] = " + colores2[i]);
        }

    }
}
