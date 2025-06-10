package generacidad;

//c) y d)
public class Main {
 public static void main(String[] args) {
     // c)
     Pila<Integer> pilaEnteros = new Pila<>();
     pilaEnteros.apilar(10);
     pilaEnteros.apilar(20);
     pilaEnteros.apilar(30);

     Pila<String> pilaTextos = new Pila<>();
     pilaTextos.apilar("Uno");
     pilaTextos.apilar("Dos");

     // d)
     pilaEnteros.mostrar();
     pilaEnteros.desapilar();
     pilaEnteros.mostrar();

     pilaTextos.mostrar();
     pilaTextos.desapilar();
     pilaTextos.mostrar();
 }
}