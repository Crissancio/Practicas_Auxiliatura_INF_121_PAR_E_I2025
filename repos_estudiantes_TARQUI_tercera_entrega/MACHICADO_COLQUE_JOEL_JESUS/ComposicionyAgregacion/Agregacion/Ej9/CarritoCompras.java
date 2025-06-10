package ComposicionyAgregacion.Agregacion.Ej9;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private List<Producto> productos;
    private final int LIMITE = 10;

    // Constructor
    public CarritoCompras() {
        productos = new ArrayList<>();
    }

    // Método para agregar producto con validación de límite
    public void agregar_producto(Producto producto) {
        if (productos.size() < LIMITE) {
            productos.add(producto);
            System.out.println("Producto agregado: " + producto.getNombre());
        } else {
            System.out.println("No se puede agregar más de " + LIMITE + " productos.");
        }
    }

    // Mostrar la información del carrito
    public void mostrar_carrito() {
        System.out.println("=== Carrito de Compras ===");
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            for (Producto p : productos) {
                p.mostrar_info();
            }
        }
    }

    // Getter del total de productos
    public int getCantidadProductos() {
        return productos.size();
    }
}
