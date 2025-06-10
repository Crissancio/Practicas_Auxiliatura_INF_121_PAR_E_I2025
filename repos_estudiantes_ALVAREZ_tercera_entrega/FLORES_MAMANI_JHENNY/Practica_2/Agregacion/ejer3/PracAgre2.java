/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prac.agre2;

/**
 *
 * @author WINDOWS 11
 */
public class PracAgre2 {

  
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();
        carrito.agregarProducto(new Producto("chulo", 45));
        carrito.agregarProducto(new Producto("papa", 45));
        carrito.agregarProducto(new Producto(" kamote", 23));
        carrito.agregarProducto(new Producto("mote", 20));
        carrito.agregarProducto(new Producto(" fideo", 35));
        carrito.agregarProducto(new Producto("huevo", 30));
       
        carrito.mostrarCarrito();
    }
}






    

