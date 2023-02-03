public class EjemploFiguraGeometrica {
    public static void main(String[] args) {
        FiguraGeometrica triangulo = new FiguraGeometrica("triangulo",3,2);
        System.out.println("triangulo.info() = " + triangulo.info());
        System.out.println("triangulo.perimetro() = " + triangulo.perimetro());
        System.out.println("---------------");
        FiguraGeometrica circulo1 = new FiguraGeometrica("Círculo",0,1.5f);
        System.out.println("circulo1.info() = " + circulo1.info());
        System.out.println("circulo1.perimetro() = " + circulo1.perimetro());


    }
}
