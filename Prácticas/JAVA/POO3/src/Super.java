public class Super {
    public static void main(String[] args) {
        Persona miPersona = new Persona("Eduardo","Corral");
        System.out.println(miPersona.toString());
        System.out.println("------------------");

        Alumno miAlumno = new Alumno("Eduardo", "Corral", "Java","EOI");
        System.out.println(miAlumno.toString());
        System.out.println("------------------");

        miAlumno.metodoPersona();
        System.out.println("------------------");

        miAlumno.metodoAlumno();
        System.out.println("------------------");

        System.out.println(miAlumno.otroMetodoPersona());

    }
}

class  Persona{  //Superclase
    String nombre;
    String apellido;

    public void metodoPersona(){
        System.out.println("Yo soy tu padre!");
        int resultado = 45;
    }

    public int otroMetodoPersona(){
        int res = 45;
        return res;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}


class Alumno extends Persona{  //Subclase
    String curso;
    String centro;

    @Override
    public void metodoPersona() {
        System.out.println("¡Luke!");
        super.metodoPersona(); //Siempre por encima de otros this.
        System.out.println("...y tú lo sabes!");
        //System.out.println("resultado = " + resultado);  //resultado no existe
    }

    public int otroMetodoPersona(){
        int resOtroMetodo = super.otroMetodoPersona();
        int a = 2 * resOtroMetodo;
        return a;
    }

    public void metodoAlumno(){
        System.out.println("Hola");
        //super.metodoPersona();
        metodoPersona();  //el metodo ha sido heredado
    }

    public Alumno(String nombre, String apellido, String curso, String centro) {
        super(nombre, apellido);  //llama a los atributos de la clase padre
        this.curso = curso;
        this.centro = centro;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "curso='" + curso + '\'' +
                ", centro='" + centro + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}