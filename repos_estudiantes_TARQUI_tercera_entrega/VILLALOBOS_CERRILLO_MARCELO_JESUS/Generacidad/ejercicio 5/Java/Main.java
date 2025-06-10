import java.util.Stack;
class Pila<T> {
    private Stack<T> elementos = new Stack<>();
    public void apilar(T dato) {
        elementos.push(dato);
    }
    public T desapilar() {
        if (!elementos.isEmpty()) {
            return elementos.pop();
        }
        return null;
    }
    public void mostrar() {
        System.out.println("Contenido de la pila: " + elementos);
    }
}
public class Main {
    public static void main(String[] args) {
        Pila<String> pt = new Pila<>();
        pt.apilar("Hola");
        pt.apilar("Mundo");
        pt.mostrar();
        pt.desapilar();
        pt.mostrar();
        Pila<Integer> pn = new Pila<>();
        pn.apilar(10);
        pn.apilar(20);
        pn.mostrar();
    }
}
