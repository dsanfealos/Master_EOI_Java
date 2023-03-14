package curso;

import curso.exceptions.InvalidAmountException;
import curso.exceptions.NegativeBalanceException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Test Cuenta Bancaria")    //Para cambiar el nombre en la lista de tests. Puede añadirse dentro o fuera de la clase
public class CuentaBancariaTest {

    CuentaBancaria cuenta;  //Inicializamos la variable

    @BeforeEach
    void setUp(){   //Reseteamos la cuenta
        cuenta = new CuentaBancaria();
    }

    @DisplayName("Test GetBalance")
    @Test
    void getBalance_SaldoInicial_DebeSer0(){

        int balance = cuenta.getBalance();
        assertEquals(0,balance);

    }

    @Nested
    @DisplayName("Test de Depositar")
    class Depositar_Test {
        @BeforeEach
        void setUp(){
            System.out.println("Test de la clase Depositar Test");
        }
        @Test
        void depositar_Depositar10_BalanceDeberiaSer10() throws InvalidAmountException {
            cuenta.depositar (10);
            int balance = cuenta.getBalance();
            assertEquals(10,balance);
        }

        @Test
        void depositar_DepositarNegativo_ThrowException(){
            assertThrows(InvalidAmountException.class, () ->cuenta.depositar(-10));
        }

    }

    //TODO: Se puede retirar dinero de la cuenta

    @Nested //Para hacer una clase anidada agrupando tests
    @DisplayName("Test de Retirar")
    class Retirar_Test{

        @BeforeEach
        void setUp(){
            System.out.println("Este es un test de retirar");
        }

        @Test
        void retirar_Retirar5_BalanceDeberiaSerMenos5() throws InvalidAmountException, NegativeBalanceException {
            cuenta.depositar(10);
            cuenta.retirar (5);
            int balance = cuenta.getBalance();
            assertEquals(5,balance);
        }

        @Test
        void retirar_RetirarNegativo_ThrowException(){
            assertThrows(InvalidAmountException.class, () ->cuenta.retirar(-10));
        }
    }

    @Test
    void retirar_Retirar5_ThrowsException(){
        assertThrows(NegativeBalanceException.class, () -> cuenta.retirar(5));
    }

}
