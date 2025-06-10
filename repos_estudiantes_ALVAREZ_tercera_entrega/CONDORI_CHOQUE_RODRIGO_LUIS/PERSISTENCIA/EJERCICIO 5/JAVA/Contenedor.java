package Ejecicio5;
import java.util.*;

public class Contenedor<T> {
    private List<T> elementos = new ArrayList<>();

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T obtenerUltimo() {
        if (elementos.isEmpty()) return null;
        return elementos.get(elementos.size() - 1);
    }

    public int contar() {
        return elementos.size();
    }
}
