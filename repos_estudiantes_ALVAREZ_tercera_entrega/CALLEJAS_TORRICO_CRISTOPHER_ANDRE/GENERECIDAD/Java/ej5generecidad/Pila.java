package ej5generecidad;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {
    private List<T> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    public void apilar(T elemento) {
        elementos.add(elemento);
    }

    public T desapilar() {
        if (!estaVacia()) {
            return elementos.remove(elementos.size() - 1);
        } else {
            throw new IndexOutOfBoundsException("La pila está vacía");
        }
    }

    public void mostrar() {
        System.out.println("Contenido de la pila:");
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}
