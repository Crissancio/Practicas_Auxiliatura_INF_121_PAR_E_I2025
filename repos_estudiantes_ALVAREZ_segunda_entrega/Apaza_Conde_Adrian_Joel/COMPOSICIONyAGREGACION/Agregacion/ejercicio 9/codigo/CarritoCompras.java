// a)
import java.util.ArrayList;

public class CarritoCompras {
    private ArrayList<Producto> productos;
    private static final int n = 10;
    
    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }
    public boolean agregar_producto(Producto p) {
        if (productos.size() < n) {
            productos.add(p);
            return true;
        } else {
            System.out.println("carrito lleno solo se puede colocar " + n + " productos");
            return false;
        }
    }
    public void mostrar_carrito() {
        System.out.println("carrito con productos:");
        System.out.println("Productos [ "+productos.size()+ " de " +n+ "]:");
        if (productos.isEmpty()) {
            System.out.println("carrito vacio");
        } else {
            double s = 0;
            for (Producto a : productos) {
                a.mostrar_info();
                s = s + a.getPrecio();
            }
            System.out.println("Total: " +s+"bs");
        }
    }
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public int getCantidadProductos() {
        return productos.size();
    }
}