import subpaquete.Modificadores;

public class OtroEjemploPaquetes {
    public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in);  //Se puede hacer esto en lugar de importar, pero no hay diferencia a menos que estemos importando demasiadas bibliotecas

        Modificadores objeto = new Modificadores("Eduardo", "Corral", 17);
        objeto.nombreCompleto();
        objeto.nombre = "Paco";
        objeto.setApellidos("Pérez");
        objeto.setEdad(20);  //porque está con private
        objeto.llamaTonteria();
        System.out.println(objeto.toString());
    }
}
