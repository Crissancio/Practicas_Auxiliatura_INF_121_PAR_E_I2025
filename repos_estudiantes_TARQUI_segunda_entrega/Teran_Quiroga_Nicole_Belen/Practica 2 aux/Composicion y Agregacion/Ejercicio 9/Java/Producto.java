import java.util.ArrayList;
class Producto {
    public String nombre;
    public double precio;
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public void mostrar() {
        System.out.println("Producto: " + nombre + ", Precio: BOB" + precio);
    }
}
class CarritoCompras {
    public ArrayList<Producto> productos;
    public CarritoCompras() {
        productos = new ArrayList<>();
    }
    public void agrega(Producto p) {
        if (productos.size() < 10) {
            productos.add(p);
        } else {
            System.out.println("No se pueden agregar más productos. Límite 10 alcanzado.");
        }
    }
    public void mostrar() {
        System.out.println("Carrito de compras:");
        for (Producto p : productos) {
            p.mostrar();
        }
    }
}
public class Ej9 {
    public static void main(String[] args) {
        CarritoCompras c = new CarritoCompras();
        c.agrega(new Producto("Leche", 1.5));
        c.agrega(new Producto("Pan", 0.8));
        c.agrega(new Producto("Queso", 2.5));
        c.mostrar();
    }
}