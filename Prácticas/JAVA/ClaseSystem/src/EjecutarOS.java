import java.io.IOException;

public class EjecutarOS {
    public static void main(String[] args) {
        //Runtime es "en tiempo de ejecución"
        Runtime rt = Runtime.getRuntime();  //Me permite ejecutar un programa
        Process proceso;
        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                proceso = rt.exec("notepad"); //Para iniciar notepad
            }else {
                proceso = rt.exec("BBEdit");  //El notepad para mac
            }
            proceso.waitFor();//Revisar desde 13:45 30/01/2023. Para esperar a que se cierre la aplicación antes de continuar.
        }catch(Exception e){  //Ponemos Exception cuando no sabemos cuál es
            System.err.println("Comando desconocido: " + e.getLocalizedMessage());
            System.exit(1);
        }
    }
}
