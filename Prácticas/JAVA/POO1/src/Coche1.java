public class Coche1 {

        //Atributos (estado/características). No usamos método main aún.
        private String marca;
        private String modelo;
        private String color;
        private String carroceria;
        float potencia;
        float cilindrada;
        String combustible;
        float rpm;
        private float km;
        private float deposito;
        final static String eCall = "112";  //esto es una constante, por eso usamos final antes.
        static String distintivo = "E";
        private String numeroSerie;


        //Constructores
    public Coche1(){
        this.km = 4;
    }

    public Coche1(String marca){
        this();  //Esto hace llamar al método con parámetros "()". Se pone en la primera línea.
        this.marca = marca;
    }

    public Coche1(String marca, String modelo){  //Para llamar otro método podemos usar this(String), o this(String,String) y demás.
        this(marca);
        this.modelo = modelo;
    }

    public Coche1(String marca, String modelo, String color, String carroceria, float potencia, float cilindrada, String combustible, float deposito) {
        //generar constructor

        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.carroceria = carroceria;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.deposito = deposito;
    }

    public Coche1(String marca, String modelo, String color, String carroceria, float potencia, float cilindrada, String combustible, float deposito, String numeroSerie) {
        this(marca,modelo,color,carroceria,potencia,cilindrada,combustible,deposito);
        this.numeroSerie = numeroSerie;
    }

    //Getter y Setter (encapsulado). A mano o con click derecho > Generate > Getter and Setter > atributo.


    public String getMarca() {  //Get obtiene el valor
        return marca;
    }

    public void setMarca(String marca) {  //Set asigna un valor
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public float getKm() {
        return km;
    }

    /*public void setKm(float km) {
        this.km = km;
    }*/

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    //Métodos ("comportamiento"). No se usa static para poder usarlo fuera de esta clase.
    public void arrancar(){
        rpm = 800;
    }

    public void acelerar(float rpm){
        //Sin usar "this", al ser los dos "rpm", el programa
        // los confundiría. Colocamos el this en el que pertenece a esta clase
        this.rpm += rpm;
    }

    public void frenar(float deceleracion){
        rpm-= deceleracion;
    }

    public String detallesCoche(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nColor: " + color;
    }

    //static significa que puede ser llamado sin necesidad de crear un objeto.
    public static void llamarEmergencias(){
        System.out.println("Hago una llamada al " + eCall);
    }

    public float consumo(float distancia){
        //Siempre lleno el depósito y siempre lo vacío.
        this.km+= distancia;
        return this.deposito/distancia * 100;  //El combustible que consume por 100km (l/km * 100 es l/100Km)(No te ralles, lo entendiste en su momento y es así)

    }

    public float consumo(float distancia, float repostado){
        this.km +=distancia;
        return repostado / distancia * 100;
    }

    //toString
    //generar
    //muestra todos los datos

    @Override
    public String toString() {
        return "Coche1{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", carroceria='" + carroceria + '\'' +
                ", potencia=" + potencia +
                ", cilindrada=" + cilindrada +
                ", combustible='" + combustible + '\'' +
                ", rpm=" + rpm +
                ", km=" + km +
                ", deposito=" + deposito +
                ", numeroSerie='" + numeroSerie + '\'' +
                '}';
    }
}
