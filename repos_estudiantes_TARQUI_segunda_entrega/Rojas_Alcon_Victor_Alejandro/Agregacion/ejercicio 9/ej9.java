import java.util.ArrayList;

class Producto {
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

    public void mostrarInfo() {
        System.out.println(nombre + " | Precio: $" + precio);
    }
}

class CarritoCompras {
    private ArrayList<Producto> productos;

    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (productos.size() < 10) {
            productos.add(producto);
        } else {
            System.out.println("El carrito ya no puede contener más de 10 productos.");
        }
    }

    public void mostrarCarrito() {
        if (productos.size() == 0) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("\nCarrito de Compras:");
            for (Producto p : productos) {
                p.mostrarInfo();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();
        Producto p1 = new Producto("Laptop", 899.99);
        Producto p2 = new Producto("Auriculares", 49.99);
        Producto p3 = new Producto("Smartphone", 399.99);

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

        carrito.mostrarCarrito();
    }
}