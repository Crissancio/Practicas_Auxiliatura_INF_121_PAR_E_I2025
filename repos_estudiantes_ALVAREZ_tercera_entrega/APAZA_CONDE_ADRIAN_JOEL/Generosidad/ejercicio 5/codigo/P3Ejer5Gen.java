/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p3.ejer5.gen;

/**
 *
 * @author Adrian
 */
/*
5: Crea una clase genérica Pila<T> 
a) Implementa un método para apilar 
b) Implementa un método para des apilar 
c) Prueba la pila con diferentes tipos de datos 
d) Muestra los datos de la pila
*/
public class P3Ejer5Gen {
    
    public static void main(String[] args) {
        // c) probando con numeros enteros
        System.out.println("pila de numeros enteros");
        Pila<Integer> pilaEnteros = new Pila<>(5);
        pilaEnteros.apilar(10);
        pilaEnteros.apilar(20);
        pilaEnteros.apilar(30);
        // d) mostrando los datos de la pila de numeros enteros
        pilaEnteros.mostrar();
        System.out.println("desapilado: " + pilaEnteros.desapilar());
        pilaEnteros.mostrar();
        // c) probando con cadenas
        System.out.println("pila de cadenas");
        Pila<String> pilaCadenas = new Pila<>(3);
        pilaCadenas.apilar("Adrian");
        pilaCadenas.apilar("Andrea");
        pilaCadenas.apilar("Angel");
        // d) mostrando los datos de la pila de cadenas
        pilaCadenas.mostrar();
        System.out.println("desapilado: " + pilaCadenas.desapilar());
        pilaCadenas.mostrar();
    }
}


