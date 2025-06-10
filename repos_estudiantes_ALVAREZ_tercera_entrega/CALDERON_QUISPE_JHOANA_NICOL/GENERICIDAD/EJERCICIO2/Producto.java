package EJERCICIO2;

public class Producto {
    String nombre;
    int codigo;

    public Producto(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + "', codigo=" + codigo + "";
    }
}
