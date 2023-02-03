public class FiguraGeometrica {
    //Atributos
    String nombre;
    int numLados;
    float lado;
    float radio;
    final float pi = 3.14f;

    //Métodos de la clase ("comportamiento")
    //perímetro, superfície, info, constructor

    public float perimetro(){
        float perimetro = 0;
        if (numLados >1) {
            perimetro =numLados * lado;

        }else{
            perimetro = pi * lado;
        }
        return perimetro;
    }

    public double perCirculo(float radio){
        return pi * 2 * radio;
    }

    public float superficie(){
        float superficie = 0;
        //TODO
        return superficie;
    }

    public float supCuadrado(float lado, int numLados){
        if (numLados >1) {
            return lado * lado;
        }else{
            return pi * lado * lado;
        }
    }

    //to string

    public String info () {
        return "FiguraGeometrica{" +
                "nombre='" + nombre + '\'' +
                "\nnumLados=" + numLados +
                "\nlado=" + lado +
                "\nradio=" + radio +
                "\npi=" + pi +
                "\nperimetro = " + perimetro() +
                "\nsuperficie = " + superficie();
    }

    //Constructor

    public FiguraGeometrica(String nombre, int numLados, float lado) {
        this.nombre = nombre;
        this.numLados = numLados;
        this.lado = lado;
    }

}
