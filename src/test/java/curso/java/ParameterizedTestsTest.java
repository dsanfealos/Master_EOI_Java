package curso.java;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Month;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTestsTest {

    EmailDomain emailDomain = new EmailDomain();

    @ParameterizedTest  //Hemos metido en pom una dependencia (2ª). Hace que el test use parámetros
    //No hay que añadir la notación @Test y realiza lo mismo que RepeatedTest
    @ValueSource(strings = {"juan@gmail.com", "felipe@gmail.com"})  //Strings para ocupar el argumento (1º y 2º vez)
    void extractDomain_EmailSameDomain_ShouldReturnSameDomain(String email){
        String expectedDomain = "gmail.com";    //Modo explicativo (mejor)
        String domain = emailDomain.ExtractDomain(email);
        assertEquals(expectedDomain,domain);
        //assertEquals("gmail.com",emailDomain.ExtractDomain(email));   //Modo rápido
    }

    @ParameterizedTest
    @MethodSource("emailAndDomain") //Para llamar a un método
    void extractDomain_EmailDifferentDomain_ShouldReturnCorrect(String email, String expectedDomain){
        String domain = emailDomain.ExtractDomain(email);
        assertEquals(expectedDomain,domain);
    }

    private static Stream<Arguments> emailAndDomain(){ //Para añadir una serie de argumentos a un método que usa varios a la vez
        return Stream.of(
                Arguments.arguments("maria@gmail.com","gmail.com"),
                Arguments.arguments("andrea@yahoo.com","yahoo.com"),
                Arguments.arguments("manuel@outlook.com","outlook.com")
        );
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"JANUARY", "FEBRUARY"})    //Llama a un enumerador (el de meses). Aladir el segundo parámetro para recorrer sólo los que deseamos
    void testMonths (Month month){
        System.out.println(month);
    }



}
