package ComposicionyAgregacion.Composicion.Ej1;

public class Habitacion {
    private String nombre;
    private double tamaño;

    public Habitacion(String nombre, double tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public void mostrarInfo() {
        System.out.println("Habitación: " + nombre + " - Tamaño: " + tamaño + " m²");
    }
}
