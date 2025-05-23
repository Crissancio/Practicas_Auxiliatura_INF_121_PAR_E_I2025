public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("Pan", 1.50);
        Producto p2 = new Producto("Leche", 2.00);
        Producto p3 = new Producto("Huevo", 3.20);
        Producto p4 = new Producto("Queso", 4.50);
        Producto p5 = new Producto("Jugo", 2.80);
        Producto p6 = new Producto("Manzana", 3.00);
        Producto p7 = new Producto("Cereal", 5.10);
        Producto p8 = new Producto("Yogurt", 1.90);
        Producto p9 = new Producto("Pollo", 6.70);
        Producto p10 = new Producto("Papel higenico", 4.00);
        Producto p11 = new Producto("Galletas", 2.50);

        CarritoCompras carrito = new CarritoCompras();
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);
        carrito.agregarProducto(p4);
        carrito.agregarProducto(p5);
        carrito.agregarProducto(p6);
        carrito.agregarProducto(p7);
        carrito.agregarProducto(p8);
        carrito.agregarProducto(p9);
        carrito.agregarProducto(p10);
        carrito.agregarProducto(p11); 

        carrito.mostrarCarrito();
    }
}
