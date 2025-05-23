package carrito_agregacion;

public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

     
        carrito.agregarProducto(new Producto("Aceite", 23.33));
        carrito.agregarProducto(new Producto("Coca-Cola", 3.33));
        carrito.agregarProducto(new Producto("Ace", 2.33));
        carrito.agregarProducto(new Producto("Pepsi", 23.0));
        carrito.agregarProducto(new Producto("Jabón", 2.34));
        carrito.agregarProducto(new Producto("Leche", 4.50));
        carrito.agregarProducto(new Producto("Pan", 1.25));
        carrito.agregarProducto(new Producto("Huevos", 3.99));
        carrito.agregarProducto(new Producto("Arroz", 10.0));
        carrito.agregarProducto(new Producto("Harina", 5.75));
        
       
        carrito.agregarProducto(new Producto("Chocolate", 8.99));

        
        carrito.mostrarCarrito();
    }
}
