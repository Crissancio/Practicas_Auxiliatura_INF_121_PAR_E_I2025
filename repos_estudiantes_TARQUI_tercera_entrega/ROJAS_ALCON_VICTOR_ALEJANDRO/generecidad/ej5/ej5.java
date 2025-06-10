import java.util.ArrayList;

class Pila<T> {
    private ArrayList<T> elementos = new ArrayList<>();
    public void apilar(T item) {
        elementos.add(item);
    }

    public T desapilar() {
        if (!elementos.isEmpty()) {
            return elementos.remove(elementos.size() - 1);
        }
        return null; 
    }

    public void mostrar() {
        System.out.println("Contenido de la pila:");
        for (int i = elementos.size() - 1; i >= 0; i--) {
            System.out.println(elementos.get(i));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pila<String> pilaTexto = new Pila<>();
        pilaTexto.apilar("uno");
        pilaTexto.apilar("dos");
        pilaTexto.mostrar();
        System.out.println("Desapilado: " + pilaTexto.desapilar());
        pilaTexto.mostrar();

        Pila<Integer> pilaNumeros = new Pila<>();
        pilaNumeros.apilar(10);
        pilaNumeros.apilar(20);
        pilaNumeros.mostrar();
        System.out.println("Desapilado: " + pilaNumeros.desapilar());
        pilaNumeros.mostrar();
    }
}