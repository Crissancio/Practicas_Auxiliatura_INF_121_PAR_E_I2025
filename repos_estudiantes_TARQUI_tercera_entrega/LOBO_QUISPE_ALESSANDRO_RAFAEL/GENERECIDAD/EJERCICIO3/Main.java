public class Main {
    public static void main(String[] args) {
        // c) Probar la pila con diferentes tipos de datos
        
        // Pila de enteros
        Pila<Integer> pilaEnteros = new Pila<>();
        pilaEnteros.apilar(10);
        pilaEnteros.apilar(20);
        pilaEnteros.apilar(30);
        
        System.out.println("Pila de enteros:");
        pilaEnteros.mostrar();
        System.out.println("Desapilado: " + pilaEnteros.desapilar());
        pilaEnteros.mostrar();
        
        // Pila de cadenas
        Pila<String> pilaCadenas = new Pila<>();
        pilaCadenas.apilar("Hola");
        pilaCadenas.apilar("Mundo");
        pilaCadenas.apilar("Java");
        
        System.out.println("\nPila de cadenas:");
        pilaCadenas.mostrar();
        System.out.println("Desapilado: " + pilaCadenas.desapilar());
        pilaCadenas.mostrar();
    }
}
