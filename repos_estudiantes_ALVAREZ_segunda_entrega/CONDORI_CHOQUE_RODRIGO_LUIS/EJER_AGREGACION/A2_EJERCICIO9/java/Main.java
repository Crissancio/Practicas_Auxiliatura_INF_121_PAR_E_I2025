/*9.
Crea un POO para un carrito de compras y sus productos. El carrito contiene productos, 
pero los productos pueden existir independientemente del carrito. Además, el carrito no puede contener más de 10 productos.
Producto<nombre, precio>
Métodos: mostrar_info() (muestra el nombre y el precio del producto)
CarritoCompras<productos (lista de objetos de tipo Producto)>
Métodos: agregar_producto(producto), mostrar_carrito() (muestra la información de todos los productos en el carrito)
a)
Implementa las clases con sus constructores, getters y setters.
b)
Crea un carrito de compras y agrega varios productos, validando que no se exceda el límite de 10 productos.
c)
Muestra la información del carrito y sus productos.*/

package A_2;

public class Main {

	public static void main(String[] args) {
		Producto p1 = new Producto("Manzana", 1.5);
        Producto p2 = new Producto("Pan", 0.8);
        Producto p3 = new Producto("Leche", 2.2);

        CarritoCompras carrito = new CarritoCompras();

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

        for (int i = 4; i <= 11; i++) {
            carrito.agregarProducto(new Producto("Producto " + i, i));
        }

        carrito.mostrarCarrito();
	}

}
