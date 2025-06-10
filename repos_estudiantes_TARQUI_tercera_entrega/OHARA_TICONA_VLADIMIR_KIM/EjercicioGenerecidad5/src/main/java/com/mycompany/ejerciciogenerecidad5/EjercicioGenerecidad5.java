package com.mycompany.ejerciciogenerecidad5;
import java.util.*;
/**
 *
 * @author Vladimir Ohara
 */
class Pila<T> {
    private List<T> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }
//Elinciso A 
    public void apilar(T elemento) {
        elementos.add(elemento);
    }
//EL inciso B
    public T desapilar() {
        if (!elementos.isEmpty()) {
            return elementos.remove(elementos.size() - 1);
        }
        return null;
    }

    public void mostrar() {
        System.out.println("Contenido de la pila:");
        for (int i = elementos.size() - 1; i >= 0; i--) {
            System.out.println(elementos.get(i));
        }
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}
public class EjercicioGenerecidad5 {

    public static void main(String[] args) {
        // inciso C
        Pila<Integer> pilaEnteros = new Pila<>();
        pilaEnteros.apilar(10);
        pilaEnteros.apilar(20);
        pilaEnteros.apilar(30);

        Pila<String> pilaStrings = new Pila<>();
        pilaStrings.apilar("uno");
        pilaStrings.apilar("dos");
        pilaStrings.apilar("tres");
        //El inciso D
        pilaEnteros.mostrar();
        System.out.println("Desapilado: " + pilaEnteros.desapilar());
        pilaEnteros.mostrar();
        
        pilaStrings.mostrar();
        System.out.println("Desapilado: " + pilaStrings.desapilar());
        pilaStrings.mostrar();
    }
}
