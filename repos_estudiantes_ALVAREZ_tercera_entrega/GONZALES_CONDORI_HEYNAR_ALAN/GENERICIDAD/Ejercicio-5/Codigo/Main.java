package Ejercicio5;
/*
Crea una clase genérica Pila<T>
a) Implementa un método para apilar
b) Implementa un método para des apilar
c) Prueba la pila con diferentes tipos de datos
d) Muestra los datos de la pila
*/
public class Main {
    public static void main(String[] args) {
        // Crear una pila para Integer
        Pila<Integer> pilaDeEnteros = new Pila<>();
        pilaDeEnteros.apilar(10);
        pilaDeEnteros.apilar(20);
        pilaDeEnteros.apilar(30);

        // Mostrar los elementos de la pila
        pilaDeEnteros.mostrarPila();

        // Desapilar un elemento
        System.out.println("Desapilando: " + pilaDeEnteros.desapilar());

        // Mostrar los elementos de la pila después de desapilar
        pilaDeEnteros.mostrarPila();

        // Crear una pila para String
        Pila<String> pilaDeStrings = new Pila<>();
        pilaDeStrings.apilar("Java");
        pilaDeStrings.apilar("Generics");
        pilaDeStrings.apilar("Pila");

        // Mostrar los elementos de la pila
        pilaDeStrings.mostrarPila();

        // Desapilar un elemento
        System.out.println("Desapilando: " + pilaDeStrings.desapilar());

        // Mostrar los elementos de la pila después de desapilar
        pilaDeStrings.mostrarPila();
    }
}
