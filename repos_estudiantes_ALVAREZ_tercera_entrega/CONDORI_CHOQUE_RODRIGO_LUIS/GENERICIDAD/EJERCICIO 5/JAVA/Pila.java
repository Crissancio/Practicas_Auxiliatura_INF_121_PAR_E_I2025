package Ejecicio5;
import java.util.*;

public class Pila<T> {
    private List<T> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    // a) Apilar
    public void apilar(T elemento) {
        elementos.add(elemento);
    }

    // b) Desapilar
    public T desapilar() {
        if (estaVacia()) {
            System.out.println("Pila vacía");
            return null;
        }
        return elementos.remove(elementos.size() - 1);
    }

    // d) Mostrar
    public void mostrar() {
        System.out.println("Contenido de la pila:");
        for (int i = elementos.size() - 1; i >= 0; i--) {
            System.out.println(elementos.get(i));
        }
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }
} 
