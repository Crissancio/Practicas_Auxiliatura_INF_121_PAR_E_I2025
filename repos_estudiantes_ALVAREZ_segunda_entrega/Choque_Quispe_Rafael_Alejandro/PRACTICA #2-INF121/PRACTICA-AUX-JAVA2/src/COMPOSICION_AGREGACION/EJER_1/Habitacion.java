package COMPOSICION_AGREGACION.EJER_1;
public class Habitacion {
    private String nombre;
    private double tamaño;

    public Habitacion(String nombre, double tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public void mostrarInfo() {
        System.out.println("Habitacion: " + nombre);
        System.out.println("Tamano: " + tamaño + " m2");
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getTamaño() {
        return tamaño;
    }
}