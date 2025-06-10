package GENERECIDAD.Ejercicio4.Java;

import java.util.ArrayList;
import java.util.Collections;

public class Vector<T extends Comparable<T>> {
    private ArrayList<T> elementos;

    public Vector() {
        elementos = new ArrayList<>();
    }

    public void agregar(T valor) {
        elementos.add(valor);
    }

    public T obtener(int i) {
        if (i >= 0 && i < elementos.size()) {
            return elementos.get(i);
        }
        throw new IndexOutOfBoundsException("Índice inválido");
    }

    public T valorMayor() {
        return Collections.max(elementos);
    }

    public T valorMenor() {
        return Collections.min(elementos);
    }
}