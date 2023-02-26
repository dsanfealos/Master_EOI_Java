public class EjemploCoche1 {
    public static void main(String[] args) {
        Coche1 cocheMaria = new Coche1();
        System.out.println("Km: " + cocheMaria.getKm());
        cocheMaria.setMarca("Citroen");
        System.out.println("Marca: " + cocheMaria.getMarca());
        cocheMaria.setDeposito(50);

        //Sólo lectura
        System.out.println("cocheMaria.consumo(800) = " + cocheMaria.consumo(800));
        System.out.println("cocheMaria.consumo(800) = " + cocheMaria.consumo(700));
        //cocheMaria.setKm(400); //No puedo modificar el atributo porque no existe el método setKm. Al borrarlo, lo protegemos contra escritura.
        System.out.println("cocheMaria.getKm() = " + cocheMaria.getKm()); //Obtengo el valor que ha acumulado tras las operaciones
        System.out.println("---------------------------");

        //constructores
        Coche1 elCoche = new Coche1("Ford"); //Al estar llamando al método con parámetros marca, no hemos llamado al que indica los Km iniciales, a menos que lo incluyamos
        System.out.println("elCoche.getMarca() = " + elCoche.getMarca());
        System.out.println("elCoche.getKm() = " + elCoche.getKm());
        System.out.println("---------------------------");

        Coche1 elCocheJuan = new Coche1("Ford", "Fiesta"); //Al estar llamando al método con parámetros marca, no hemos llamado al que indica los Km iniciales, a menos que lo incluyamos
        System.out.println("elCocheJuan.getMarca() = " + elCocheJuan.getMarca());
        System.out.println("elCocheJuan.getModelo() = " + elCocheJuan.getModelo());
        System.out.println("elCocheJuan.getKm() = " + elCocheJuan.getKm());
        System.out.println("---------------------------");
        
    }
}
