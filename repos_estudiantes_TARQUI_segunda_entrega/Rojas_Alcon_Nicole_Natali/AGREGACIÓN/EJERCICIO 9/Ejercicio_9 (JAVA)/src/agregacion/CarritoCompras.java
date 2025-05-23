package agregacion;

import java.util.ArrayList;

public class CarritoCompras {
	 private ArrayList<Producto> productos;
	
	 public CarritoCompras() {
	     productos = new ArrayList<>();
	 }
	
	 public void agregarProducto(Producto producto) {
	     if (productos.size() < 10) {
	         productos.add(producto);
	     } else {
	         System.out.println("No se pueden agregar más productos al carrito.");
	     }
	 }
	
	 public void mostrarCarrito() {
	     System.out.println("Carrito de Compras:");
	     System.out.println("==============================");
	     for (Producto p : productos) {
	         System.out.println(p);
	         System.out.println("==============================");
	     }
	 }
}
