public class Ejercicio1 {
    public static void main(String[] args) {

        //Solución 1 (correcta)
        String miFoto = "Navidad.jpg";
        System.out.println("Nombre = " + miFoto.substring(0,miFoto.lastIndexOf('.')));
        System.out.println("Extensión = " + miFoto.substring(miFoto.lastIndexOf('.')+1));


        //Solución 2 (Sólo en este caso)
        String[] separado = miFoto.split("\\.");// las \\ son para que pueda entender el . porque está esperando una "expresión regular"
        System.out.println("nombre = " + separado[0]);
        System.out.println("extensión = " + separado[1]);

        //Solución 3 (correcta)(igual que solución 1 pero más elegante y clara)
        int punto = miFoto.lastIndexOf('.');
        System.out.println("nombre = " + miFoto.substring(0,punto));
        System.out.println("extensión = " + miFoto.substring(punto+1));
    }
}
