
package appcarrito;

public class AppCarrito {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        // (b) Agregar productos (más de 10 para probar el límite)
        for (int i = 1; i <= 12; i++) {
            carrito.agregarProducto(new Producto("Producto " + i, i * 10));
        }

        // (c) Mostrar carrito
        System.out.println("\n--- CONTENIDO DEL CARRITO ---");
        carrito.mostrarCarrito();
    }
}

