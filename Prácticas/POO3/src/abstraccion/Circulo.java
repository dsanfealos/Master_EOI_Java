package abstraccion;

public class Circulo extends FiguraGeometricaAbstracta{
    double radio;

    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void perimetro() {
        double per = 2 * radio * pi;
        System.out.println("perímetro = " + per);
    }

    @Override
    public void superficie() {
        double sup = pi * radio * radio;
        System.out.println("superficie = " + sup);
    }

    @Override
    public void grafico() {
        System.out.println("Dibujo el círculo");
    }
}
