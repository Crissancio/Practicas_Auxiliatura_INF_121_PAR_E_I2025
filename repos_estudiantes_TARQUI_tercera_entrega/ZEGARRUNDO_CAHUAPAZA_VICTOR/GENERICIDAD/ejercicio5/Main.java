package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Pila<Integer> pilaEnteros = new Pila<>();
        pilaEnteros.apilar(10);
        pilaEnteros.apilar(20);
        pilaEnteros.apilar(30);
        System.out.println("Pila de enteros:");
        pilaEnteros.mostrarPila();

        System.out.println("Desapilado: " + pilaEnteros.desapilar());
        pilaEnteros.mostrarPila();

        Pila<String> pilaCadenas = new Pila<>();
        pilaCadenas.apilar("Hola");
        pilaCadenas.apilar("Mundo");
        System.out.println("\nPila de cadenas:");
        pilaCadenas.mostrarPila();

        System.out.println("Desapilado: " + pilaCadenas.desapilar());
        pilaCadenas.mostrarPila();
    }
}