package COMPOSICION_AGREGACION.EJERCICIO_9;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private List<Producto> productos;
    private static final int MAX_PRODUCTOS = 10;

    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (productos.size() < MAX_PRODUCTOS) {
            productos.add(producto);
        } else {
            System.out.println("\nNo se puede agregar más productos, el carrito está lleno.");
        }
    }

    public void mostrarCarrito() {
        System.out.println("\nCarrito de Compras:");
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }
}
