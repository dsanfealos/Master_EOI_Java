package curso.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeoutTest {

    @Test
    @Timeout(2) //Dura 2 segundos la ejecución o se cancela
    void testTarda3Segundos() throws InterruptedException {
        System.out.println("Empezando el test");
        TimeUnit.SECONDS.sleep(3);  //Para que tarde 3 segundos extra en continuar
        System.out.println("Fin del test");
    }

}
