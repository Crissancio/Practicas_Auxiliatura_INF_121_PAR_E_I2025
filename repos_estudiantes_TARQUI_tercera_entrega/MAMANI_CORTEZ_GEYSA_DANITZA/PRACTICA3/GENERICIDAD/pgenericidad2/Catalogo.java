/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgenericidad2;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Catalogo <T>{
    private ArrayList<T> elementos = new ArrayList<>();

    public void agregar(T e) {
        elementos.add(e);
    }

    public boolean buscar(T item) {
        return elementos.contains(item);
    }

    public void mostrar() {
        for (T item : elementos) {
            System.out.println(item);
        }
    }
}
