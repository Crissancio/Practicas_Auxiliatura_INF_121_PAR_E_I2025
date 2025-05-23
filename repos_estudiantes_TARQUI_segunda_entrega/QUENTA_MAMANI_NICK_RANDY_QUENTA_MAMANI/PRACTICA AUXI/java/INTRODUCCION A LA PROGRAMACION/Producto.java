// NOMBRE: QUENTA MAMANI NICK RANDY
//CI: 10037571

//4. Crea una clase Producto con nombre, y precio
//a) Agrega un método para aplicar un descuento del 10% si su precio es par, caso
//contrario del 15%
//b) Crea tres productos, aplica descuentos y muestra los precios
//c) Crea cuatro productos, aplica descuentos y muestra la suma de sus precios

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void aplicarDescuento() {
        if (precio % 2 == 0) {
            precio *= 0.90;
        } else {
            precio *= 0.85;
        }
    }

    public String mostrarPrecio() {
        return nombre + " tiene un precio de: " + String.format("%.2f", precio);
    }

    public static void main(String[] args) {

        System.out.println("Primera parte: Tres productos");
        Producto producto1 = new Producto("Producto 1", 500);
        Producto producto2 = new Producto("Producto 2", 56);
        Producto producto3 = new Producto("Producto 3", 68);

        Producto[] productosTres = {producto1, producto2, producto3};
        for (Producto producto : productosTres) {
            producto.aplicarDescuento();
            System.out.println(producto.mostrarPrecio());
        }

        System.out.println("Segunda parte: Cuatro productos");
        Producto producto4 = new Producto("Producto 1", 100);
        Producto producto5 = new Producto("Producto 2", 200);
        Producto producto6 = new Producto("Producto 3", 96);
        Producto producto7 = new Producto("Producto 4", 5);

        Producto[] productosCuatro = {producto4, producto5, producto6, producto7};
        double sumaTotal = 0;
        for (Producto producto : productosCuatro) {
            producto.aplicarDescuento();
            System.out.println(producto.mostrarPrecio());
            sumaTotal += producto.precio;
        }

        System.out.printf("suma total después del descuentos es: %.2f%n", sumaTotal);
    }
}
