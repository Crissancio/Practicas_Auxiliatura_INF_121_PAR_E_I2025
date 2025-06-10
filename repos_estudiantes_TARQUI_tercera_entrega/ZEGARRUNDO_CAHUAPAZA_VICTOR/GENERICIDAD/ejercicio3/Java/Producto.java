package ejercicio3;

public class Producto {
    private String codigo;
    private double precio;

    public Producto(String codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public String toString() {
        return "Producto: " + codigo + " - $" + precio;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Producto)) return false;
        Producto otro = (Producto) obj;
        return this.codigo.equals(otro.codigo) && this.precio == otro.precio;
    }
    
    public int hashCode() {
        return codigo.hashCode();
    }
}