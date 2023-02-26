import javax.swing.*;
//Importamos una librería para usar el JOptionPane.
// Al hacer añadir * al final, decimos que lo importe todo.
public class IntroduciendoDatos {
    public static void main(String[] args) {
        //En este programa introduciremos datos y se convertirán.
        //Leer dato (String)
        //dato = "14"; Es texto, no número, ya que va entre comillas.
        String dato;
        dato = JOptionPane.showInputDialog(null,"Introduce un entero");  //Lo del recuadro blanco se escribe solo.

        //Convertir dato a entero y representarlo.
        //Para hacerlo con desde Octal, por ejemplo, usaríamos
        // el .parseInt(dato, 8), porque elegimos base 8.
        // Igual con binario (2) y hexadecimal (6).
        int numDecimal = Integer.parseInt(dato);
        System.out.println("numDecimal = " + numDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numDecimal));
    }
}
