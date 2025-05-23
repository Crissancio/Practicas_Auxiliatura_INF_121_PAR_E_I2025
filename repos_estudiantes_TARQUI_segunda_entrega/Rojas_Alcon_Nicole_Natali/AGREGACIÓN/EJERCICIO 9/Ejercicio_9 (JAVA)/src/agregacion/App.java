package agregacion;

public class App {
 public static void main(String[] args) {
     Producto prod1 = new Producto("Arroz (Quintal)", 640.50);
     Producto prod2 = new Producto("Fideo (5kg)", 59.30);
     Producto prod3 = new Producto("Aceite (4.5 litros)", 100.00);
     Producto prod4 = new Producto("Huevos (1 maple)", 33.50);
     Producto prod5 = new Producto("Harina (1@)", 120.80);
     Producto prod6 = new Producto("Detergente (600 gr.)", 45.99);
     Producto prod7 = new Producto("Dentrifico", 39.70);
     Producto prod8 = new Producto("Shampo", 60.25);
     Producto prod9 = new Producto("Leche (1 litro)", 7.50);
     Producto prod10 = new Producto("Papel Higiénico", 30.99);

     CarritoCompras carrito = new CarritoCompras();

     carrito.agregarProducto(prod1);
     carrito.agregarProducto(prod2);
     carrito.agregarProducto(prod3);
     carrito.agregarProducto(prod4);
     carrito.agregarProducto(prod5);
     carrito.agregarProducto(prod6);
     carrito.agregarProducto(prod7);
     carrito.agregarProducto(prod8);
     carrito.agregarProducto(prod9);
     carrito.agregarProducto(prod10);

     carrito.mostrarCarrito();
 }
}
