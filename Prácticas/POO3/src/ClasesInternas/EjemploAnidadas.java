package ClasesInternas;

public class EjemploAnidadas {
    public static void main(String[] args) {
        ClaseExterna objetoExterno = new ClaseExterna();
        System.out.println("objetoExterno.x = " + objetoExterno.x);
        objetoExterno.moduloVector(objetoExterno.miVector);

        //Instanciar objeto de clase interna (a partir del objeto creado con la clase externa)
        ClaseExterna.Vector unVector = objetoExterno.new Vector(5,6);
        System.out.println(unVector.x);

        //No se pueden instanciar objetos de una clase interna privada
        //ClaseExterna.Interna1 unInterna1 = objetoExterno.new Interna1();
        //System.out.println(unInterna1.k);

        ClaseExterna.InternaStatic miStatic = new ClaseExterna.InternaStatic(); //Con static sí deja
    }
}
