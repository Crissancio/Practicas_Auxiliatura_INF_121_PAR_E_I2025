
package ejercicio9;


public class Ejercicio9 {

    public static void main(String[] args) {
         CarritoCompras carrito = new CarritoCompras();

        carrito.agregarProducto(new Producto("Laptop", 999.99));
        carrito.agregarProducto(new Producto("Mouse", 25.50));
        carrito.agregarProducto(new Producto("Teclado", 45.00));
     

        carrito.mostrarCarrito();
    }
    
}
