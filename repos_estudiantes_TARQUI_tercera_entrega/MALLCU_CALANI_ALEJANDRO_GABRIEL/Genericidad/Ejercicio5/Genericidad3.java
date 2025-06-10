/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.genericidad3;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
import java.util.List;

class Pila<T> {
    private List<T> elementos = new ArrayList<>();

    public void apilar(T elemento) {
        elementos.add(elemento);
    }

    public T desapilar() {
        if (!elementos.isEmpty()) {
            return elementos.remove(elementos.size() - 1);
        }
        return null;
    }

    public List<T> obtenerElementos() {
        return elementos;
    }
}

public class Genericidad3 {
    public static void main(String[] args) {
        System.out.println("📥 Apilando datos...");

        // c) Prueba con diferentes tipos de datos
        Pila<Integer> pilaEnteros = new Pila<>();
        pilaEnteros.apilar(10);
        pilaEnteros.apilar(20);
        pilaEnteros.apilar(30);
        System.out.println("📦 Elemento desapilado (int): " + pilaEnteros.desapilar());

        Pila<String> pilaCadenas = new Pila<>();
        pilaCadenas.apilar("Hola");
        pilaCadenas.apilar("Mundo");
        System.out.println("📦 Elemento desapilado (str): " + pilaCadenas.desapilar());

        Pila<Float> pilaDecimales = new Pila<>();
        pilaDecimales.apilar(3.14f);
        System.out.println("📦 Elemento desapilado (float): " + pilaDecimales.desapilar());

        // d) Mostrar los datos de la pila
        System.out.println("\n📋 Contenido actual de la pila int: " + pilaEnteros.obtenerElementos());
        System.out.println("📋 Contenido actual de la pila str: " + pilaCadenas.obtenerElementos());
        System.out.println("📋 Contenido actual de la pila float: " + pilaDecimales.obtenerElementos());
    }
}
