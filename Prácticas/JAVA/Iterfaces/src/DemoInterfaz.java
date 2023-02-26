public class DemoInterfaz {
    public static void main(String[] args) {
        //Imlementando 1 interfaz
        EjemploInterfaz objetoEduardo = new EjemploInterfaz("Eduardo","Corral");
        System.out.println("objetoEduardo.nombre = " + objetoEduardo.nombre);
        System.out.println("objetoEduardo.nombreCompleto() = " + objetoEduardo.nombreCompleto());
        System.out.println("objetoEduardo.CONSTANTE1 = " + objetoEduardo.CONSTANTE1);
        objetoEduardo.metodoInterfaz1();
        //Una interfaz tiene como ventaja que una clase puede heredar más de una interfaz, teniendo más de un "padre".
        //Otra ventaja sería que alcanza una abstracción mayor

        //La clase abstracta puede almacenar métodos abstractos y no abstractos, atributos, etc., mientras
        //que en interfaz solo tiene constantes y métodos abstractos. Nada de atributos o métodos normales.

        System.out.println("--------------------");

        //Implementando 2 interfaces
        EjemploInterfazDos objetoPepe = new EjemploInterfazDos("Pepe","Rodriguez");
        System.out.println("objetoPepe.nombre = " + objetoPepe.nombre);
        System.out.println("objetoPepe.nombreCompleto() = " + objetoPepe.nombreCompleto());
        System.out.println("objetoPepe.CONSTANTE1 = " + objetoPepe.CONSTANTE1);
        System.out.println("objetoPepe.CONSTANTE2 = " + objetoPepe.CONSTANTE2);
        objetoPepe.metodoInterfaz1();
        objetoPepe.metodoInterfaz2();
    }
}
