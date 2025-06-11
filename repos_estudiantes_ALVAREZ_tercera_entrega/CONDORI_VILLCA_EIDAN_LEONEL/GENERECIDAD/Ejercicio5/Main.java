package Ejercicio5;
//Ejercicio 5: Crea una clase genérica Pila&lt;T&gt;
//a) Implementa un método para apilar
//b) Implementa un método para des apilar
//c) Prueba la pila con diferentes tipos de datos
//d) Muestra los datos de la pila
public class Main {
    public static void main(String[] args) {
        Pila<Integer> numero = new Pila<>();
        numero.apilar(10);
        numero.apilar(20);
        numero.apilar(30);
        System.out.println("Pila de enteros:");
        numero.mostrar();
        System.out.println("Desapilar: " + numero.desapilar());
        System.out.println("");
        numero.mostrar();
        Pila<String> letra = new Pila<>();
        letra.apilar("uno");
        letra.apilar("dos");
        letra.apilar("tres");
        System.out.println("\nPila de cadenas:");
        letra.mostrar();
        System.out.println("Desapilar: " + letra.desapilar());
        System.out.println("");
        letra.mostrar();
    }
}
