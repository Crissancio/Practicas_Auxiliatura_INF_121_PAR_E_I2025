/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author Usuario
 */
import java.util.*;

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrar_info() {
        System.out.println("Producto: " + nombre + ", Precio: Bs " + precio);
    }
}

class CarritoCompras {
    private List<Producto> productos;

    public CarritoCompras() {
        productos = new ArrayList<>();
    }

    public void agregar_producto(Producto p) {
        if (productos.size() < 10) {
            productos.add(p);
        } else {
            System.out.println("El carrito ya tiene 10 productos. No se puede agregar más.");
        }
    }

    public void mostrar_carrito() {
        System.out.println("Carrito de Compras:");
        for (Producto p : productos) {
            p.mostrar_info();
        }
    }
}
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CarritoCompras carrito = new CarritoCompras();
        for (int i = 1; i <= 11; i++) {
            carrito.agregar_producto(new Producto("Producto" + i, i * 10));
        }
        carrito.mostrar_carrito();
    }
    
}
