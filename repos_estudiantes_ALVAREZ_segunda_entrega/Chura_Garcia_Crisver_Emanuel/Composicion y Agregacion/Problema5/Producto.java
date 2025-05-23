//5. Crea un POO para un carrito de compras y sus productos. El carrito contiene productos, pero los productos pueden existir independientemente del carrito. Además, el carrito no puede contener más de 10 productos.
//a) Implementa las clases con sus constructores, getters y setters.
public class Producto {
    private String nombre;
    private float precio;

    Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void mostrar_info() {
        System.out.println("Producto: " + getNombre() + " precio: " + getPrecio());
    }

}