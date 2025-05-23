
package appcarrito;

import java.util.ArrayList;

public class CarritoCompras {
    private ArrayList<Producto> productos;

    public CarritoCompras() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        // (b) Validar límite de 10 productos
        if (productos.size() < 10) {
            productos.add(producto);
        } else {
            System.out.println("No se pueden agregar mas de 10 productos al carrito.");
        }
    }

    public void mostrarCarrito() {
        System.out.println("Carrito de Compras:");
        for (Producto p : productos) {
            System.out.println("- " + p.mostrarInfo());
        }
    }
}
