/*
9. Crea un POO para un carrito de compras y sus productos. El carrito contiene 
productos, pero los productos pueden existir independientemente del carrito. 
Además, el carrito no puede contener más de 10 productos.
Producto<nombre, precio>
Métodos: mostrar_info() (muestra el nombre y el precio del producto)
CarritoCompras<productos (lista de objetos de tipo Producto)>
Métodos: agregar_producto(producto), mostrar_carrito() (muestra la 
información de todos los productos en el carrito)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea un carrito de compras y agrega varios productos, validando que no 
se exceda el límite de 10 productos.
c) Muestra la información del carrito y sus productos.
 */
public class Main {
    public static void main(String[] args) {
        // b) 
        CarritoCompras c = new CarritoCompras();
        // b)  
        Producto p1 = new Producto("Leche", 25.50);
        Producto p2 = new Producto("Pan", 15.75);
        Producto p3 = new Producto("Huevos", 45.00);
        Producto p4 = new Producto("Arroz", 32.90);
        Producto p5 = new Producto("Azúcar", 28.30);
        Producto p6 = new Producto("Café", 85.50);
        Producto p7 = new Producto("Galletas", 22.75);
        Producto p8 = new Producto("Jabón", 18.00);
        Producto p9 = new Producto("Pasta", 26.40);
        Producto p10 = new Producto("Atún", 34.50);
        Producto p11 = new Producto("Queso", 65.00);
        // b) 
        c.agregar_producto(p1);
        c.agregar_producto(p2);
        c.agregar_producto(p3);
        c.agregar_producto(p4);
        c.agregar_producto(p5);
        c.agregar_producto(p6);
        c.agregar_producto(p7);
        c.agregar_producto(p8);
        c.agregar_producto(p9);
        c.agregar_producto(p10);
        c.agregar_producto(p11); 
        
        // c) 
        c.mostrar_carrito();
        System.out.println("_______________________________");
        // si borramos la clase CarritoCompras y dejamos la clase Producto, no alternará nada xq son independientes 
        System.out.println("\nProducto: ");
        Producto p12 = new Producto("Chocolate CEIBO", 42.00);
        p12.mostrar_info();
    }
}