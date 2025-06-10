package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {
    private List<T> elementos;

    // Constructor para inicializar la pila
    public Pila() {
        this.elementos = new ArrayList<>();
    }

    // Método para apilar un elemento
    public void apilar(T elemento) {
        elementos.add(elemento);
    }

    // Método para des-apilar un elemento (eliminando el último agregado)
    public T desapilar() {
        if (elementos.isEmpty()) {
            return null; // Retorna null si la pila está vacía
        } else {
            return elementos.remove(elementos.size() - 1);
        }
    }

    // Método para mostrar todos los elementos de la pila
    public void mostrarPila() {
        if (elementos.isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Contenido de la pila:");
            for (T elemento : elementos) {
                System.out.println(elemento);
            }
        }
    }
}
