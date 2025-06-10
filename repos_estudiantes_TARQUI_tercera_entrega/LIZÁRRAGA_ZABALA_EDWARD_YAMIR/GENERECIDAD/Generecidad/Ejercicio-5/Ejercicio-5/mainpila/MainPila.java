
package mainpila;

public class MainPila {
    public static void main(String[] args) {
        // c) Probar la pila con diferentes tipos de datos

        // Pila de enteros
        Pila<Integer> pilaEnteros = new Pila<>();
        pilaEnteros.apilar(10);
        pilaEnteros.apilar(20);
        pilaEnteros.apilar(30);

        System.out.println("Pila de Enteros:");
        pilaEnteros.mostrar();

        System.out.println("Elemento desapilado: " + pilaEnteros.desapilar());
        pilaEnteros.mostrar();

        // Pila de Strings
        Pila<String> pilaStrings = new Pila<>();
        pilaStrings.apilar("Hola");
        pilaStrings.apilar("Mundo");
        pilaStrings.apilar("Java");

        System.out.println("\nPila de Strings:");
        pilaStrings.mostrar();

        System.out.println("Elemento desapilado: " + pilaStrings.desapilar());
        pilaStrings.mostrar();

        // Pila de Doubles
        Pila<Double> pilaDoubles = new Pila<>();
        pilaDoubles.apilar(1.1);
        pilaDoubles.apilar(2.2);
        pilaDoubles.apilar(3.3);

        System.out.println("\nPila de Doubles:");
        pilaDoubles.mostrar();

        System.out.println("Elemento desapilado: " + pilaDoubles.desapilar());
        pilaDoubles.mostrar();
    }
}


