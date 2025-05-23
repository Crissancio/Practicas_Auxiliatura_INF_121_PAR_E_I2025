package A_2;

import java.util.ArrayList;

public class CarritoCompras {
    private ArrayList<Producto> productos;
    private static final int MAX_PRODUCTOS = 10;

    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (productos.size() < MAX_PRODUCTOS) {
            productos.add(producto);
        } else {
            System.out.println("No se puede agregar más de " + MAX_PRODUCTOS + " productos al carrito.");
        }
    }

    public void mostrarCarrito() {
        System.out.println("Carrito de Compras:");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
}

