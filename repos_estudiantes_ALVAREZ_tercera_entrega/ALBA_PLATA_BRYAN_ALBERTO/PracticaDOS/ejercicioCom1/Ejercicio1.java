import java.util.*;
class Habitacion {
    private String nombre;
    private double tamano;

    public Habitacion(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public void mostrar_info() {
        System.out.println("Habitación: " + nombre + ", Tamaño: " + tamano + " m²");
    }
}

class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        habitaciones = new ArrayList<>();
    }

    public void agregar_habitacion(Habitacion h) {
        habitaciones.add(h);
    }

    public void mostrar_casa() {
        System.out.println("Dirección: " + direccion);
        for (Habitacion h : habitaciones) {
            h.mostrar_info();
        }
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Casa casa = new Casa("Av. 6 de Agosto #123");
        casa.agregar_habitacion(new Habitacion("Sala", 25));
        casa.agregar_habitacion(new Habitacion("Cocina", 12));
        casa.agregar_habitacion(new Habitacion("Dormitorio", 18));
        casa.mostrar_casa();
    }
    
}

