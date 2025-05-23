// a)
public class Producto {
    private String nombre;
    private double precio;
    
    public Producto(String n, double p) {
        this.nombre = n;
        this.precio = p;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void mostrar_info() {
        System.out.println("producto: " + nombre+", precio: " + precio+"bs ");
    }
}