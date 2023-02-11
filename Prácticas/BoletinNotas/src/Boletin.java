import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Boletin {
    public static void main(String[] args) {

        //Entrada Datos Alumno
        System.out.println("Introduce nombre completo del Alumno: ");
        String nomCompl = introduceDato("Nombre Alumno");
        Alumnos alumno;
        //Para que coincida el nombre introducido con los datos de los alumnos del sistema
        switch (nomCompl){
            case "Daniel Sanfélix":
                alumno = Alumnos.DANIEL_SANFELIX;
                break;
            case "Pepe Urrutia":
                alumno = Alumnos.PEPE_URRUTIA;
                break;
            case "Andrea García":
                alumno = Alumnos.ANDREA_GARCIA;
                break;
            case "Laura Gómez":
                alumno = Alumnos.LAURA_GOMEZ;
                break;
            case "Alejandro Pascal":
                alumno = Alumnos.ALEJANDRO_PASCAL;
                break;
            case "Javier Costa":
                alumno = Alumnos.JAVIER_COSTA;
                break;
            case "Fernando Alós":
                alumno = Alumnos.FERNANDO_ALOS;
                break;
            case "Irene Pérez":
                alumno = Alumnos.IRENE_PEREZ;
                break;
            case "Muriel Peñasco":
                alumno = Alumnos.MURIEL_PENASCO;
                break;
            case "Carlos Vivas":
                alumno = Alumnos.CARLOS_VIVAS;
                break;
            default:
                System.out.println("El alumno no está en el sistema.");
                alumno = Alumnos.DANIEL_SANFELIX; //TODO Sistema de errores
        }

        //Seleccionar nota y asignatura
        ArrayList<LineaAsignatura> lineaAsignaturas = new ArrayList<>();
        boolean salir = false;
        while (salir != true) {
            //Nota y calificación
            int nota = Integer.parseInt(introduceDato("Seleccione la nota (-1 = Salir)"));
            String calificacion;
            switch (nota){
                case 5:
                    calificacion = "Aprobado";
                    break;
                case 6:
                    calificacion = "Aprobado";
                    break;
                case 7:
                    calificacion = "Notable";
                    break;
                case 8:
                    calificacion = "Notable";
                    break;
                case 9:
                    calificacion = "Sobresaliente";
                    break;
                case 10:
                    calificacion = "Matrícula de honor";
                    break;
                default:
                    calificacion = "Suspenso";
            }
            if (nota == -1) {
                salir = true;
            } else {
                //Asignatura
                String selecAsign = introduceDato("Seleccione la asignatura:\n1 - Java básico\n2 - POO\n3 - Java Intermedio\n4 - BBDD\n5 - Soft Skills\n6 - Empleo\n7 - JIRA\n8 - HTML\n9 - Spring\n10 - Proyecto");
                Asignaturas asignatura;
                switch (selecAsign) {
                    case "1":
                        asignatura = Asignaturas.JAVA_BASICO;
                        break;
                    case "2":
                        asignatura = Asignaturas.POO;
                        break;
                    case "3":
                        asignatura = Asignaturas.JAVA_INTERMEDIO;
                        break;
                    case "4":
                        asignatura = Asignaturas.BBDD;
                        break;
                    case "5":
                        asignatura = Asignaturas.SOFT_SKILLS;
                        break;
                    case "6":
                        asignatura = Asignaturas.EMPLEO;
                        break;
                    case "7":
                        asignatura = Asignaturas.JIRA;
                        break;
                    case "8":
                        asignatura = Asignaturas.HTML;
                        break;
                    case "9":
                        asignatura = Asignaturas.SPRING;
                        break;
                    case "10":
                        asignatura = Asignaturas.PROYECTO;
                        break;
                    default:
                        asignatura = Asignaturas.JIRA;
                        System.out.println("Error. Seleccione una asignatura del 1 al 10.");  //TODO Sistema de errores
                }
                //Comprobación
                System.out.println(asignatura);
                System.out.println("--------------------");
                //Crear líneas de notas
                LineaAsignatura lineaNota = new LineaAsignatura(asignatura.getCodigo(),asignatura.getAsignatura(),nota,calificacion);
                lineaAsignaturas.add(lineaNota);

            }
        }

        //Impresión
        //Título y Nombre Alumno
        System.out.println("--------------------");
        System.out.println("BOLETÍN DE CALIFICACIONES TRIMESTRAL\n\n");
        System.out.println(alumno);  //no hace falta escribir el "toString"
        System.out.println(" ");

        //Fecha
        System.out.println("Fecha: " + fechaHoy());
        System.out.println("--------------------");
        //Notas
        float sumaNotas = 0;
        for (LineaAsignatura lin:lineaAsignaturas){
            if (lin != null) {
                System.out.println(lin);
                sumaNotas += lin.getNota();
            }
        }
        //Nota y calificación medias
        float notaMedia = sumaNotas/lineaAsignaturas.size();
        System.out.println("Nota media: " + notaMedia);
        int result = (int) notaMedia;
        String califMedia;
        switch (result){
            case 5:
                califMedia = "Aprobado";
                break;
            case 6:
                califMedia = "Aprobado";
                break;
            case 7:
                califMedia = "Notable";
                break;
            case 8:
                califMedia = "Notable";
                break;
            case 9:
                califMedia = "Sobresaliente";
                break;
            case 10:
                califMedia = "Matrícula de honor";
                break;
            default:
                califMedia = "Suspenso";
        }
        System.out.println(" ");
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
