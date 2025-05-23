
import java.util.ArrayList;
import java.util.List;

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String mostrarInfo() {
        return String.format("Producto: %s, Precio: $%.2f", nombre, precio);
    }
}

class CarritoCompras {
    private List<Producto> productos;
    private static final int MAX_PRODUCTOS = 10;

    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (productos.size() < MAX_PRODUCTOS) {
            productos.add(producto);
            System.out.println("Producto " + producto.mostrarInfo() + " agregado al carrito");
        } else {
            System.out.println("El carrito no puede tener más de " + MAX_PRODUCTOS + " productos");
        }
    }

    public void mostrarCarrito() {
        System.out.println("Carrito de Compras:");
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío");
        } else {
            for (Producto producto : productos) {
                System.out.println("- " + producto.mostrarInfo());
            }
            double total = productos.stream().mapToDouble(p -> p.precio).sum();
            System.out.printf("Total: $%.2f%n", total);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Producto prod1 = new Producto("Laptop", 1200.50);
        Producto prod2 = new Producto("Mouse", 25.99);
        Producto prod3 = new Producto("Teclado", 45.75);

        CarritoCompras carrito = new CarritoCompras();
        carrito.agregarProducto(prod1);
        carrito.agregarProducto(prod2);
        carrito.agregarProducto(prod3);
        carrito.mostrarCarrito();

        System.out.println("\nProducto independiente:");
        System.out.println(prod2.mostrarInfo());
    }
}