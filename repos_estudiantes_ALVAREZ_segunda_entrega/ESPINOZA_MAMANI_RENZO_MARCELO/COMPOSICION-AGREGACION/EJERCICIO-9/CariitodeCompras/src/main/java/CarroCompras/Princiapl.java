/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarroCompras;

/**
 *
 * @author Renzo
 */
public class Princiapl {
     public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto("Laptop", 1200.50);
        Producto p2 = new Producto("Mouse", 25.99);
        Producto p3 = new Producto("Teclado", 45.00);
        Producto p4 = new Producto("Monitor", 150.75);
        Producto p5 = new Producto("Audífonos", 35.00);
        Producto p6 = new Producto("USB", 10.00);
        Producto p7 = new Producto("Disco Duro", 85.00);
        Producto p8 = new Producto("Silla Gamer", 220.00);
        Producto p9 = new Producto("Cámara Web", 50.00);
        Producto p10 = new Producto("Micrófono", 70.00);
        Producto p11 = new Producto("Tablet", 300.00); // Excede el límite

        // Crear carrito de compras
        CarritoCompras carrito = new CarritoCompras();

        // Agregar productos
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);
        carrito.agregarProducto(p4);
        carrito.agregarProducto(p5);
        carrito.agregarProducto(p6);
        carrito.agregarProducto(p7);
        carrito.agregarProducto(p8);
        carrito.agregarProducto(p9);
        carrito.agregarProducto(p10);

        // Intentar agregar un producto extra
        carrito.agregarProducto(p11);

        // Mostrar carrito
        carrito.mostrarCarrito();
    }
}
