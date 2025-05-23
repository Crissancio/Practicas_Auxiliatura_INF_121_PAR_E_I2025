package com.mycompany.practicac5;

public class PracticaC5 {

    public static void main(String[] args) {
        CarritoCompra carrito = new CarritoCompra();

        for (int i = 1; i <= 11; i++) {
            Producto producto = new Producto("Producto " + i, i * 10);
            carrito.agregarProducto(producto);
        }

        carrito.mostrarCarrito();
    }
}
