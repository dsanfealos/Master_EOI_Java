import repositorios.EmpleadoRepoImp;
import repositorios.OficinaRepoImpl;

public class Jdbc2 {
    public static void main(String[] args) {
        OficinaRepoImpl ofirepo = new OficinaRepoImpl();
        EmpleadoRepoImp empleRepo = new EmpleadoRepoImp();

        //System.out.println(ofirepo.listar());
        System.out.println(ofirepo.porId("BCN-ES"));

        //ofirepo.borrar("BCN-ES");
        //Ver clase desde 13:10 07/03/2023

        System.out.println(empleRepo.listar());
    }
}
