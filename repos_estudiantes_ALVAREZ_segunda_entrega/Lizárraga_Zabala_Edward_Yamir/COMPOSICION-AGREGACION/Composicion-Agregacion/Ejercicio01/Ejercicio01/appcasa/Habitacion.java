
package appcasa;

public class Habitacion {
    private String nombre;
    private double tamaño;

    public Habitacion(String nombre, double tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public void mostrarInfo() {
        System.out.println("Habitacion: " + nombre + " - Tamanio: " + tamaño + " metro cuadrado");
    }
}

