
package mainpila;

import java.util.ArrayList;

public class Pila<T> {
    private ArrayList<T> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    // a) Método para apilar
    public void apilar(T elemento) {
        elementos.add(elemento);
    }

    // b) Método para desapilar
    public T desapilar() {
        if (!elementos.isEmpty()) {
            return elementos.remove(elementos.size() - 1);
        } else {
            System.out.println("La pila está vacía.");
            return null;
        }
    }

    // d) Mostrar los datos de la pila
    public void mostrar() {
        System.out.println("Contenido de la pila:");
        for (int i = elementos.size() - 1; i >= 0; i--) {
            System.out.println(elementos.get(i));
        }
    }

    // Método auxiliar para saber si la pila está vacía
    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}


