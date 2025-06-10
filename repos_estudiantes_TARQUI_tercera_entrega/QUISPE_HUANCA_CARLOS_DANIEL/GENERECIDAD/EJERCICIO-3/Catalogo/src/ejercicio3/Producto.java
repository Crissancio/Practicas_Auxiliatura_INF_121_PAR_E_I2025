package ejercicio3;

public class Producto {
    private String nombre;
    private double precio;
    private String mantenimiento;

    public Producto(String nombre, double precio, String mantenimiento) {
        this.nombre = nombre;
        this.precio = precio;
        this.mantenimiento = mantenimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMantenimiento() {
        return mantenimiento;
    }

    @Override
    public String toString() {
        return String.format("Producto: %s - $%.2f (Mantenimiento: %s)", 
                           nombre, precio, mantenimiento);
    }
}