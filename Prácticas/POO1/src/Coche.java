public class Coche {

        //Atributos (estado/características). No usamos método main aún.
        String marca;
        String modelo;
        String color;
        String carroceria;
        float potencia;
        float cilindrada;
        String combustible;
        float rpm;
        float km;
        float deposito;
        final static String eCall = "112";  //esto es una constante, por eso usamos final antes.
        static String distintivo = "E";



    //Métodos ("comportamiento"). No se usa static para poder usarlo fuera de esta clase.
    public void arrancar(){
        rpm = 800;
    }

    public void acelerar(float rpm){
        //Sin usar "this", al ser los dos "rpm", el programa
        // los confundiría. Colocamos el this en el que pertenece a esta clase
        this.rpm += rpm;
    }

    public void frenar(float deceleracion){
        rpm-= deceleracion;
    }

    public String detallesCoche(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nColor: " + color;
    }

    //static significa que puede ser llamado sin necesidad de crear un objeto.
    public static void llamarEmergencias(){
        System.out.println("Hago una llamada al " + eCall);
    }

    public float consumo(float distancia){
        //Siempre lleno el depósito y siempre lo vacío.
        return this.deposito/distancia * 100;  //El combustible que consume por 100km (l/km * 100 es l/100Km)(No te ralles, lo entendiste en su momento y es así)

    }

    public float consumo(float distancia, float repostado){
        return repostado / distancia * 100;
    }

}
