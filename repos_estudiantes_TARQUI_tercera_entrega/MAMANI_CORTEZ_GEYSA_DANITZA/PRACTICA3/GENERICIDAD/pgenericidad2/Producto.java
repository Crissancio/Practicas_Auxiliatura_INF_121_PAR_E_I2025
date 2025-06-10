/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgenericidad2;

/**
 *
 * @author Administrador
 */
public class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " " + precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Producto) {
            Producto otro = (Producto) obj;
            return this.nombre.equals(otro.nombre) && this.precio == otro.precio;
        }
        return false;
    }
}


