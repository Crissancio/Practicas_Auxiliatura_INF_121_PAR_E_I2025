package ComposicionAgregacion.Ejer9.codigo;

public class CarritoCompras {
    public Producto[ ] productos;

    public CarritoCompras(Producto[ ] productos){
        this.productos = productos;

    }
    public Producto[] getProductos() {
        return productos;
    }
    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    public void agregar_producto(Producto producto) {
    boolean agregado = false;
    for (int i = 0; i < productos.length; i++) {
        if (productos[i] == null) {
            productos[i] = new Producto(producto.getNombre(), producto.getPrecio());
            System.out.println(" + Producto agregado: " + producto.getNombre());
            agregado = true;
            break;
        }
    }
    if (!agregado) {
        System.out.println(" - No se puede agregar más productos. El carrito está lleno.");
    }
}

    public void mostrar_carrito() {
        System.out.println("Lista de productos:");
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                productos[i].mostrar_info();
            }
        }

    }
    
}
