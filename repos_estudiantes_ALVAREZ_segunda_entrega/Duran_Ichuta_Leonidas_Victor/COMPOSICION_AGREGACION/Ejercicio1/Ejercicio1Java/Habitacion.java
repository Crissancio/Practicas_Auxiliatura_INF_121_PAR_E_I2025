package main;

public class Habitacion {
     private String nombre;
    private double tamano;

    public Habitacion(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public void mostrarInfo() {
        System.out.println("Habitacion: " + nombre);
        System.out.println("Tamano: " + tamano + " m²");
        System.out.println("-------------------");
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamaño(double tamaño) {
        this.tamano = tamano;
    }
}
