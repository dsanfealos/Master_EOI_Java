package curso.java;

public class EmailDomain {
    public String ExtractDomain(String email){
        String domain = email.split("@")[1];
        return domain;  //Se puede dejar en una linea pero está más claro así (opcional)
    }
}
