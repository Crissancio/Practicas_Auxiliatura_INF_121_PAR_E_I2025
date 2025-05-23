/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarroCompras;
import java.util.ArrayList;
/**
 *
 * @author Renzo
 */
public class CarritoCompras {
    private ArrayList<Producto> productos;
    private final int LIMITE = 10;

    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public boolean agregarProducto(Producto producto) {
        if (productos.size() < LIMITE) {
            productos.add(producto);
            return true;
        } else {
            System.out.println("No se puede agregar más de 10 productos al carrito.");
            return false;
        }
    }

    public void mostrarCarrito() {
        System.out.println("Carrito de Compras:");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
        System.out.println("Total de productos: " + productos.size());
    }
}
