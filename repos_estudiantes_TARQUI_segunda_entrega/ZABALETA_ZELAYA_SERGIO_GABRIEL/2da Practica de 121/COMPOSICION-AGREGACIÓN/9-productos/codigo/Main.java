import java.util.ArrayList;
import java.util.List;

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public void mostrarInfo() {
        System.out.printf("  - %s | Precio: $%.2f%n", nombre, precio);
    }
}

class CarritoCompras {
    private List<Producto> productos;
    public static final int MAX_PRODUCTOS = 10;

    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    public boolean agregarProducto(Producto producto) {
        if (productos.size() < MAX_PRODUCTOS) {
            productos.add(producto);
            return true;
        } else {
            System.out.println(" El carrito esta lleno (limite: 10 productos)");
            return false;
        }
    }

    public void mostrarCarrito() {
        System.out.println("\n Contenido del Carrito:");
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
        System.out.printf("Total: %d/%d productos%n", productos.size(), MAX_PRODUCTOS);
    }
}

public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        // Agregar productos
        carrito.agregarProducto(new Producto("Laptop", 1200.50));
        carrito.agregarProducto(new Producto("Mouse", 25.99));
        carrito.agregarProducto(new Producto("Teclado", 45.75));

        // Intentar exceder el límite
        for (int i = 0; i < 8; i++) {
            carrito.agregarProducto(new Producto("Producto " + (i + 4), 10.99));
        }

        // Mostrar contenido
        carrito.mostrarCarrito();
    }
}