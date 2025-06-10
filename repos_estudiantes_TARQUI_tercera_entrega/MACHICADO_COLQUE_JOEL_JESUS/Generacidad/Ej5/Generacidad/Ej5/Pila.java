package Generacidad.Ej5;

import java.util.Stack;

public class Pila<T> {
    private Stack<T> pila = new Stack<>();

    public void apilar(T elemento) {
        pila.push(elemento);
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
        Pila<String> pilaTextos = new Pila<>();
        pilaTextos.apilar("Hola");
        pilaTextos.apilar("Mundo");
        pilaTextos.mostrar();
        System.out.println("Desapilado: " + pilaTextos.desapilar());
        pilaTextos.mostrar();

        Pila<Integer> pilaNumeros = new Pila<>();
        pilaNumeros.apilar(1);
        pilaNumeros.apilar(2);
        pilaNumeros.mostrar();
        System.out.println("Desapilado: " + pilaNumeros.desapilar());
        pilaNumeros.mostrar();

    }
}
