public class LineaAsignatura {

    //Atributos
    long codigo;
    String asignatura;
    int nota;
    String calificacion;

    //Setter y getter

    public int getNota() {
        return nota;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }


    //Constructor


    public LineaAsignatura(long codigo, String asignatura, int nota, String calificacion) {
        this.codigo = codigo;
        this.asignatura = asignatura;
        this.nota = nota;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo +
                "\t\tAsignatura: " + asignatura +
                "\t\tNota: " + nota +
                "\t\tCalificación: " + calificacion;
    }
}
