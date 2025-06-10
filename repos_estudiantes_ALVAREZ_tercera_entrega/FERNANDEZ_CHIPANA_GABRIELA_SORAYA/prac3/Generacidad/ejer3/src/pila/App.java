
package pila;

public class App {
    public static void main(String[] args) {
      Pila<Integer> pilaEnteros = new Pila<>();
pilaEnteros.apilar(10);
pilaEnteros.apilar(20);
pilaEnteros.apilar(30);
System.out.println("Desapilado: " + pilaEnteros.desapilar());
pilaEnteros.mostrar();

Pila<String> pilaTextos = new Pila<>();
pilaTextos.apilar("Hola");
pilaTextos.apilar("Mundo");
pilaTextos.mostrar();

    }}