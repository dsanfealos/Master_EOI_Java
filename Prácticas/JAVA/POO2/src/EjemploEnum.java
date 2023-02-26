public class EjemploEnum {
    public static void main(String[] args) {
        Color miColor = Color.AZUL;
        System.out.println("miColor = " + miColor);
        System.out.println("--------------------");

        System.out.println(Color.values()[0]); //El enumerador es como una matriz, así que seleccionamos la posición

        //Recorrer valores enumerador
        for( Color elColor:Color.values()){
            System.out.println("elColor = " + elColor);
        }
        System.out.println("--------------------");

        //Toma de decisiones - Control de flujo
        //if
        if (miColor  == Color.AZUL){
            System.out.println("El color es azul");
        }else{
            System.out.println("El color no es azul");
        }
        System.out.println("--------------------");


        //switch - notación 1
        switch (miColor){
            case BLANCO:
                System.out.println("El color es Blanco");
                System.out.println("otra");
                break;
            case VERDE:
                System.out.println("El color es VERDE");
                System.out.println("otra más");
                break;
            case AZUL:
                System.out.println("El color es AZUL");
                System.out.println("otra más aún");
                break;
            case AMARILLO:
                System.out.println("El color es AMARILLO");
                System.out.println("otra");
                break;
            case NEGRO:
                System.out.println("El color es NEGRO");
                System.out.println("otra");
                break;
            case ROJO:
                System.out.println("El color es ROJO");
                System.out.println("otra");
                break;
            case GRIS:
                System.out.println("El color es GRIS");
                System.out.println("otra");
                break;
        }
        System.out.println("--------------------");

        //switch - notación 2
        switch ((miColor)){  //No tiene break y tras cada case hay -> en lugar de : . Funciona exactamente igual
            case BLANCO -> { //Si solo hubiese una línea de instrucción, no requeriría de llaves
                System.out.println("El color es Blanco");
                System.out.println("otra");
            }
            case AZUL -> {
                System.out.println("El color es AZUL");
                System.out.println("otra más aún");
            }
            //...
        }
        System.out.println("--------------------");


    }
}
