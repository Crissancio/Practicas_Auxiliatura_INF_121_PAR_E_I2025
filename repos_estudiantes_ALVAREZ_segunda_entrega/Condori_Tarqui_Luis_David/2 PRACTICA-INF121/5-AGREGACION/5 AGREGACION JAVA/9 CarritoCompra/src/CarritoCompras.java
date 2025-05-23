import java.util.ArrayList;

public class CarritoCompras {
    private ArrayList<Producto> productos;

    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (productos.size() < 10) {
            productos.add(producto);
        } else {
            System.out.println("No se pueden agregar más de 10 productos al carrito");
        }
    }

    public void mostrarCarrito() {
        System.out.println("Carrito de Compras:");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
}