/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generisidad_5;

/**
 *
 * @author WINDOWS 11
 */
 import java.util.ArrayList;
    
   

public class Pila<T> {
    private ArrayList<T> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    public void apilar(T item) {
        elementos.add(item);
    }

    public T desapilar() {
        if (!elementos.isEmpty()) {
            return elementos.remove(elementos.size() - 1);
        }
        return null; 
    }

    public void mostrarPila() {
        System.out.println("Contenido de la pila:");
        for (T item : elementos) {
            System.out.println(item);
        }
    }
}


