public class Metodos {
    public static void main(String[] args) {  //Las cosas solo se pueden ejecutar si se ordena en el main
        bienvenida(); //como es una impresión, sin que me devuelva nada, puede ser void
        System.out.println("suma(3,5) = " + suma(3,5));  //Ahora estoy llamando (invocando) el método que he creado (suma)
        imprimeNombre("Sanfe", 24);
        System.out.println(factorial(5));
        int combinaciones = factorial(5);  //Un método usado con unos parámetros concretos se puede asignar a una variable
        System.out.println("suma (3,5,6) = " + suma(3,5,6)); //Se pueden tener varios métodos llamados igual mientras tengan distintos parámetros
        System.out.println("suma float (3.5,5.6) = " + suma(3.5f,5.6f)); //para evitar la F debería usar double
        System.out.println("suma de cantidad variable = " + suma(2,4,7,9,6,6));
    }

    /*public static int suma(int a, int b){ //public y static significa accesible fuera de la clase
        //Como hacemos una suma de numeros enteros, ponemos int antes de suma. (El método main
        // no devuelve nada, por eso usa void)

        //Es interesante hacerse una biblioteca de métodos.

        //Le meto los 2 parámetros (enteros en este caso) que vamos a sumar, a y b.

        return a + b; //return es para que nos devuelva un valor

    }
*/
    public static void bienvenida(){
        System.out.println("¡Hola, bienvenido al apasionante mundo de Java!");
    }

    public static void imprimeNombre(String nombre, int edad){ //String nombre y demás serían los argumentos
        System.out.println("El nombre es " + nombre + " y tiene " + edad + " años");
    }

    //Factorial
    public static int factorial(int numero){
        int resultado = 1; //Un acumulador para guardar el resultado
        for (int i = 1; i <=numero; i++){
            resultado *= i;
        }
        return resultado;
    }


    public static int suma(int a, int b){
        return a + b;
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

    public static float suma(float a, float b){  //sobrecarga de métodos
        return a + b;
    }

    //Var args es argumentos variables
    public static int suma(int ... numero){ // ... implica que no sé cuántos parámetros son, pero se puede usar varargs (buscar en internet)
        //La arroba a la izquierda del código implica que este método está sustituyendo a otros métodos, porque cumple también su función.
        int resultado = 0;
        for (int i = 0; i < numero.length; i++){
            resultado += numero[i];
        }
        return resultado;
    }

}
