package curso;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagTest {
    @Test
    @Tag("Unit")  //Para marcarlo para la config de ejecución
    void unitTest(){
        System.out.println("Test unitario");
    }

    @Test
    @Tag("Integration")
    void IntegrationTest(){
        System.out.println("Test de Integración");
    }

}
