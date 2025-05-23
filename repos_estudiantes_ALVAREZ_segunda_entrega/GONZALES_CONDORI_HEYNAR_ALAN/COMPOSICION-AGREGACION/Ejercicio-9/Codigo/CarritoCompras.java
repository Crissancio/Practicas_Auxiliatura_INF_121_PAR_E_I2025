
package Ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private List<Producto> productos;
    private final int LIMITE_PRODUCTOS = 10;

    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    public void agregar_producto(Producto producto) {
        if (productos.size() < LIMITE_PRODUCTOS) {
            productos.add(producto);
            System.out.println("Producto agregado: " + producto.getNombre());
        } else {
            System.out.println("No se puede agregar más de 10 productos al carrito.");
        }
    }

    public void mostrar_carrito() {
        System.out.println("Carrito de Compras:");
        for (Producto p : productos) {
            p.mostrar_info();
        }
        System.out.println("Total de productos: " + productos.size());
    }

    // Getter
    public List<Producto> getProductos() {
        return productos;
    }
}
