package ComposicionAgregacion.Ejer9.codigo;

public class Main {

    public static void main(String[] args) {
        Producto[] productos = new Producto[10];
        CarritoCompras carrito = new CarritoCompras(productos);
        
        Producto producto1 = new Producto("Leche", 1200.00);
        Producto producto2 = new Producto("Harina", 800.00);
        Producto producto3 = new Producto("Huevos", 400.00);
        Producto producto4 = new Producto("Arroz", 2000.00);
        Producto producto5 = new Producto("Aceite", 1500.00);
        Producto producto6 = new Producto("Sal", 500.00);
        Producto producto7 = new Producto("Azucar", 600.00);
        Producto producto8 = new Producto("Cafe", 3000.00);
        Producto producto9 = new Producto("Te", 2500.00);
        Producto producto10 = new Producto("Galletas", 1200.00);
        Producto producto11 = new Producto("Pan", 1000.00);
        
        carrito.agregar_producto(producto1);
        carrito.agregar_producto(producto2);
        carrito.agregar_producto(producto3);
        carrito.agregar_producto(producto4);
        carrito.agregar_producto(producto5);
        carrito.agregar_producto(producto6);
        carrito.agregar_producto(producto7);
        carrito.agregar_producto(producto8);
        carrito.agregar_producto(producto9);
        carrito.agregar_producto(producto10);
        carrito.agregar_producto(producto11);

        carrito.mostrar_carrito();


        
        
    }
    
}
