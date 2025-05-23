package COMPOSICION_AGREGACION.EJERCICIO_9;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1000.00);
        Producto producto2 = new Producto("Teléfono", 500.00);
        Producto producto3 = new Producto("Auriculares", 150.00);
        Producto producto4 = new Producto("Ratón", 30.00);
        Producto producto5 = new Producto("Teclado", 50.00);
        Producto producto6 = new Producto("Monitor", 300.00);
        Producto producto7 = new Producto("Cámara", 200.00);
        Producto producto8 = new Producto("Cargador", 20.00);
        Producto producto9 = new Producto("Funda para teléfono", 15.00);
        Producto producto10 = new Producto("Disco duro", 80.00);
        Producto producto11 = new Producto("USB", 10.00);

        CarritoCompras carrito = new CarritoCompras();
        
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);
        carrito.agregarProducto(producto4);
        carrito.agregarProducto(producto5);
        carrito.agregarProducto(producto6);
        carrito.agregarProducto(producto7);
        carrito.agregarProducto(producto8);
        carrito.agregarProducto(producto9);
        carrito.agregarProducto(producto10);

        carrito.agregarProducto(producto11);

        carrito.mostrarCarrito();
    }
}

