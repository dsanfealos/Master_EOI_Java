public enum Asignaturas {
    //Atributos
    JAVA_BASICO(1927,"Java Básico\t"),
    POO(2847,"POO\t\t\t"),
    JAVA_INTERMEDIO(3765,"Java Intermedio"),
    BBDD(8854,"Bases de Datos"),
    SOFT_SKILLS(5324,"Soft Skills\t"),
    EMPLEO(1925,"Empleo\t\t"),
    JIRA(7715,"Jira\t\t"),
    HTML(4187,"HTML\t\t"),
    SPRING(8226,"Spring\t\t"),
    PROYECTO(2289,"Proyecto\t");

    long codigo;
    String asignatura;

    //Getter
    public long getCodigo() {
        return codigo;
    }

    public String getAsignatura() {
        return asignatura;
    }

    //Constructor
    Asignaturas(long codigo, String asignatura) {
        this.codigo = codigo;
        this.asignatura = asignatura;
    }
}
