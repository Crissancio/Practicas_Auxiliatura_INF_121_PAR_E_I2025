package Generacidad.Ejercicio3;


import java.util.ArrayList;

public class Pila<T> {
    private ArrayList<T> elementos;

    public Pila() {
        this.elementos = new ArrayList<>();
    }

    // a) 
    public void apilar(T elemento) {
        elementos.add(elemento);
    }

    // b) 
    public T desapilar() {
        if (elementos.isEmpty()) {
            return null; 
        }
        return elementos.remove(elementos.size() - 1);
    }

    // d) 
    public void mostrar() {
        System.out.println("Contenido de la pila:");
        for (int i = elementos.size() - 1; i >= 0; i--) {
            System.out.println(elementos.get(i));
        }
    }

   
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Pila de enteros");
        Pila<Integer> pilaEnteros = new Pila<>();
        pilaEnteros.apilar(10);
        pilaEnteros.apilar(20);
        pilaEnteros.apilar(30);
        pilaEnteros.mostrar();
        System.out.println("Desapilar: " + pilaEnteros.desapilar());
        pilaEnteros.mostrar();

        System.out.println("\nPila de cadenas");
        Pila<String> pilaStrings = new Pila<>();
        pilaStrings.apilar("noemi chino blanco");
        pilaStrings.apilar("no");
        pilaStrings.mostrar();
        System.out.println("Desapilar: " + pilaStrings.desapilar());
        pilaStrings.mostrar();
    }
}

