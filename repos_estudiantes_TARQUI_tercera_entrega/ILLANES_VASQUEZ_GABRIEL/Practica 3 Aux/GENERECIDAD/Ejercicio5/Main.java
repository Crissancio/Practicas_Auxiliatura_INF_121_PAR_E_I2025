package Generesidad3;

public class Main {
    public static void main(String[] args) {
        Pila<String> pilaCadenas = new Pila<>(3);
        pilaCadenas.apilar("Uno");
        pilaCadenas.apilar("Dos");
        pilaCadenas.apilar("Tres");
        pilaCadenas.mostrarTodo();
        System.out.println("desapilado");
        pilaCadenas.desapilar();
        pilaCadenas.desapilar();
        
        pilaCadenas.mostrarTodo();

        System.out.println("\n--------\n");

        Pila<Integer> pilaNumeros = new Pila<>(2);
        pilaNumeros.apilar(10);
        pilaNumeros.apilar(20);
        pilaNumeros.mostrarTodo();
        System.out.println("desapilado");
        pilaNumeros.desapilar();
        pilaNumeros.mostrarTodo();
    }
}
