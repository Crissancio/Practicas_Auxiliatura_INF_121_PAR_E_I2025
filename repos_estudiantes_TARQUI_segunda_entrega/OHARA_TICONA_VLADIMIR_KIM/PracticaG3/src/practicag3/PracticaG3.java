package practicag3;
import java.util.Stack;
/**
 *
 * @Vladimir Ohara
 */
public class PracticaG3<T> {
    private Stack<T> pila = new Stack<>();

    public void apilar(T item) {
        pila.push(item);
    }
    public T desapilar() {
        if (!pila.isEmpty()) {
            return pila.pop();
        }
        return null;
    }
    public void mostrar() {
        System.out.println("Contenido de la pila: " + pila);
    }
    public static void main(String[] args) {
        PracticaG3<Integer> pilaNumeros = new PracticaG3<>();
        pilaNumeros.apilar(10);
        pilaNumeros.apilar(20);
        pilaNumeros.mostrar();
        System.out.println("Desapilado: " + pilaNumeros.desapilar());

        PracticaG3<String> pilaTextos = new PracticaG3<>();
        pilaTextos.apilar("uno");
        pilaTextos.apilar("dos");
        pilaTextos.mostrar();
    }
}

