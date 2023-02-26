import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Boletin {
    public static void main(String[] args) {

        //Entrada de Datos Alumno
        System.out.println("Introduzca nombre completo del alumno\n");
        String nomCompl = introduceDato("Nombre Alumno");
        Alumnos alumno = null;
        //Para que coincida el nombre introducido con los datos de los alumnos del sistema
        switch (nomCompl) {
            case "Daniel Sanfélix" -> alumno = Alumnos.DANIEL_SANFELIX;
            case "Pepe Urrutia" -> alumno = Alumnos.PEPE_URRUTIA;
            case "Andrea García" -> alumno = Alumnos.ANDREA_GARCIA;
            case "Laura Gómez" -> alumno = Alumnos.LAURA_GOMEZ;
            case "Alejandro Pascal" -> alumno = Alumnos.ALEJANDRO_PASCAL;
            case "Javier Costa" -> alumno = Alumnos.JAVIER_COSTA;
            case "Fernando Alós" -> alumno = Alumnos.FERNANDO_ALOS;
            case "Irene Pérez" -> alumno = Alumnos.IRENE_PEREZ;
            case "Muriel Peñasco" -> alumno = Alumnos.MURIEL_PENASCO;
            case "Carlos Vivas" -> alumno = Alumnos.CARLOS_VIVAS;
            default -> {
                System.err.println("El alumno no está en el sistema.");
                main(args);
                System.exit(0);
            }
        }

        //Seleccionar nota y asignatura
        ArrayList<LineaAsignatura> lineaAsignaturas = new ArrayList<>();
        boolean salir = false;
        while (salir != true) {
            //Nota y calificación
            int nota = Integer.parseInt(introduceDato("Seleccione la nota (-1 = Salir)"));
            String calificacion = switch (nota) {
                case 5 -> "Aprobado";
                case 6 -> "Aprobado";
                case 7 -> "Notable";
                case 8 -> "Notable";
                case 9 -> "Sobresaliente";
                case 10 -> "Matrícula de honor";
                default -> "Suspenso";
            };
            if (nota == -1) {
                salir = true;
            } else {
                //Asignatura
                String selecAsign = introduceDato("Seleccione la asignatura:\n1 - Java básico\n2 - POO\n3 - Java Intermedio\n4 - BBDD\n5 - Soft Skills\n6 - Empleo\n7 - JIRA\n8 - HTML\n9 - Spring\n10 - Proyecto");
                Asignaturas asignatura = null;
                boolean err = false;
                switch (selecAsign) {
                    case "1" -> asignatura = Asignaturas.JAVA_BASICO;
                    case "2" -> asignatura = Asignaturas.POO;
                    case "3" -> asignatura = Asignaturas.JAVA_INTERMEDIO;
                    case "4" -> asignatura = Asignaturas.BBDD;
                    case "5" -> asignatura = Asignaturas.SOFT_SKILLS;
                    case "6" -> asignatura = Asignaturas.EMPLEO;
                    case "7" -> asignatura = Asignaturas.JIRA;
                    case "8" -> asignatura = Asignaturas.HTML;
                    case "9" -> asignatura = Asignaturas.SPRING;
                    case "10" -> asignatura = Asignaturas.PROYECTO;
                    default -> {
                        System.err.println("Error. Seleccione una asignatura del 1 al 10. Vuelva a seleccionar nota y asignatura.");
                        err = true;
                        //main(args);
                        //System.exit(0);
                    }
                }
                if (err == false){  //Si algo falla con la asignatura, me vuelve a pedir nota y asignatura.
                    //Crear líneas de notas
                    LineaAsignatura lineaNota = new LineaAsignatura(asignatura.getCodigo(),asignatura.getAsignatura(),nota,calificacion);
                    lineaAsignaturas.add(lineaNota);
                }
            }
        }

        //Impresión
        //Nombre centro
        System.out.println("\n\nIES RAMÓN Y CAJAL\nC/ Santos , 7-4, Valencia\n");
        //Título y Nombre Alumno
        System.out.println("--------------------");
        System.out.println("BOLETÍN DE CALIFICACIONES TRIMESTRAL\n\n");
        System.out.println(alumno);  //no hace falta escribir el "toString"

        //Fecha
        System.out.println("\nValencia, " + fechaHoy());

        System.out.println("--------------------");
        //Notas
        System.out.println("Código\t\t" + "Asignatura\t\t\t" + "Nota\t" + "Calificación");
        float sumaNotas = 0;
        for (LineaAsignatura lin:lineaAsignaturas){
            if (lin != null) {
                System.out.println(lin);
                sumaNotas += lin.getNota();
            }
        }
        //Nota y calificación medias
        float notaMedia = sumaNotas/lineaAsignaturas.size();
        System.out.println("\nNota media: " + notaMedia);
        int result = (int) notaMedia;
        String califMedia = switch (result) {
            case 5 -> "Aprobado";
            case 6 -> "Aprobado";
            case 7 -> "Notable";
            case 8 -> "Notable";
            case 9 -> "Sobresaliente";
            case 10 -> "Matrícula de honor";
            default -> "Suspenso";
        };
        System.out.println("Calificación media:" + califMedia);
    }
    //Entrada Scanner
    public static String introduceDato(String mensaje){
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje + ": ");
        return entrada.nextLine();
    }

    //Fecha
    public static String fechaHoy(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato.format(new Date());
        return fecha;
    }
}
