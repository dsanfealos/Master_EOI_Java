package curso.java;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class AssertionsTest {  //Las clases Test no hace falta que sean públicas

    @Test   //Hemos metido en pom una dependencia (1ª)
    void testAssertions_True_ShouldPass(){
        EmailChecker emailChecker = new EmailChecker();
        String email = "juan@gmail.com";

        boolean resultado = emailChecker.isValidEmail(email);

        assertTrue(resultado);
    }

    @Test
    void isValidEmail_InvalidEmail_ShouldReturnFalse(){
        EmailChecker emailChecker = new EmailChecker();
        String email = "juan:gmail.com";

        boolean resultado = emailChecker.isValidEmail(email);

        assertFalse(resultado);
    }

    static class Punto {
        int x;
        int y;

        public Punto(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Punto punto = (Punto) o;
            return x == punto.x && y == punto.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    @Test
    void testAssertEquals_SamePoint_ReturnTrue_ShouldPass(){
        Punto punto1 = new Punto(1,2);
        Punto punto2 = new Punto(1,2);

        assertEquals(punto1,punto2);
    }

    @Test
    void testAssertEquals_PuntoDiferente_ReturnTrue_ShouldPass(){
        Punto punto1 = new Punto(1,2);
        Punto punto2 = new Punto(1,2);

        assertNotSame(punto1,punto2);
        //assertNotEquals(punto1,punto2);
    }

    @Test
    void testAssertNull_Null_ShouldPass(){
        assertNull(null);
    }

    @Test
    void testAssertNotNull_NotNull_ShouldPass(){
        assertNotNull(new Punto(1,2));
    }

    int divide (int x, int y){
        return x/y;
    }


    @Disabled   //Deshabilitar un test
    @Test
    void testFail(){
        try {
            int resultado = divide(4, 1);
            fail("Error!");  //Al poner fail, salta directamente al error
        } catch (Exception e){
            System.out.println("División por 0");
        }

    }

    @Test
    void testFail2(){
        boolean result = true;
        if (result == true){
            fail(); //Hace que el test falle
        }
    }

    @Test
    void divide_DivideByZero_ShouldThrowException(){
        assertThrows(ArithmeticException.class, () -> divide(3,0));

    }

    @Test
    void runSeveralTests(){
        assertTrue(true, "Primer assert");
        assertTrue(false, "Segundo assert");
        assertFalse(true, "Tercer assert");
    }

    @Test
    void assertAllSeveralTests(){
        assertAll(      //Para que nos muestren todos los errores a la vez
                () -> assertTrue(true),
                () -> assertTrue(false),
                () -> assertFalse(true)
        );
    }

}
