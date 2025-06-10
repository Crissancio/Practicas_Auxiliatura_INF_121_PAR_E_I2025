/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gener5;

/**
 *
 * @author WINDOWS 11
 */

    
    import java.util.ArrayList;

public class Catalogo<T> {
    private ArrayList<T> elementos;

    public Catalogo() {
        elementos = new ArrayList<>();
    }

    public void agregar(T item) {
        elementos.add(item);
    }

    public boolean buscar(T item) {
        return elementos.contains(item);
    }

    public void mostrarCatalogo() {
        for (T item : elementos) {
            System.out.println(item);
        }
    }
}

