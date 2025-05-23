package Ejercicio1;

public class Habitacion {
    public String nombre;
    public double tamano;
    // a) Implementa las clases con sus constructores, getters y setters
    public Habitacion(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

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

    public void mostrarInfo() {
        System.out.println("Habitacion: " + nombre + ", Medida: " + tamano + " m(Cuadrados)");
    }
}
