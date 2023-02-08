public class Vehiculo {
    String marca;
    String modelo;
    float potencia;
    protected String disenyador = "Pepe Pérez";

    public void claxon(){
        System.out.println("¡tuu, tuu!");
    }

    public void avanzar(){
        System.out.println("¡Avanzo!");
    }

    protected String getDisenyador() {
        return disenyador;
    }
}
