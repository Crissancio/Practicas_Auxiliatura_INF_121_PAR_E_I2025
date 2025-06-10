
//Ejercicio 5: Crea una clase genérica Pila<T> 
import java.util.ArrayList;

public class Pila<T> {
    private ArrayList<T> elementos = new ArrayList<>();

    // a) Implementa un método para apilar
    public void apilar(T dato) {
        elementos.add(dato);
    }
    // b) Implementa un método para des apilar

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

    public static void main(String[] args) {
        // c) Prueba la pila con diferentes tipos de datos
        // d) Muestra los datos de la pila
        Pila<String> pilaTexto = new Pila<>();
        pilaTexto.apilar("uno");
        pilaTexto.apilar("dos");
        pilaTexto.mostrar();
        System.out.println("Desapilado: " + pilaTexto.desapilar());
        pilaTexto.mostrar();

        Pila<Integer> pilaNumeros = new Pila<>();
        pilaNumeros.apilar(451);
        pilaNumeros.apilar(2222);
        pilaNumeros.mostrar();
        System.out.println("Desapilado: " + pilaNumeros.desapilar());
        pilaNumeros.mostrar();
    }
}
