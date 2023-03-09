package repositorios;

import java.util.List;

public interface AbstractoIfx <T>{
    List<T> listar();
    T porId(int id);
    void guardar (T t);
    void borrar (int id);
}
