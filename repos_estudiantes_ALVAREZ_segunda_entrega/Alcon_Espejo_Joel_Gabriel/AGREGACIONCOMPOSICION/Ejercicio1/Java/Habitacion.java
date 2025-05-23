import java.util.ArrayList;
import java.util.List;

class Habitacion {
    private String nombre;
    private double tamano; // en metros cuadrados

    // Constructor por defecto
    public Habitacion() {
        this.nombre = "Sin nombre";
        this.tamano = 0;
    }

    // Constructor con parámetros
    public Habitacion(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
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

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Habitación: " + nombre);
        System.out.println("Tamaño: " + tamano + " m²");
    }
}