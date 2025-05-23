/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagregacion2;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class CarritoCompras {
    private Producto[] productos = new Producto[10];
    private int cantidad=0;
    public boolean agregarProducto(Producto p) {
        
        if (cantidad >= 10) {
            System.out.println(" Carrito lleno.");
            return false;
        }
        productos[cantidad++] = p;                   
        System.out.println(" Añadido: " + p.getNombre());
        return true;
    }

    public void mostrarInfo() {
        System.out.println("-- Carrito --");
        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            productos[i].mostrarInfo();
            total += productos[i].getPrecio();
        }
        System.out.println("TOTAL: "+ total);
    }

}
