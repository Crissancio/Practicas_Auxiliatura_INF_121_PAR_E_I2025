package carrito_agregacion;

import java.util.ArrayList;

public class CarritoCompras {
    private ArrayList<Producto> productos;
    private final int LIMITE = 10;

    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() { return productos; }
    public void setProductos(ArrayList<Producto> productos) { this.productos = productos; }

    public void agregarProducto(Producto producto) {
        if (productos.size() < LIMITE) {
            productos.add(producto);
            System.out.println("✅ Producto agregado: " + producto.getNombre());
        } else {
            System.out.println("❌ No se puede agregar más productos, se alcanzó el límite de " + LIMITE);
        }
    }

    public void mostrarCarrito() {
        System.out.println("\n🛒 Carrito de compras:");
        
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
            return;
        }

        System.out.println("-------------------------------------------");

        for (Producto prod : productos) {
            prod.mostrarInfo();
        }

        System.out.println("-------------------------------------------");
        System.out.println("Total de productos en el carrito: " + productos.size());
    }
}

