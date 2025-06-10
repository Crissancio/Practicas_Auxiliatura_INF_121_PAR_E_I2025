package GENERECIDAD.Ejercicio5.Java;

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
        if (!elementos.isEmpty()) {
            return elementos.remove(elementos.size() - 1);
        }
        return null;
    }

    public void mostrar() {
        if (elementos.isEmpty()) {
            System.out.println("La pila está vacía");
        } else {
            System.out.println("Contenido de la pila (de arriba a abajo):");
            for (int i = elementos.size() - 1, pos = 1; i >= 0; i--, pos++) {
                System.out.println(pos + ". " + elementos.get(i));
            }
        }
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}

