package Generecidad.Ejer5.Codigo;

//Ejercicio 5: Crea una clase genérica Pila<T>
//a) Implementa un método para apilar
//b) Implementa un método para des apilar
//c) Prueba la pila con diferentes tipos de datos
//d) Muestra los datos de la pila


public class Main {
    public static void main(String[] args) {
        System.out.println("--------- Primera pila ---------");
        Pila<Integer> pila = new Pila<>();
        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);
        pila.apilar(40);
        pila.apilar(50);
        pila.mostrar();
        System.out.println("Elemento desapilado: " + pila.desapilar());
        System.out.println("¿Está vacía la pila? " + pila.estaVacia());

        System.out.println("--------- Segunda pila ---------");

        Pila<String> pila2 = new Pila<>();
        pila2.apilar("azucar");
        pila2.apilar("sal");
        pila2.apilar("harina");
        pila2.apilar("arroz");
        pila2.apilar("aceite");
        pila2.apilar("vinagre");
        pila2.mostrar();
        System.out.println("Elemento desapilado: " + pila2.desapilar());
        System.out.println("¿Está llena la pila? " + pila2.estaLlena());
    }
}