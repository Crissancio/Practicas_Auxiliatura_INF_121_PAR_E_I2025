
package ejercicio9;


import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private List<Producto> productos;

    public CarritoCompras() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (productos.size() < 10) {
            productos.add(producto);
        } else {
            System.out.println("No se pueden agregar más de 10 productos.");
        }
    }

    public void mostrarCarrito() {
        System.out.println("Carrito de Compras:");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
}

