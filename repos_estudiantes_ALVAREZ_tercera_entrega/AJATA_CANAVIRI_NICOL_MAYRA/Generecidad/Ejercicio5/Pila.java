package Generecidad.Ejercicio5;
import java.util.ArrayList;
import java.util.List;

public class Pila<T> {
    private List<T> elementos = new ArrayList<>();

    public void apilar(T elemento) {
        elementos.add(elemento);
    }

    public T desapilar() {
        if (elementos.isEmpty()) {
            return null;
        }
        return elementos.remove(elementos.size() - 1);
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public void mostrar() {
        System.out.println("Elementos en la pila: " + elementos);
    }
}

