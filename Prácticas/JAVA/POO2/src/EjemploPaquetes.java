import subpaquete.Persona;
import subpaquete.Amigos;
public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona vecino = new Persona("Ana","García","ana@eoi.es",Amigos.PEPE,"Valencia");
        vecino.setDireccion("mi calle, 33");
        System.out.println("vecino.toString() = " + vecino.toString());

    }
}
