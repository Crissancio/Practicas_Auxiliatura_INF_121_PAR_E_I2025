package EJERCICIO3;

public class Main {
    public static void main(String[] args) {
        Pila<Integer> pilaEnteros = new Pila<>();
        pilaEnteros.apilar(10);
        pilaEnteros.apilar(20);
        pilaEnteros.apilar(30);
        pilaEnteros.mostrar();
        System.out.println("Desapilado: " + pilaEnteros.desapilar());
        pilaEnteros.mostrar();

        System.out.println();

        Pila<String> pilaStrings = new Pila<>();
        pilaStrings.apilar("Hola");
        pilaStrings.apilar("Mundo");
        pilaStrings.apilar("Java");
        pilaStrings.mostrar();
        System.out.println("Desapilado: " + pilaStrings.desapilar());
        pilaStrings.mostrar();

    }
}