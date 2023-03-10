import curso.java.SumService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumServiceTest {

    SumService sumService = new SumService();

    @BeforeEach
    void setUp (){
        sumService = new SumService();
    }

    @Test
    void sum1(){
        int resultado = sumService.sum(10,24);
        assertEquals(34, resultado);
    }

    @Test
    void sum2(){
        int resultado = sumService.sum(-5,13);
        assertEquals(8, resultado);
    }

}
