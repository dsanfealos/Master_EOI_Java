import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class EjercicioStream {
    //Crear un stream desde un archivo
    //Con los datos leídos creamos objetos tipo Usuario
    //Imprimir el contenido de los objetos

    public static void main(String[] args) {
        File archivo = new File("listaalumnos.txt");
        try(Stream<String> lineas = Files.lines(archivo.toPath())){  //Lo del paréntesis se puede meter como parámetro o como línea normal dentro del try
            lineas.map(alumno -> {
                String[] campos = alumno.split(";");
                Usuario us = new Usuario(campos[0],campos[1],campos[2],campos[3]);
                return us;
            })
                    .forEach(us -> System.out.println("us.toString() = " + us.toString()));

        }catch(Exception e){
            System.out.println("Se ha producido un error.");
            System.out.println("e = " + e);
        }
    }

}
