import java.util.ArrayList;
import java.util.List;

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
        System.out.println("Producto: " + nombre + ", Precio: $" + precio);
    }
}

class CarritoCompras {
    private List<Producto> productos;

    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarCarrito() {
        System.out.println("Productos en el carrito:");
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }
}

public class Aplicacion {
    public static void main(String[] args) {
        Producto producto8 = new Producto("Coca Cola", 10);
        Producto producto9 = new Producto("Pollo", 29);
        Producto producto10 = new Producto("Cordero", 45);
        // Producto producto11 = new Producto("Taza", 80);

        CarritoCompras carro1 = new CarritoCompras();

        carro1.agregarProducto(producto8);
        carro1.agregarProducto(producto9);
        carro1.agregarProducto(producto10);
        // carro1.agregarProducto(producto11);

        carro1.mostrarCarrito();
    }
}