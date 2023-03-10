package java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assumptions.*;


public class ConditionalTest {
    @EnabledOnOs(OS.WINDOWS)    //El test está habilitado sólo para este sistema operativo
    @Test
    void windowsTest(){
        System.out.println("Este test solo se ejecuta en Windows.");
    }

    @EnabledOnOs(OS.MAC)
    @Test
    void macTest(){
        System.out.println("Este test solo se ejecuta en Mac.");
    }

    @EnabledOnJre(JRE.JAVA_19)
    void jre19(){
        System.out.println("Este test se inicia en Java 19");
    }


    @EnabledIfSystemProperty(named = "os.version", matches = "10.0")
    @Test
    void testUserHome(){
        System.out.println("Este text solo se ejecuta si la carpeta es C:\\Users\\D");
    }

    @EnabledIfEnvironmentVariable(named = "ENV", matches = "LOCAL")
    @Test
    void testLocal(){
        System.out.println("Este test solo se ejecuta en local");
    }

    @Test
    void testAssumeTrue(){
        System.out.println("Empezando test Assume true");
        String env = "local";
        assumeTrue(env.equals("qa"));   //fallará porque son diferentes

        System.out.println("Sólo se ejecuta en QA");


    }

    @Test
    void testAssumeFalse(){
        System.out.println("Empezando test Assume false");
        String env = "local";
        assumeFalse(env.equals("local"));

        System.out.println("Sólo se ejecuta en entornos remotos");

    }

    @Test
    void testAssumingThat() {
        System.out.println("Empezando test Assume that");
        String env = "dev";

        assumingThat(env.equals("local"), () -> System.out.println("entorno local"));
        assumingThat(env.equals("dev"), () -> System.out.println("entorno dev"));
        assumingThat(env.equals("qa"), () -> System.out.println("entorno qa"));
        assumingThat(env.equals("prod"), () -> System.out.println("entorno prod"));

        System.out.println("Fin");
    }

}
