package Ejercicio1;

public class Habitacion {
    private String nombre;
    private int tamaño;

    public Habitacion(String n, int t) {
        this.nombre = n;
        this.tamaño = t;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setTamaño(int t) {
        this.tamaño = t;
    }

    public void mostrar_info() {
        System.out.println("Habitación: " + this.nombre + ", Tamaño: " + this.tamaño + " m²");
    }
}