package ej5generecidad;

public class Main {
    public static void main(String[] args) {
        Pila<Integer> pilaEnteros = new Pila<>();
        pilaEnteros.apilar(10);
        pilaEnteros.apilar(20);
        pilaEnteros.apilar(30);

        System.out.println("Pila enteros:");
        pilaEnteros.mostrar();
        System.out.println("Elemento desapilado: " + pilaEnteros.desapilar());
        pilaEnteros.mostrar();

        Pila<String> pilaCadenas = new Pila<>();
        pilaCadenas.apilar("uno");
        pilaCadenas.apilar("dos");
        pilaCadenas.apilar("tres");

        System.out.println("\nPila cadenas:");
        pilaCadenas.mostrar();
        System.out.println("Elemento desapilado: " + pilaCadenas.desapilar());
        pilaCadenas.mostrar();

        Pila<Integer> pilaPrimos = new Pila<>();
        pilaPrimos.apilar(2);
        pilaPrimos.apilar(3);
        pilaPrimos.apilar(5);
        pilaPrimos.apilar(7);
        pilaPrimos.apilar(11);

        System.out.println("\nPila números primos:");
        pilaPrimos.mostrar();
        System.out.println("Elemento desapilado: " + pilaPrimos.desapilar());
        pilaPrimos.mostrar();
    }
}
