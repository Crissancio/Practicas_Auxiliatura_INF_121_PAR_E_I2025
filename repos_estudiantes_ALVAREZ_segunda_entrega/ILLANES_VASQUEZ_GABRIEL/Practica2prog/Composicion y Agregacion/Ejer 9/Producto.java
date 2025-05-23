package Agr9;

public class Producto {
    private String nombre;
    private double precio;

    public Producto() {
        
        this.nombre = "Producto sin nombre";
        this.precio = 0.0;
    }

    public Producto(String nom, double pre) {
        this.nombre = nom;
        this.precio = pre;
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
        System.out.println("Nombre: " + nombre + "  Precio: " + precio);
    }
}
