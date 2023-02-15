import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        //declaración
        HashMap<Integer,String> listin = new HashMap<>();

        //Agregar información
        listin.put(609609609, "Pepe");
        listin.put(609609610, "Berta");
        listin.put(609609611, "Ana");
        listin.put(609609619, "Juan");
        listin.put(609609629, "Evaristo");



        //Obtener un valor
        System.out.println("listin.get(609609610) = " + listin.get(609609610));
        System.out.println("-----------");
        //Obtener todas las claves
        System.out.println("listin.keySet() = " + listin.keySet());
        System.out.println("-----------");
        //Obtener todos los valores
        System.out.println("listin.values() = " + listin.values());
        System.out.println("-----------");
        recorrer(listin);
        recorrer2(listin);

        //Modificar
        listin.replace(609609609,"José");
        recorrer2(listin);
        listin.replace(609609619,"Juan","Paco");
        recorrer2(listin);

        //Borrar una clave determinada
        listin.remove(609609609);


    }

    public static void recorrer(HashMap<Integer,String> mapa){
        for (Integer clave : mapa.keySet()){
            System.out.println("Clave = " + clave + "----->" + mapa.get(clave));
        }
        System.out.println("-----------");
    }
    public static void recorrer2(HashMap<Integer,String> mapa){
        mapa.forEach((telefono,nombre) -> {
            System.out.println("telefono = " + telefono + " nombre = " + nombre);
        });
        System.out.println("-----------");
    }
}
