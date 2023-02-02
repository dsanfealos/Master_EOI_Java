public class EjemploCoche1 {
    public static void main(String[] args) {
        Coche1 cocheMaria = new Coche1();
        cocheMaria.setMarca("Citroen");
        System.out.println("Marca: " + cocheMaria.getMarca());
        cocheMaria.setDeposito(50);
        
        //Sólo lectura
        System.out.println("cocheMaria.consumo(800) = " + cocheMaria.consumo(800));
        System.out.println("cocheMaria.consumo(800) = " + cocheMaria.consumo(700));
        //cocheMaria.setKm(400); //No puedo modificar el atributo porque no existe el método setKm. Al borrarlo, lo protegemos contra escritura.
        System.out.println("cocheMaria.getKm() = " + cocheMaria.getKm()); //Obtengo el valor que ha acumulado tras las operaciones

    }
}
