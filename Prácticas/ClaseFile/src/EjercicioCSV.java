import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCSV {
    //Crear arraylist de alumnos y guardar su contenido en un archivo

    static ArrayList<Alumno> listaLeida = new ArrayList<>(); //Un arraylist global
    public static void main(String[] args) {
//        ArrayList<Alumno> listaAlumno = new ArrayList<>();
//        Alumno uno = new Alumno("Pepe","Pérez", "pepe@eoi.es", "678909099");
//        Alumno dos = new Alumno("Juan","García", "juan@eoi.es", "678909098");
//        Alumno tres = new Alumno("María","Juárez", "maria@eoi.es", "678909097");
//        Alumno cuatro = new Alumno("Alicia","Martín", "alicia@eoi.es", "678909094");
//        listaAlumno.add(uno);
//        listaAlumno.add(dos);
//        listaAlumno.add(tres);
//        listaAlumno.add(cuatro);
//        escribirArchivo(listaAlumno);


        leerCSV("listaalumnos.csv");
        for (Alumno al : listaLeida){
            System.out.println(al.toString());
        }
    }

    public static void escribirArchivo(ArrayList<Alumno> lista){
        //Escribe en un archivo "listaalumnos.txt"
            try {
                FileWriter escribir = new FileWriter("listaalumnos.csv", true);
                for (Alumno v : lista) {
                    escribir.write("\n" + v.nombre + "\t;" + v.apellidos + "\t;" + v.email + "\t;" + v.movil);
                }
                escribir.close();
            } catch (IOException e) {
                System.out.println("Error de escritura");
                System.out.println(e);
            }
    }

    public static void leerCSV(String nombre){
        // Lee el CSV y almacena los alumnos en listaLeida

        try {
            File archivo = new File("listaalumnos.csv");
            Scanner leer = new Scanner(archivo);
            while (leer.hasNext()){
                String linea = leer.nextLine();

            }
        }catch(IOException e){
            System.out.println("Error de lectura");
            System.out.println(e);
        }

    }

}
