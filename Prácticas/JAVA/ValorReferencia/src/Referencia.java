public class Referencia {
    public static void main(String[] args) {
        int[] argumento = {10,20,30,40};
        for (int i = 0; i < argumento.length; i++){
            System.out.println("main inicio - argumento[" + i + "] = " + argumento[i]);

        }
        miMetodo(argumento);
        for (int i = 0; i < argumento.length; i++){
            System.out.println("main final - argumento[" + i + "] = " + argumento[i]);
        }
    }

    public static void miMetodo(int[] matriz){
        //Incrementamos cada valor en 5
        for(int i = 0; i < matriz.length; i++){
            matriz[i] += 5;
        }

    }

}
