package Ejercicio3;

public class Producto {
    private String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Producto: " + nombre;
    }

    public boolean equals(Object o) {
        if (o instanceof Producto) {
            return nombre.equals(((Producto) o).nombre);
        }
        return false;
    }
}
