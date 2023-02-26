public class Serpiente extends Animal{
    //Serpiente


    float grosor;
    String tipoEscamas;
    boolean venenosa;
    String horarioActividad;

    public void morder(){
        System.out.println("Clavo colmillos");
    }
    public void enroscar(){
        System.out.println("Me enrosco.");
    }
    public void sonido(String son){
        System.out.println("El sonido que emite el animal es: " + son);
    }
}
