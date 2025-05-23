public class Main {
  public static void main(String[] args) {
    CarritoDeCompras carrito = new CarritoDeCompras();
    Producto producto1 = new Producto("Laptop", 999.99);
    Producto producto2 = new Producto("Smartphone", 499.99);
    Producto producto3 = new Producto("Tablet", 299.99);
    Producto producto4 = new Producto("Auriculares", 99.99);
    Producto producto5 = new Producto("Teclado", 49.99);
    Producto producto6 = new Producto("Mouse", 29.99);
    Producto producto7 = new Producto("Monitor", 199.99);
    Producto producto8 = new Producto("Impresora", 149.99);
    Producto producto9 = new Producto("Router", 79.99);
    Producto producto10 = new Producto("Cámara", 249.99);

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
    carrito.agregarProducto(new Producto("Disco Duro", 59.99));

    System.out.println();
    carrito.mostrarProductos();
  }
}