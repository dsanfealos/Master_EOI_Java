package curso;

import curso.exceptions.InvalidAmountException;
import curso.exceptions.NegativeBalanceException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepeatingTest {

    static CuentaBancaria cuenta;

    @BeforeAll
    static void setUp() throws InvalidAmountException {   //El before each se ejecuta antes de cada una de las veces del RepeatedTest
        System.out.println("Ejecutando BeforeEach");
        cuenta = new CuentaBancaria();
        cuenta.depositar(100);
    }

    @AfterAll
    static void tearDown(){
        int balance = cuenta.getBalance();
        assertEquals(75,balance);
    }


    @RepeatedTest(5)
    void Retirar_5Veces() throws NegativeBalanceException, InvalidAmountException {
        cuenta.retirar(5);
        int balance = cuenta.getBalance();
        assertTrue(balance > 0);
    }

}
