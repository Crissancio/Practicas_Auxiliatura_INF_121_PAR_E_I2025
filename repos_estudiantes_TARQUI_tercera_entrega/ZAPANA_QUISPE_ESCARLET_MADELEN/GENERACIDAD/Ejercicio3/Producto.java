public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Producto)) return false;
        Producto otro = (Producto) obj;
        return nombre.equals(otro.nombre) && precio == otro.precio;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " - $" + precio;
    }
}
