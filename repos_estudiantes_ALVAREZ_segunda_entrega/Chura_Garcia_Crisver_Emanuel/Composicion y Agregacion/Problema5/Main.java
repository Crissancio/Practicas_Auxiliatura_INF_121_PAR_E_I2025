public class Main {
    public static void main(String[] args) {
        // b) Crea un carrito de compras y agrega varios productos, validando que no se
        // exceda el límite de 10 productos.
        CarritoCompras carrito = new CarritoCompras();
        carrito.agregar_producto(new Producto("Sardinas", 20.56f));
        carrito.agregar_producto(new Producto("Tomates", 15.26f));
        carrito.agregar_producto(new Producto("Refrescos", 15.00f));
        carrito.agregar_producto(new Producto("Oreo", 12.89f));
        carrito.agregar_producto(new Producto("Papas", 5.0f));
        carrito.agregar_producto(new Producto("Leche", 7.00f));
        carrito.agregar_producto(new Producto("Fideo", 20.00f));
        carrito.agregar_producto(new Producto("Arroz", 32.45f));
        carrito.agregar_producto(new Producto("Aceite", 20.00f));
        carrito.agregar_producto(new Producto("Lavandina", 5.26f));
        carrito.agregar_producto(new Producto("Papel higienico", 1.5f));
        System.out.println("c) Muestra la información del carrito y sus productos.");
        carrito.mostrar_carrito();
    }
}
