//5. Crea un POO para un carrito de compras y sus productos. El carrito contiene productos, pero los productos pueden existir independientemente del carrito. Además, el carrito no puede contener más de 10 productos.
//a) Implementa las clases con sus constructores, getters y setters.

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private List<Producto> productos;

    CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return this.productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void agregar_producto(Producto producto) {
        if (productos.size() > 10) {
            System.out.println("Carrito lleno");
        } else {
            productos.add(producto);
        }

    }

    public void mostrar_carrito() {
        for (int i = 0; i < productos.size(); i++) {
            Producto prod = productos.get(i);
            prod.mostrar_info();
        }
    }
}
