public class EjemploSwitch {
    public static void main(String[] args) {
        //Convertir el número del mes en el nombre del mes
        int mes = 6;
                String nombreMes = "";

        //Switch es mucho más claro, pero no admite intervalos ni numeros no enteros
        //Sólo admite casos concretos
        switch (mes){  //En función de la variable de control (mes), realiza un caso
            case 1:
                nombreMes = "Enero";
                break; //Revisar la grabación 27/01/2023. EL break detiene el switch cuando se cumple la condición. Si no, continuará hasta otro break o final aunque haya cumlido la condición.
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            default:
                nombreMes ="después de Mayo";  //Todo valor después de 5
                //No usamos break aquí porque es el último caso, aunque se suele poner su aún no hay ningún default, por si acaso, o por si alguna interferencia pide un "botón" que no existe.
        }
        System.out.println("nombreMes = " + nombreMes);//Tiene que ir fuera de la llave, porque lo de dentro son las opciones a seleccionar.

        // if...else if
        if (mes == 1){
            nombreMes = "Enero";
        } else if (mes == 2) {
            nombreMes = "Febrero";
        } else if (mes == 3) {
            nombreMes = "Marzo";
        }else if (mes == 4) {
            nombreMes = "Abril";
        }else if (mes == 5) {
            nombreMes = "Mayo";
        }else{
            nombreMes = "después de Mayo";
        }
        System.out.println("nombreMes = " + nombreMes);

        //Con String
        String camiseta = "verde";
        String serigrafia = "";
        switch (camiseta){
            case "roja":
                serigrafia = "blanco";
                break;
            case "verde":
                serigrafia = "amarillo";
                break;
            case "amarilla":
                serigrafia = "negro";
                break;
        }
        System.out.println("serigrafia = " + serigrafia);
    }
}
