public class App9 {
    public static void main(String[] args) throws Exception {
        Carrito carrito = new Carrito();
        carrito.agregarProducto(new Producto("Mustang", 50000));
        carrito.agregarProducto(new Producto("Camaro", 60000));
        carrito.agregarProducto(new Producto("Challenger", 70000));
        carrito.agregarProducto(new Producto("Corvette", 80000));
        carrito.agregarProducto(new Producto("Ferrari", 90000));
        carrito.agregarProducto(new Producto("Lamborghini", 100000));
        carrito.agregarProducto(new Producto("Porsche", 110000));
        carrito.agregarProducto(new Producto("Bugatti", 120000));
        carrito.agregarProducto(new Producto("McLaren", 130000));
        carrito.agregarProducto(new Producto("Aston Martin", 140000));
        // carrito.agregarProducto(new Producto("Rolls Royce", 150000));
        if(carrito.esMenos10Productos()){
            System.out.println(carrito);
    }
}
}
