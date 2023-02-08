public class Automovil extends Vehiculo{  //extends + Clasede la cual queremos que herede cosas
    int ruedas;
    String combustible;

    public void abrirMaletero(){
        System.out.println("Abro el maletero.");
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "ruedas=" + ruedas +
                ", combustible='" + combustible + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
