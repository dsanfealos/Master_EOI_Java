package abstraccion;

public class Cuadrado extends FiguraGeometricaAbstracta{
    float lado;
    int numLados;

    public Cuadrado(float lado, int numLados) {
        this.lado = lado;
        this.numLados = numLados;
    }

    @Override
    public void perimetro() {
        float perimCuadrado = lado * numLados;
        System.out.println("perimCuadrado = " + perimCuadrado);
    }

    @Override
    public void superficie() {
        float supCuadrado = lado * lado;
        System.out.println("supCuadrado = " + supCuadrado);
    }

    @Override
    public void grafico() {
        System.out.println("Dibujo un cuadrado");
    }
}
