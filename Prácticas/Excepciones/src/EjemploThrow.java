public class EjemploThrow {
    //Throw
    //Para crear errores y prohibiciones según nos convenga
    public static void main(String[] args) {
        try{
            comprobarEdad(17);
        }catch (ArithmeticException e){
            System.err.println("Error: " + e);
        }
    }

    public static void comprobarEdad(int edad){
        if (edad < 18){
            //System.out.println("Acceso denegado");
            throw new ArithmeticException("Acceso denegado");  //Genero un error que en principio no existía. En este caso, es un error si la variable es <18.
        }else{
            System.out.println("Acceso permitido.");
        }
    }

}
