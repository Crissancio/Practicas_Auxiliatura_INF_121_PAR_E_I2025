import java.util.ArrayList;

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String mostrar() {
        return "Producto: " + nombre + ", Precio: " + precio;
    }
}

class Factura {
    private String cliente;
    private ArrayList<Producto> productos;

    public Factura(String cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double totalFactura() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void mostrarFactura() {
        System.out.println("Factura para: " + cliente);
        for (Producto p : productos) {
            System.out.println(p.mostrar());
        }
        System.out.println("Total a pagar: " + totalFactura());
    }
}

class TestFactura {
    public static void main(String[] args) {
        Factura factura = new Factura("Juan Perez");
        factura.agregarProducto(new Producto("Mouse", 20));
        factura.agregarProducto(new Producto("Teclado", 35));
        factura.agregarProducto(new Producto("Monitor", 250));

        factura.mostrarFactura();
    }
}