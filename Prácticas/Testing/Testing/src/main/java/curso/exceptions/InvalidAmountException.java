package curso.exceptions;

public class InvalidAmountException extends Exception{
    public InvalidAmountException(String message){
        super(message);   //super llama al constructor de la clase padre (Exception)

    }
}
