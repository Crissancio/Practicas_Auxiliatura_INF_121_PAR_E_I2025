package com.mycompany.practica_3;

/**
 *
 * @author WINDOWS 11
 */
public class Caja<T> {
    private T contenido;

  
    public void guardar(T valor) {
        this.contenido = valor;
    }

    
    public T obtener() {
        return contenido;
    }

    
    public void mostrar() {
        System.out.println("Contenido de la caja: " + contenido);
    }
}
