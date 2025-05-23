/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicac5;
import java.util.*;
public class CarritoCompra {
    private ArrayList<Producto> productos;

    public CarritoCompra() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (productos.size() < 10) {
            productos.add(producto);
            System.out.println("Producto agregado: " + producto.getNombre());
        } else {
            System.out.println("No se puede agregar más de 10 productos al carrito.");
        }
    }

    public void mostrarCarrito() {
        System.out.println("Contenido del carrito:");
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
        System.out.println("Total de productos: " + productos.size());
    }
}
