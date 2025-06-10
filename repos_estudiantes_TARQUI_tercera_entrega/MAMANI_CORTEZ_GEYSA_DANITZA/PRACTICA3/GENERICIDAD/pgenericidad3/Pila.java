/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgenericidad3;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Pila<T> {
    private ArrayList<T> elementos = new ArrayList<>();

    // a) Método para apilar (push)
    public void apilar(T item) {
        elementos.add(item);
    }

    // b) Método para desapilar (pop)
    public T desapilar() {
        if (!estaVacia()) {
            return elementos.remove(elementos.size() - 1);
        }
        return null; // O lanzar una excepción si prefieres
    }

    // Ver si la pila está vacía
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    // d) Mostrar contenido de la pila
    public void mostrar() {
        System.out.println("Contenido de la pila (de abajo hacia arriba):");
        for (T item : elementos) {
            System.out.println(item);
        }
    }
}
