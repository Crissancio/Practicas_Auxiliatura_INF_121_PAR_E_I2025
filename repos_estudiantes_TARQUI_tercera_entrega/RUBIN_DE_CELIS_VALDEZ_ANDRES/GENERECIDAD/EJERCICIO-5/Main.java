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

        Pila<String> pilaCadenas = new Pila<>();
        pilaCadenas.apilar("uno");
        pilaCadenas.apilar("dos");
        pilaCadenas.apilar("tres");
        pilaCadenas.mostrar();
        System.out.println("Desapilado: " + pilaCadenas.desapilar());
        pilaCadenas.mostrar();
    }
}
