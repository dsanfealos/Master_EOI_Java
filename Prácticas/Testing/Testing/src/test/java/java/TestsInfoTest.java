package java;

import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

public class TestsInfoTest {
    @Test
    @DisplayName("Probando test Info")
    @Tag("Integration")
    @Tag("Unit")
    void testInfoTest(TestInfo testInfo){
        System.out.println("Test class: " + testInfo.getTestClass());    //Indica el nombre y dirección de la clase
        System.out.println("Test method: " + testInfo.getTestMethod());
        System.out.println("DisplayName: " + testInfo.getDisplayName());
        System.out.println("Tags: " + testInfo.getTags());
    }

    @Test
    void testReporterTest (TestReporter testReporter){  //El TestReporter añade información extra de la variable. Por defecto aparece la fecha y hora.
        testReporter.publishEntry("Un dato");

    }

    @Test
    void testReporterTest2 (TestReporter testReporter){
        testReporter.publishEntry("clave","Valor"); //"Nombre de value", "value"

    }

    @Test
    void testReporterTest3 (TestReporter testReporter){
        Map<String, String> map = new HashMap<>();
        map.put("user", "Juan");
        map.put("clave", "valor");
        testReporter.publishEntry(map); //Metemos una serie de opciones con el Map HashMap
    }
}
