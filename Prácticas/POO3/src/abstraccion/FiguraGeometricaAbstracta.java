package abstraccion;

abstract class FiguraGeometricaAbstracta {
    final double pi = Math.PI;  //Con el final se hereda igual (pero no modificar o Override), pero se mantiene constante (revisar)

    public double getPi() {
        return pi;
    }

    abstract public void perimetro();
    abstract public void superficie();
    abstract public void grafico();
}
