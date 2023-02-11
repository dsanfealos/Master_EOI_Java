public class Final {

    //Revisar clase 9/2/2023 9:00-11:00
    public static void main(String[] args) {
        Telefono miTelefono = new Telefono("+34558669884","Nokia","AS10");
        miTelefono.marcar("665993771");
        miTelefono.colgar();
        System.out.println("-------------------------------");


        SamsungS23 miSamsung = new SamsungS23("+34456857309","Samsung","S23","64GB","5G");
        miSamsung.marcar("867493746");
        miSamsung.marcar("857463524",3);
        miSamsung.colgar();
    }
}

class Telefono{  //superclase - padre. Si la declaramos como final, no se puede heredar.
        protected  String numero;
        protected String marca;
        protected String modelo;

        public final void marcar(String num){  //Al ser final en la clase padre no se puede anular (sobreescribir)
            System.out.println("llamando al " + num);
        }

        public void colgar(){
            System.out.println("Colgando llamada!");
        }

        public Telefono (String numero, String marca, String modelo){
            this.numero = numero;
            this.marca = marca;
            this. modelo = modelo;
        }
}
class SamsungS23 extends Telefono{  //subclase - hija
    private String memoria;
    private String comunicacion;

    public void marcar(String num, int reintentos){
        System.out.println("Marcando en mi Samsung el "+ num + " con " + reintentos + " reintentos.");
    }
    public SamsungS23(String numero, String marca, String modelo, String memoria, String comunicacion) {
        super(numero, marca, modelo);
        this.memoria = memoria;
        this.comunicacion = comunicacion;
    }
}

