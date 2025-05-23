package Ejercicio9;

import java.util.ArrayList;

public class CarritoCompras {
    private ArrayList<Producto> productos;
    private static final int LIMITE = 10;

    public CarritoCompras() {
        productos = new ArrayList<>();
    }

    public void agregar_producto(Producto producto) {
        if (productos.size() < LIMITE) {
            productos.add(producto);
            System.out.println("Producto agregado: " + producto.getNombre());
        } else {
            System.out.println("No se puede agregar mas productos. Limite alcanzado.");
        }
    }

    public void mostrar_carrito() {
        System.out.println("Carrito de Compras:");
        for (Producto p : productos) {
            p.mostrar_info();
        }
    }
}
