package Ejecicio5;
/*
Ejercicio 5: Crea una clase genérica Pila<T>;
a) Implementa un método para apilar
b) Implementa un método para des apilar
c) Prueba la pila con diferentes tipos de datos
d) Muestra los datos de la pila
*/
public class Main{
    public static void main(String[] args) {
        // c) Probar con Integer
        Pila<Integer> pilaEnteros = new Pila<>();
        pilaEnteros.apilar(10);
        pilaEnteros.apilar(20);
        pilaEnteros.mostrar();
        pilaEnteros.desapilar();
        pilaEnteros.mostrar();

        // c) Probar con String
        Pila<String> pilaCadenas = new Pila<>();
        pilaCadenas.apilar("Hola");
        pilaCadenas.apilar("Mundo");
        pilaCadenas.mostrar();

        // c) Probar con Double
        Pila<Double> pilaDecimales = new Pila<>();
        pilaDecimales.apilar(3.14);
        pilaDecimales.apilar(2.71);
        pilaDecimales.mostrar();
    }
}
