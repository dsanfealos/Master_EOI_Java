package ConAbstracta;

public class ClaseHija extends Abstracta{

    @Override
    void saludo() {   //No pone public porque no lo he definido como tal en la abstracta, y puede er de diferentes tipos
        System.out.println("UNO");
    }

    @Override
    public void metodoInterfaz1() {  //Pone public porque en una interfaz todos son públicos sí o sí
        System.out.println("DOS");
    }

    @Override
    public void metodoInterfaz1B() {
        System.out.println("TRES");
    }

    //Se puede sobrecargar un método abstracto
    public void metodoInterfaz1B(int a){
        System.out.println("a = " + a);
    }

}
