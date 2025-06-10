package EJERCICIO3;

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
        int size = elementos.size();
        if (size == 0) {
            return null;
        }
        return elementos.remove(size - 1);
    }

    public void mostrar() {
        System.out.println("Contenido de la pila:");
        for (int i = elementos.size() - 1; i >= 0; i--) {
            System.out.println(elementos.get(i));
        }
    }
}
