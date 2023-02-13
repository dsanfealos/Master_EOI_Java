public class LineaAsignatura {

    //Atributos
    long codigo;
    String asignatura;
    int nota;
    String calificacion;

    //Getter
    public int getNota() {
        return nota;
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
        return  codigo + "\t\t" +
                 asignatura + "\t\t" +
                 nota + "\t\t" +
                 calificacion;
    }
}
