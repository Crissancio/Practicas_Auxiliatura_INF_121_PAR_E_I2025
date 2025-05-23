/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Fabricio
 * 9. Crea un POO para un carrito de compras y sus productos. El carrito contiene
productos, pero los productos pueden existir independientemente del carrito.
Además, el carrito no puede contener más de 10 productos.
Producto<nombre, precio>
Métodos: mostrar_info() (muestra el nombre y el precio del producto)
CarritoCompras<productos (lista de objetos de tipo Producto)>
Métodos: agregar_producto(producto), mostrar_carrito() (muestra la
información de todos los productos en el carrito)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea un carrito de compras y agrega varios productos, validando que no
se exceda el límite de 10 productos.
c) Muestra la información del carrito y sus productos.
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();
        carrito.agregar_producto(new Producto("Pan", 1.5));
        carrito.agregar_producto(new Producto("Leche", 3.0));
        carrito.agregar_producto(new Producto("Queso", 7.5));

        carrito.mostrar_carrito();
    }
}
        