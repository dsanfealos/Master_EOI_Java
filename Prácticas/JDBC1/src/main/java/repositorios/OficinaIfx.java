package repositorios;

import modelos.Oficina;

import java.util.List;

public interface OficinaIfx {
    List<Oficina> listar();
    Oficina porId(String codigo_oficina);

    void guardar(Oficina ofi);

    void borrar(String codigo_oficina);
    List<Oficina> listaPorCiudad(String ciudad);
}
