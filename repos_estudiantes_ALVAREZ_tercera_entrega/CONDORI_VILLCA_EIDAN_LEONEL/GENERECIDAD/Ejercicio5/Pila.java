package Ejercicio5;
import java.util.ArrayList;
public class Pila<T> {
    private ArrayList<T> elementos;
    public Pila() {
        elementos = new ArrayList<>();
    }
    public void apilar(T valor) {
        elementos.add(valor);
    }
    public T desapilar() {
        if (!elementos.isEmpty()) {
            return elementos.remove(elementos.size() - 1);
        } else {
            return null;
        }
    }
    public void mostrar() {
        for (int i = elementos.size() - 1; i >= 0; i--) {
            System.out.println(elementos.get(i));
        }
    }
    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}
