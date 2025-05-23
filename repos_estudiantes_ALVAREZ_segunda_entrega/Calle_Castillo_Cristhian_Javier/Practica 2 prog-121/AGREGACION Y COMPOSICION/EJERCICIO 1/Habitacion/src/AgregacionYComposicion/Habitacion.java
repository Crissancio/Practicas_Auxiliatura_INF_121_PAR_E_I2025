package AgregacionYComposicion;

public class Habitacion {
    private String nombre;
    private double tamaño; 

    // Constructor
    public Habitacion(String nombre, double tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public void mostrarInfo() {
        System.out.println("Habitación: " + nombre + ", Tamaño: " + tamaño + " m²");
    }
}

