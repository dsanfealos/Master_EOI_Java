package curso.java.exceptions;

public class NegativeBalanceException extends Exception{
    public NegativeBalanceException(String message){
        super(message);
    }
}
