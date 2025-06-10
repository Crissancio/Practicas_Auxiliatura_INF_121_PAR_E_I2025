package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {
    private List<T> elementos = new ArrayList<>();

    public void apilar(T elemento) {
        elementos.add(elemento);
    }

    public T desapilar() {
        if (!elementos.isEmpty()) {
            return elementos.remove(elementos.size() - 1);
        } else {
            return null;
        }
    }

    public void mostrarPila() {
        System.out.println("Contenido de la pila:");
        for (int i = elementos.size() - 1; i >= 0; i--) {
            System.out.println(elementos.get(i));
        }
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}
