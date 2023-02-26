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
//
        File archivo = new File("listaalumnos.csv");
        leerCSV(archivo, listaLeida);
        for (Alumno al : listaLeida){
            System.out.println(al.toString());
        }
    }

    public static void escribirArchivo(ArrayList<Alumno> lista){
        //Escribe en un archivo "listaalumnos.txt"
            try {
                FileWriter escribir = new FileWriter("listaalumnos.csv", true);
                for (Alumno v : lista) {
                    escribir.write(v.nombre + ";" + v.apellidos + ";" + v.email + ";" + v.movil + "\n");
                }
                escribir.close();
            } catch (IOException e) {
                System.out.println("Error de escritura");
                System.out.println(e);
            }
    }

    public static void leerCSV(File archivo, ArrayList<Alumno>mat){
        // Lee el CSV y almacena los alumnos en listaLeida

        try {
            Scanner leer = new Scanner(archivo);

            while (leer.hasNext()){
                String linea = leer.nextLine();

                //Método1. El más rápido y funciona igual de bien que el método 3.
                String[] campos = linea.split(";");  //El regex registra lo que hay entre cada dos ";" y lo mete en la matriz
                Alumno al = new Alumno(campos[0], campos[1], campos[2], campos[3]);
                listaLeida.add(al);

                //Método 2
//                int i = linea.indexOf(";");
//                int j = linea.indexOf(";",i+1);
//                int k = linea.lastIndexOf(";", j+1);
//                Alumno al = new Alumno(linea.substring(0,i),linea.substring(i+1,j),linea.substring(j+1,k),linea.substring(k));
//                listaLeida.add(al);

                //Método 3
//                int i = 0;
//                ArrayList<String> campos = new ArrayList<>();
//                while (i != -1) {
//
//                    i = linea.indexOf(";");  //Cuando no encuentra lo que busca, da -1
//                    if (i == -1) {
//                        campos.add(linea);
//                    }else {
//                        campos.add(linea.substring(0, i));
//                        linea = linea.substring(i + 1);
//                    }
//                }
//                Alumno al = new Alumno(campos.get(0),campos.get(1),campos.get(2),campos.get(3));
//                listaLeida.add(al);

                //Método 4
//                int i = 0;
//                int cont = 0;
//                String aux = linea;
//                while (i != -1){
//                    i = linea.indexOf(";");
//                    aux = aux.substring(i+1);
//                    cont++;
//                }
            }
        }catch(IOException e){
            System.out.println("Error de lectura");
            System.out.println(e);
        }

    }

}
