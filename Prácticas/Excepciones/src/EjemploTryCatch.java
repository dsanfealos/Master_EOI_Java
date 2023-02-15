public class EjemploTryCatch {
    public static void main(String[] args) {
        int[] numeros = {1,2,0,4,5};

        //Try catch
        try {
            for (int i = 0; i <= numeros.length; i++) {
                //System.out.println("numeros[" + i + "] = " + numeros[i]);
                System.out.println("(1/numeros[" + i + "]) = " + (1/numeros[i]));  //No saca decimales porque estamos en enteros, pero con float tenemos el infinito y sí puede dividir entre 0
            }
        }catch(ArithmeticException e){ //En caso de no saber el tipo de error, usemos "Exception" a secas.
            System.err.println("Fallo matemático, chaval. Has dividido por 0.");

        }catch(ArrayIndexOutOfBoundsException e){  //La e es el nombre que le damos al error, como una variable
            System.out.println("Error: " + e);
            System.out.println("Error: " + e.getMessage());  //Para ver el tipo de error
            System.err.println("Has cometido un error. Tú sabrás cuál.");
        }catch (Exception e){
            System.err.println("Un error desconocido ha atacado tu programa.");
        }finally {  //Lo que haya en el finally, ocurrirá aunque tengamos un error que corte la ejecución del código a mitad.
            System.out.println("Bloque final del programa siempre");
        }
        System.out.println("Bloque final del programa");
    }
}
