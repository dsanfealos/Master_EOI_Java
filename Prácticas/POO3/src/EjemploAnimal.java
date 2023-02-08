public class EjemploAnimal {
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.sonido();

        Caballo miCaballo = new Caballo();
        miCaballo.sonido();

        Serpiente laSerpiente = new Serpiente();
        laSerpiente.sonido("Sss!");
    }
}
