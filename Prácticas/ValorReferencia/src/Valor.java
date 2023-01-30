public class Valor {
    public static void main(String[] args) {

        int argumento = 45; //Este es una variable global

        System.out.println("main inicio - argumento = " + argumento);
        int resultado = miMetodo(argumento);
        System.out.println("main final - argumento = " + argumento);
        System.out.println("resultado = " + resultado);
    }

    public static int miMetodo(int argumento){
        System.out.println("miMetodo inicio = " + argumento);
        argumento = 54;  //Lo que pasa en el método se queda en el método
        System.out.println("miMetodo salida = " + argumento);
        return argumento;
    }

}
