package curso.java.exceptions;

public class InvalidAmountException extends Exception{
    public InvalidAmountException(String message){
        super(message);   //super llama al cosntructor de la clase padre (Exception)

    }
}
