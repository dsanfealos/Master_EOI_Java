import curso.java.MultiplyService;
import curso.java.SumService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyServiceTest {

//    private SumService sumService;  //Aquí para que sirva con todos

    MultiplyService multiplyService;

    @BeforeEach
    void setUp(){
        SumService sumService = new SumService();
        multiplyService = new MultiplyService(sumService);
    }

    @Test
    void multiply1 (){
        int resultado = multiplyService.multiply(10,24);
        assertEquals(240, resultado);
    }

    @Test
    void multiply2 (){
        int resultado = multiplyService.multiply(-5,13);
        assertEquals(-65, resultado);
    }

    @Test
    void multiplySumTest(){
        int resultado = multiplyService.multiplySum(2,4);

        assertEquals(12,resultado);
    }
    //Revisar desde 13:20 10/03/2023

}
