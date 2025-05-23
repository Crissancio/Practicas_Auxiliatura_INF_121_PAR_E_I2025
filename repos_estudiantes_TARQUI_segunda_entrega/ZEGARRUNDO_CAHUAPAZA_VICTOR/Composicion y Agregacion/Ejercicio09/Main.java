package Composicion9;

public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        carrito.agregarProducto(new Producto("Pan", 3));
        carrito.agregarProducto(new Producto("Leche", 5));
        carrito.agregarProducto(new Producto("Queso", 10));
        carrito.agregarProducto(new Producto("Huevos", 7));
        carrito.agregarProducto(new Producto("Aceite", 12));
        carrito.agregarProducto(new Producto("Arroz", 8));
        carrito.agregarProducto(new Producto("Fideos", 6));
        carrito.agregarProducto(new Producto("Jugo", 4));
        carrito.agregarProducto(new Producto("Azúcar", 5));
        carrito.agregarProducto(new Producto("Sal", 2));
        carrito.agregarProducto(new Producto("Extra", 1));

        carrito.mostrarCarrito();
    }
}
