package Composicion9;

public class CarritoCompras {
    private Producto[] productos;
    private int cantidad;

    public CarritoCompras() {
        this.productos = new Producto[10];
        this.cantidad = 0;
    }

    public void agregarProducto(Producto producto) {
        if (cantidad < 10) {
            productos[cantidad] = producto;
            cantidad++;
        } else {
            System.out.println("No se pueden agregar más de 10 productos al carrito.");
        }
    }

    public void mostrarCarrito() {
        System.out.println("Carrito de Compras:");
        for (int i = 0; i < cantidad; i++) {
            productos[i].mostrarInfo();
        }
    }
}