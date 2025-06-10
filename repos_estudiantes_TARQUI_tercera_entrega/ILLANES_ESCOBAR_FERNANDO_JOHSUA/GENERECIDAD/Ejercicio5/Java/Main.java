package GENERECIDAD.Ejercicio5.Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("PRUEBA CON CADENAS:");
        System.out.println("-".repeat(30));

        Pila<String> pilaCadenas = new Pila<>();
        pilaCadenas.apilar("Python");
        pilaCadenas.apilar("Java");
        pilaCadenas.apilar("C++");

        pilaCadenas.mostrar();

        System.out.println("\nDesapilando:");
        String elemento1 = pilaCadenas.desapilar();
        if (elemento1 != null) {
            System.out.println("Elemento desapilado: " + elemento1);
        }
        pilaCadenas.mostrar();

        System.out.println("\nPRUEBA CON NÚMEROS:");
        System.out.println("-".repeat(30));

        Pila<Integer> pilaNumeros = new Pila<>();
        pilaNumeros.apilar(42);
        pilaNumeros.apilar(100);
        pilaNumeros.apilar(7);

        pilaNumeros.mostrar();

        System.out.println("\nDesapilando:");
        Integer elemento2 = pilaNumeros.desapilar();
        if (elemento2 != null) {
            System.out.println("Elemento desapilado: " + elemento2);
        }
        pilaNumeros.mostrar();
    }
}

