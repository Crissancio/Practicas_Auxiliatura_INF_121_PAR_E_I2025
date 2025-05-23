/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Fabricio
 */
class CarritoCompras {
    ArrayList<Producto> productos = new ArrayList<>();

    public void agregar_producto(Producto p) {
        if (productos.size() < 10) {
            productos.add(p);
        } else {
            System.out.println("No se puede agregar más de 10 productos.");
        }
    }

    public void mostrar_carrito() {
        System.out.println("Carrito de Compras:");
        for (Producto p : productos) {
            p.mostrar_info();
        }
    }
}