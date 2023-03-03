import java.sql.*;

public class Jdbc1 {
    public static void main(String[] args) {
        //Definimos variables con datos de acceso
        String url = "jdbc:mysql://127.0.0.1:3306/jardineria"; //tipo:conector://IP:Puerto/base
        String usu = "root";  //Se indica en la administración de mysql
        //Nunca usar root y 3306 en cosas de producción, porque son fáciles de adivinar
        String clave = "Churrusken-7";

        //Creamos la conexión mediante la clase DriverManager
        try {
            Connection conex = DriverManager.getConnection(url,usu,clave);
            //Creamos la sentencia a través de la cual enviaremos la consulta y enviaremos los datos
            Statement stnt = conex.createStatement();
            System.out.println("/*-----------------------------Listado de empleados-------------------------*/");
            //Enviamos la consulta (Query) a la BBDD a través de la sentencia y obtenemos los resultados en un ResultSet
            String qry = "SELECT * FROM empleado";
            ResultSet rs = stnt.executeQuery(qry);
            //Recorremos el ResultSet para extraer los registros
            while (rs.next()){
                System.out.print(rs.getInt("codigo_empleado") + " | ");
                System.out.println(rs.getString(2) + " | " + rs.getString(3));
            }

            System.out.println("/*-------------Listado de oficinas y empleados--------------*/");
            //Obtener la lista de oficinas
            //creo la qry para obtener la lista de oficinas
            qry = "SELECT * FROM oficina";
            rs = stnt.executeQuery(qry);
            String qry2;
            PreparedStatement stnt2;
            ResultSet rs2;
            int count1 = 0;
            int count2 = 0;
            while (rs.next()){  //Cojo una oficina
                //Poner el código, la ciudad y el teléfono
                String oficina ="Oficina: " + rs.getString(1) + " | " + rs.getString("ciudad") + "| " + rs.getString("telefono");
                System.out.println(oficina);
                //Poner una fila de guiones debajo de esos datos
                System.out.println("-".repeat(oficina.length()));

                //Obtener la lista de empleados de esa oficina
                qry2 = "SELECT * FROM empleado WHERE codigo_oficina = ?";
                stnt2 = conex.prepareStatement(qry2);
                stnt2.setString(1,rs.getString("codigo_oficina"));
                rs2= stnt2.executeQuery();
                int count3 = 0;
                while (rs2.next()){
                    //Poner el código, nombre y apellido1 del empleado
                    String empleado = rs2.getString(1) + " | " + rs2.getString(2) + " | " + rs2.getString(3);
                    System.out.println(" * " + empleado);
                    System.out.println();
                    count2++;
                    count3++;
                }
                count1++;
                //Poner el nro de empleados de esa oficina
                System.out.println("Número de empleados en la oficina: " + count3 + " empleados");

                //Poner un espacio de separación entre los empleados y la siguiente oficina
                System.out.println(" ");
                rs2.close();
                stnt2.close();
            }

            //Poner el nro de oficinas y nro de empleados totales
            System.out.println("\nNúmero total de oficinas: " + count1 + " oficinas");
            System.out.println("Número total de empleados: " + count2 + " empleados");

            //-------------Listado de clientes y su representante de ventas
            //Datos cliente: codigo_cliente, nombre_cliente, teléfono (unido por codigo_empleado_rep_ventas)
            //Datos empleado: codigo_empleado, nombre, apellido1, apellido2
            qry = "SELECT * FROM empleado";
            rs = stnt.executeQuery(qry);
            String qry3 = "SELECT * FROM cliente WHERE codigo_empleado_rep_ventas = ?";
            PreparedStatement stnt3 = conex.prepareStatement(qry3);
            stnt3.setString(1,rs.getString(1));
            ResultSet rs3 = stnt3.executeQuery();

            while (rs3.next()){
                String ventas = rs3.getString(1) + " | " + rs3.getString(2) + " | " + rs3.getString(3);
                System.out.println(" * " + ventas);
                System.out.println();

            }
            rs3.next();
            stnt3.close();

            rs.close();
            stnt.close();
            conex.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
