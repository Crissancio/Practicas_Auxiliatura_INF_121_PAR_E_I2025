package GENERECIDAD.EJER_5;
import java.util.ArrayList;
import java.util.List;
public class Pila<T> {
    private List<T> elementos = new ArrayList<>();
    // a) Método para apilar un elemento
    public void apilar(T elemento) {
        elementos.add(elemento);
    }
    
    // b) Método para desapilar un elemento
    public T desapilar() {
        if (elementos.isEmpty()) {
            return null;
        }
        return elementos.remove(elementos.size() - 1);
    }
    
    // d) Método para mostrar los datos de la pila
    public void mostrar() {
        for (int i = elementos.size() - 1; i >= 0; i--) {
            System.out.println("| " + elementos.get(i) + " |");
        }
        System.out.println("-----");
    }
}