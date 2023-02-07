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

    public double superficie(){
        double sup = 0;

        if (numLados == 0){
            sup = Math.PI * Math.pow(lado, 2);  //Math.pow (lado, 2) es igual a lado^2. No hay otra forma aparte de lado * lado.
        }else if (numLados == 3){
            double h = Math.sqrt(Math.pow(lado,2) - Math.pow((lado/2), 2));  //pitágoras para conseguir h
            sup = (lado * h ) / 2;
        }else if (numLados == 4){
            sup = lado * lado;
        }else if (numLados >= 5){
            double alfa = 2*Math.PI / numLados;
            double apotema = lado / (2 * Math.tan((alfa / 2))); //tangente de (alfa/2)
            sup = (perimetro()*apotema)/2;
        }
        return sup;
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
