import java.util.ArrayList;
import java.util.Collections;

public class EjercicioArrays {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(3);
        num.add(5);
        num.add(7);
        num.add(9);
        num.add(3);
        num.add(2);
        num.add(4);
        num.add(8);

        Collections.sort(num);
        System.out.println(num);

        ArrayList<String> conNombre = new ArrayList<>();
        conNombre.add("Juan");
        conNombre.add("Patricia");
        conNombre.add("Alberto");
        conNombre.add("Ana");
        conNombre.add("Julián");

        Collections.sort(conNombre);
        System.out.println(conNombre);
    }
}
