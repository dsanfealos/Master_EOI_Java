package repositorios;

import modelos.Oficina;
import util.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OficinaRepoImpl implements OficinaIfx{
    private Connection abreConexion () throws SQLException {
        return ConexionBD.getConexion();
    }

    @Override
    public List<Oficina> listar() {

        List<Oficina> ofis = new ArrayList<>();


        try (Statement stnt = abreConexion().createStatement()){
            String qry = "SELECT * FROM oficina";
            ResultSet rs = stnt.executeQuery(qry);
            while (rs.next()){
                ofis.add(crearOficina(rs));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ofis;
    }

    @Override
    public Oficina porId(String codigo_oficina) {
        Oficina ofi = new Oficina();
        try (PreparedStatement stnt = abreConexion().prepareStatement("SELECT * FROM oficina WHERE codigo_oficina = ?")){
            stnt.setString(1,codigo_oficina);
            ResultSet rs = stnt.executeQuery();
            if (rs.next()){
                ofi = crearOficina(rs);
            }
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return ofi;
    }

    @Override
    public void guardar(Oficina ofi) {

    }

    @Override
    public void borrar(String codigo_oficina) {
        try (PreparedStatement stnt = abreConexion().prepareStatement("DELETE * FROM oficina WHERE codigo_oficina = ?")){
            stnt.setString(1,codigo_oficina);
            stnt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Oficina> listaPorCiudad(String ciudad) {
        return null;
    }
    private Oficina crearOficina(ResultSet rs) throws SQLException {
        Oficina ofi = new Oficina();
        ofi.setId(rs.getString(1));
        ofi.setCiudad(rs.getString(2));
        ofi.setTlf(rs.getString(6));
        return ofi;
    }
}
