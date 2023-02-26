public class EjemploHerencia {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();

        Automovil miCoche = new Automovil();
        miCoche.ruedas = 4;
        miCoche.combustible = "Híbrido";
        miCoche.marca = "Ford";
        miCoche.modelo = "Mondeo";
        miCoche.potencia = 180;
        miCoche.abrirMaletero();
        miCoche.claxon();  //.claxon y .avanzar son de Vehículo, pero Automóvil los ha heredado y podemos usarlos con un objeto creado con Automovil.
        miCoche.avanzar();
        System.out.println(miCoche.getDisenyador()); //No aparece disenyador, porque está privado, protegido contra la herencia (se soluciona con protected). Sin embargo, podemos obtener el get

        System.out.println("---------------------------");
        Motocicleta miMoto = new Motocicleta();
        System.out.println("miMoto.ruedas = " + miMoto.ruedas);
        miMoto.transmision = "cadena";
        miMoto.marca = "Suzuki";
        miMoto.modelo = "Intruder VL800";
        miMoto.potencia = 75;
        miMoto.acelerarPunyo();
        miMoto.claxon();
        miMoto.avanzar();

        System.out.println("---------------------------");
        Todoterreno miTodoterreno = new Todoterreno();
        //Propias de Todoterreno
        miTodoterreno.reductora = "10:1";
        miTodoterreno.cabrestrante = "Winch";
        //Propias de Automovil
        miTodoterreno.ruedas = 4;
        miTodoterreno.combustible = "Diesel";
        //Propias de Vehiculo
        miTodoterreno.marca = "Ford";
        miTodoterreno.modelo = "Mondeo";
        miTodoterreno.potencia = 180;
        miTodoterreno.abrirMaletero();
        miTodoterreno.claxon();


    }
}
