package Ejecicio5;
/*
Ejercicio 5: Crea una clase genérica Pila&lt;T&gt;
a) Implementa un método para apilar
b) Implementa un método para des apilar
c) Prueba la pila con diferentes tipos de datos
d) Muestra los datos de la pila
*/
public class Main{
    public static void main(String[] args) {
        Contenedor<String> c1 = new Contenedor<>();
        c1.agregar("Hola");
        c1.agregar("Mundo");

        Contenedor<Integer> c2 = new Contenedor<>();
        c2.agregar(100);
        c2.agregar(200);

        System.out.println("Último: " + c1.obtenerUltimo());
        System.out.println("Cantidad: " + c2.contar());
    }
}
