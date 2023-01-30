import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Entorno {
    public static void main(String[] args) {
        boolean debug = true;
        //Variables de entorno 1 a 1
        System.out.println("usuario = " + System.getProperty("user.name"));  //Usuario que ha creado la carpeta
        System.out.println("directorio = " + System.getProperty("user.dir")); //Esto son comandos concretos.
        System.out.println("versión Java = " + System.getProperty("java.version"));

        //Todas las variables del entorno a la vez
        Properties propiedades = System.getProperties(); //Properties almacena todas las variables del sistema
        System.out.println("properties = " + propiedades);
        System.out.println("----------------");
        propiedades.list(System.out);
        System.out.println("----------------");

        //Crear variables del entorno
        propiedades.setProperty("config.puerto.servidor","8080");  //crear propiedad
        System.setProperties(propiedades); //Lo aplicamos

        propiedades = System.getProperties();
        propiedades.list(System.out);  //Aquí vemos la nueva propiedad añadida
        System.out.println("----------------");

        //Cargar variables del sistema desde una archivo
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            //Para que cargue/lea el archivo
            propiedades.load(archivo);
            System.setProperties(propiedades);  //actualizamos propiedades con el contenido del archivo
            propiedades.list(System.out);
            System.out.println("----------------");
        }catch(FileNotFoundException e){
            //Tratar el error
            //Con el err en lugar del out, el mensaje aparece en rojo y al final de todo (El que esté en amarillo se refiere a algo "que hacer")
            if (debug)System.err.println("FileNotFoundException: " + e.getMessage()); //Hemos usado el booleano debug para que cuando falle, aparezca esto. Sólo se usa durante el desarrollo para ver cosas concretas.
        }catch(IOException e){ //Los dos e no tienen nada que ver por ser bloques de código distintos
            //Tratar el error de lectura del archivo
            System.out.println("IOException");
        }
        System.out.println("----------------");

        //Variables del entorno SO (sistema operativo)

        Map<String,String> varEntorno = System.getenv();
        System.out.println("varEntorno = " + varEntorno);
        System.out.println("Usuario = " + System.getenv("USERNAME"));  //Para imprimir una determinada
        System.out.println("JAVA_HOME = " + System.getenv("JAVA_HOME"));

        System.out.println("varEntorno.keySet() = " + varEntorno.keySet());
        for (String clave: varEntorno.keySet()){ //Le pide al getenv cada una de las claves
            System.out.println("clave = " + clave + "-> valor = " + System.getenv(clave));
        }
    }
}
