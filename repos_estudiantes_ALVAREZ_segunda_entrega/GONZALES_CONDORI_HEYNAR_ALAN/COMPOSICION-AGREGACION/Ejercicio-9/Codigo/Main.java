/*
Crea un POO para un carrito de compras y sus productos. El carrito contiene
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
package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        // Crear productos independientes
        Producto p1 = new Producto("Leche", 1.20);
        Producto p2 = new Producto("Pan", 0.80);
        Producto p3 = new Producto("Huevos", 2.50);
        Producto p4 = new Producto("Queso", 3.00);
        Producto p5 = new Producto("Café", 4.20);
        Producto p6 = new Producto("Arroz", 2.00);
        Producto p7 = new Producto("Frijoles", 1.80);
        Producto p8 = new Producto("Jugo", 1.50);
        Producto p9 = new Producto("Azúcar", 1.10);
        Producto p10 = new Producto("Sal", 0.60);
        Producto p11 = new Producto("Harina", 1.90); // Producto extra para probar límite

        // Crear el carrito de compras
        CarritoCompras carrito = new CarritoCompras();

        // Agregar productos al carrito
        carrito.agregar_producto(p1);
        carrito.agregar_producto(p2);
        carrito.agregar_producto(p3);
        carrito.agregar_producto(p4);
        carrito.agregar_producto(p5);
        carrito.agregar_producto(p6);
        carrito.agregar_producto(p7);
        carrito.agregar_producto(p8);
        carrito.agregar_producto(p9);
        carrito.agregar_producto(p10);
        carrito.agregar_producto(p11); // Este no se agregará

        // Mostrar contenido del carrito
        System.out.println();
        carrito.mostrar_carrito();
    }
}
