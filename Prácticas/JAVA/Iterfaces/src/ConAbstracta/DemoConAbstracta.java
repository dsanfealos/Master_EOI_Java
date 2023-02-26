package ConAbstracta;

public class DemoConAbstracta {
    public static void main(String[] args) {
        ClaseHija objeto = new ClaseHija();
        objeto.direccion = "la mía";
        objeto.hola();
        objeto.saludo();
        System.out.println(objeto.CONSTANTE1);
    }
}
