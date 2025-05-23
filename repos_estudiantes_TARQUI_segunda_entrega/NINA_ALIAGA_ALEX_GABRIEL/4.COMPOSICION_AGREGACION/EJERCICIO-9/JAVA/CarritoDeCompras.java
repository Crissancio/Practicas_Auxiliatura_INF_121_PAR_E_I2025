import java.util.ArrayList;


class CarritoDeCompras {
  private static int MAX_PRODUCTOS = 10;
  private ArrayList<Producto> productos = new ArrayList<>();

  public void agregarProducto(Producto producto) {
    if (productos.size() < MAX_PRODUCTOS) {
      productos.add(producto);
      System.out.println(producto.getName() + " agregado al carrito.");
    } else {
      System.out.println("El carrito está lleno. No se puede agregar más productos.");
    }
  }

  public void mostrarProductos() {
    System.out.println("Productos en el carrito:");
    if (productos.isEmpty()) {
      System.out.println("El carrito está vacío.");
      return;
    }
    for (Producto producto : productos) {
      producto.mostrarInfo();
    }
  }
}