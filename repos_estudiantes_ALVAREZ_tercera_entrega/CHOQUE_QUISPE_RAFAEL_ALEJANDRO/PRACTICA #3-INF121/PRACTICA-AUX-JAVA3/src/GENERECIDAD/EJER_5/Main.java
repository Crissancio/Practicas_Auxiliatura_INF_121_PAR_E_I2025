/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GENERECIDAD.EJER_5;

public class Main {
    public static void main(String[] args) {
        Pila<Integer> pilaEnteros = new Pila<>();
        // c) Probar la pila con enteros
        pilaEnteros.apilar(10);
        pilaEnteros.apilar(20);
        pilaEnteros.apilar(30);
        
        System.out.println("Pila de enteros:");
        pilaEnteros.mostrar();
        System.out.println("Desapilado: " + pilaEnteros.desapilar());
        
        // c) Probar la pila con strings
        Pila<String> pilaStrings = new Pila<>();
        pilaStrings.apilar("Primero");
        pilaStrings.apilar("Segundo");
        pilaStrings.apilar("Tercero");
        
        System.out.println("\nPila de strings:");
        pilaStrings.mostrar();
        System.out.println("Desapilado: " + pilaStrings.desapilar());
    }
}
