package GENERECIDAD.EJERCICIO_3;

import java.util.ArrayList;

public class Catalogo<T> {
    private ArrayList<T> elementos = new ArrayList<>();

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T buscar(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            return elementos.get(indice);
        }
        return null;
    }

    public ArrayList<T> obtenerTodos() {
        return elementos;
    }
}
