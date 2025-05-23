package AgregacionyComposicion;
import java.util.ArrayList;
class Habitacion {
    private String nombre;
    private double tamano;
    public Habitacion(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }
    public String getNombre() {
        return nombre;
    }
    public double getTamano() {
        return tamano;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    public void mostrarInfo() {
        System.out.println("Habitación: " + nombre + ", Tamaño: " + tamano + " m²");
    }
}
class Casa {
    private String direccion;
    private ArrayList<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarHabitacion(Habitacion h) {
        habitaciones.add(h);
    }
    public void mostrarCasa() {
        System.out.println("Dirección: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion h : habitaciones) {
            h.mostrarInfo();
        }
    }
}
public class ejercicio1 {
    public static void main(String[] args) {
        Habitacion h1 = new Habitacion("Dormitorio", 12);
        Habitacion h2 = new Habitacion("Sala", 20);
        Habitacion h3 = new Habitacion("Cocina", 10);

        Casa casa = new Casa("Calle Falsa 123");
        casa.agregarHabitacion(h1);
        casa.agregarHabitacion(h2);
        casa.agregarHabitacion(h3);
        casa.mostrarCasa();
    }
}
