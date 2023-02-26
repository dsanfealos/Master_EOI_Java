public class EjemploParametros {
    public static void main(String[] args) {
        TipoCoche miCoche = TipoCoche.SEDAN;
        System.out.println("miCoche.getNombre() = " + miCoche.getNombre());
        System.out.println("miCoche.getDescripcion() = " + miCoche.getDescripcion());
        System.out.println("miCoche.getNumPuertas() = " + miCoche.getNumPuertas());

        System.out.println("---------------------");

        Amigos miAmigo = Amigos.PEPE;
        System.out.println("miAmigo = " + miAmigo);
        System.out.println("miAmigo.getNombre() = " + miAmigo.getNombre());
        System.out.println("miAmigo.getCorreo() = " + miAmigo.getCorreo());
        System.out.println("miAmigo.getTelefono() = " + miAmigo.getTelefono());
        System.out.println("---------------------");

        //Como atributo en una clase
        Persona companyero = new Persona("Eduardo","Corral","eduardo@corral.es",Amigos.MERCHE); //Datos de Eduardo y su mejor amigo
        System.out.println("companyero.getNombre() = " + companyero.getNombre());
        System.out.println("companyero.getApellidos() = " + companyero.getApellidos());
        System.out.println("companyero.getEmail() = " + companyero.getEmail());
        // companyero.setMejorAmigo(Amigos.PEPE);  Se puede cambiar el valor como a cualquier otro
        System.out.println("companyero.getMejorAmigo().getNombre() = " + companyero.getMejorAmigo().getNombre());  //Puedo encadenar getters para obtener el atributo del atributo si este es un enumerador.
        System.out.println("-----------------------");
        muestraAmigo(companyero.getMejorAmigo());
        System.out.println("-----------------------");
        System.out.println(companyero.getMejorAmigo().toString());

    }

    public static void muestraAmigo(Amigos amigo){
        System.out.println("amigo = " + amigo);
        System.out.println("amigo.getNombre() = " + amigo.getNombre());
        System.out.println("amigo.getTelefono() = " + amigo.getTelefono());
        System.out.println("amigo.getCorreo() = " + amigo.getCorreo());
        System.out.println("-----------------------");
    }
}
