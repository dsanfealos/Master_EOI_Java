package curso;

import curso.exceptions.InvalidAmountException;
import curso.exceptions.NegativeBalanceException;

public class CuentaBancaria {
    int balance;
    public CuentaBancaria(){
        balance = 0;
    }
    public int getBalance (){
        return balance;
    }

    public void depositar(int cantidad) throws InvalidAmountException {
        if (cantidad < 0 ){
            throw new InvalidAmountException("Depósito negativo");  //Hemos creado una excepción personalizada
        }
        balance += cantidad;

    }

    public void retirar (int cantidad) throws InvalidAmountException, NegativeBalanceException {
        if (cantidad < 0 ){
            throw new InvalidAmountException("Retiro negativo");  //Hemos creado una excepción personalizada
        }
        if (cantidad > balance){
            throw new NegativeBalanceException("El balance no puede ser negativo");
        }
        balance -= cantidad;

    }

}
