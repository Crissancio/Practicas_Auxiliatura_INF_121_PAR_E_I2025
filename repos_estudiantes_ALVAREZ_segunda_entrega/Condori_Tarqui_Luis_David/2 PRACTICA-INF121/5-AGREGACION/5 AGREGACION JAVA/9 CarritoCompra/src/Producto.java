// TEMA: AGREGACIÓN
// Enunciado:
// 9. Crea un POO para un carrito de compras y sus productos. El carrito contiene productos,
// pero los productos pueden existir independientemente del carrito.
// Además, el carrito no puede contener más de 10 productos.
//
// Producto<nombre, precio>
// Métodos: mostrar_info() (muestra el nombre y el precio del producto)
//
// CarritoCompras<productos (lista de objetos de tipo Producto)>
// Métodos: agregar_producto(producto), mostrar_carrito() (muestra la información de todos los productos en el carrito)
//
// Incisos:
// a. Implementa las clases con sus constructores, getters y setters.
// b. Crea un carrito de compras y agrega varios productos, validando que no se exceda el límite de 10 productos.
// c. Muestra la información del carrito y sus productos.


public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.printf("Producto: %s, Precio: $%.2f%n", nombre, precio);
    }
}



