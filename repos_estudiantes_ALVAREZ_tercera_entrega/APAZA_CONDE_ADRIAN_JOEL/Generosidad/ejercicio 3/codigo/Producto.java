/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3.ejer3.gen;

/**
 *
 * @author Julios
 */
class Producto {
    private String nombre;
    private double precio;

    public Producto(String n, double p) {
        this.nombre = n;
        this.precio = p;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}
