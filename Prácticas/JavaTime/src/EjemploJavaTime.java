import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;

public class EjemploJavaTime {
    public static void main(String[] args) {
        //Fecha
        LocalDate objetoFecha = LocalDate.now();
        System.out.println("objetoFecha = " + objetoFecha);

        // Formato de fecha dd/MM/yyyy
        DateTimeFormatter formatofecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatofecha.toString());
        System.out.println("objetoFecha = " + objetoFecha.format(formatofecha));

        //Hora
        LocalTime objetoHora = LocalTime.now();
        System.out.println("objetoHora = " + objetoHora);
        
        // Fomato hh:mm:ss
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("hh:mm:ss a");  //para decir a.m. o p.m.
        System.out.println("objetoHora.format(formatoHora) = " + objetoHora.format(formatoHora));

        //Fecha y hora
        LocalDateTime objetoFechaHora = LocalDateTime.now();
        System.out.println("objetoFechaHora = " + objetoFechaHora);
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MMM/yyyy k:mm:ss a G");  //Poniendo k en lugar de hh, da el formato en 24h. Con la G decimos la era.
        System.out.println("objetoFechaHora.format(formatoFechaHora) = " + objetoFechaHora.format(formatoFechaHora));

        //Establecer fecha y hor
        objetoFechaHora = LocalDateTime.of(2022,5,15,10,30,15);
        System.out.println("objetoFechaHora.format(formatoFechaHora) = " + objetoFechaHora.format(formatoFechaHora));

        objetoFechaHora = LocalDateTime.of(2022, Month.MAY, 15, 18,13,2);

    }
}
