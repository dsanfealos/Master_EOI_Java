package java;

import org.junit.jupiter.api.*;

public class AnnotationsTest {

    @BeforeAll
    static void setUpClass(){       //ha de ser static. Se inicia al principio de todo
        System.out.println("Ejecutando el método BeforeAll");
    }

    @AfterAll
    static void tearDownClass(){
        System.out.println("Ejecutando el método AfterAll");
    }

    @BeforeEach
    void setUp(){   //Al método del BeforeEach se le suele llamar setUp, y se ejecuta antes de cada test
        System.out.println("---------------------\nEjecutando el método BeforeEach");
    }

    @AfterEach
    void tearDown(){    //Idem que el BeforeEach, y después de cada test
        System.out.println("Ejecutando el método AfterEach\n---------------------");
    }


    @Test
    void testAnnotations(){
        System.out.println("Ejecutando testAnnotations");
    }

    @Test
    void testAnnotations2(){
        System.out.println("Ejecutando testAnnotations2");
    }
}
