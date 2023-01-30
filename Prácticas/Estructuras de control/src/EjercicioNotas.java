public class EjercicioNotas {
    public static void main(String[] args) {

        String calificacion = "";
        int nota = 7;

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
                calificacion = "Matrícula";
                break;
            default:
                calificacion = "Suspenso";
        }
        System.out.println("Calificación: " + calificacion);
    }
}
