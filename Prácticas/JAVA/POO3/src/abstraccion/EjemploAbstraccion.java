package abstraccion;

public class EjemploAbstraccion {
    public static void main(String[] args) {
        //Persona miPersona = new Persona(); //No puede ser instanciado un objeto desde una clase abstracta

        HijaPersona miPersona = new HijaPersona("Eduardo", "Corral","eduardo@gmail.com","C/Vinos, 3-5");
        miPersona.visitarAPapa();
        System.out.println(miPersona.nombreCompleto());  //de la clase padre
        miPersona.editar();
        miPersona.registro();
        miPersona.borrar();

        //crear una abstracta FIGURAGEOMETRICA con PI

        Circulo miCirculo = new Circulo(5);
        miCirculo.perimetro();
        //miCirculo.pi = 3;  //pi es constante, pero se puede usar sin cambiarlo usando el private y un getter (o con final)
    }
}
