package Ejercicio2;

import java.util.ArrayList;

public class CarritoApp {

    static class Producto {
        private String nombre;
        private double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        public double getPrecio() { return precio; }
        public void setPrecio(double precio) { this.precio = precio; }

        public String mostrarInfo() {
            return nombre + " -bs" + precio;
        }
    }

    static class CarritoCompras {
        private ArrayList<Producto> productos;

        public CarritoCompras() {
            productos = new ArrayList<>();
        }

        public void agregarProducto(Producto producto) {
            if (productos.size() < 10) {
                productos.add(producto);
            } else {
                System.out.println("No se puede agregar más de 10 productos.");
            }
        }

        public void mostrarCarrito() {
            System.out.println(" Carrito de Compras:");
            for (Producto p : productos) {
                System.out.println("  " + p.mostrarInfo());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Noemí Chino Blanco\n");

        CarritoCompras carrito = new CarritoCompras();

        Producto p1 = new Producto("Pan", 3);
        Producto p2 = new Producto("Leche", 3.0);
        Producto p3 = new Producto("Huevos", 4.2);

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

        carrito.mostrarCarrito();
    }
}
