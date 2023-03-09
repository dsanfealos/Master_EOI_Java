package repositorios;

import modelos.Empleado;
import modelos.Oficina;
import util.ConexionBD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepoImp implements AbstractoIfx<Empleado> {

    private Connection abreConexion () throws SQLException {
        return ConexionBD.getConexion();
    }

    @Override
    public List<Empleado> listar() {
        List<Empleado> listaEmple = new ArrayList<>();

        try (Statement stnt = abreConexion().createStatement()){
            String qry = "SELECT e.*, o.* FROM empleado e JOIN oficina o ON e.codigo_oficina = o.codigo_oficina";
            ResultSet rs = stnt.executeQuery(qry);
            while (rs.next()){
                listaEmple.add(crearEmpleado(rs));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaEmple;

    }

    @Override
    public Empleado porId(int id) {
        return null;
    }

    @Override
    public void guardar(Empleado empleado) {

    }

    @Override
    public void borrar(int id) {

    }

    private Empleado crearEmpleado(ResultSet rs) throws SQLException {
        Empleado emple = new Empleado();
        Oficina ofi = new Oficina();
        emple.setId(rs.getInt(1));
        emple.setNombre(rs.getString(2));
        ofi.setId(rs.getString(10));
        ofi.setCiudad(rs.getString(11));
        ofi.setTlf(rs.getString(16));
        emple.setOfi(ofi);

        return emple;
    }

}
