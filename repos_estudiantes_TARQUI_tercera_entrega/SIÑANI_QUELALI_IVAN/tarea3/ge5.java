import java.util.Stack;
public class Pila<T> {
    private Stack<T> elementos = new Stack<>();
    public void apilar(T elemento) {
        elementos.push(elemento);
    }
    public T desapilar() {
        return elementos.isEmpty() ? null : elementos.pop();
    }
    public void mostrarPila() {
        System.out.println("Contenido de la pila: " + elementos);
    }

    public static void main(String[] args) {
        Pila<Integer> pilaEnteros = new Pila<>();
        pilaEnteros.apilar(10);
        pilaEnteros.apilar(20);
        pilaEnteros.mostrarPila();
        System.out.println("Elemento desapilado: " + pilaEnteros.desapilar());
        pilaEnteros.mostrarPila();

        Pila<String> pilaCadenas = new Pila<>();
        pilaCadenas.apilar("Hola");
        pilaCadenas.apilar("Mundo");
        pilaCadenas.mostrarPila();
        System.out.println("Elemento desapilado: " + pilaCadenas.desapilar());
        pilaCadenas.mostrarPila();
    }
}
//DIAGRAMA
//Clase Pila<T>
//---------------------------
//- elementos: Stack<T>
//---------------------------
//+ apilar(T elemento): void
//+ desapilar(): T
//+ mostrarPila(): void
//---------------------------
//Clase Main
//---------------------------
//+ main(String[] args): void
//---------------------------
