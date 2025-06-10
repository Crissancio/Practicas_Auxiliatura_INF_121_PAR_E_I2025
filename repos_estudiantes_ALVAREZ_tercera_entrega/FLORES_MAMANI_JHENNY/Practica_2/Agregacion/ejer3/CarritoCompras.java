/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prac.agre2;

import java.util.ArrayList;

/**
 *
 * @author WINDOWS 11
 */
public class CarritoCompras {
    
    private ArrayList<Producto> productos;
    private final int MAX_PRODUCTOS = 10;

    public CarritoCompras() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (productos.size() < MAX_PRODUCTOS) {
            productos.add(producto);
            System.out.println("Producto agregado: " + producto.getNombre());
        } else {
            System.out.println("saturado no se puede" + producto.getNombre());
        }
    }
     public void mostrarCarrito() {
        System.out.println("----- Carrito de Compras -----");
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            for (Producto p : productos) {
                p.mostrarInfo();
            }
        }
    }
}
