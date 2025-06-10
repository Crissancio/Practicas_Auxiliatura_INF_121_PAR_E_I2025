import java.util.ArrayList;
class Habitacion {
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
        System.out.println("Habitación: " + nombre + ", Tamaño: " + tamaño + " m²");
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
    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }
    public void mostrarCasa() {
        System.out.println("Dirección de la casa: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion h : habitaciones) {
            h.mostrarInfo();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa("Av. Siempre Viva 742");
        Habitacion hab1 = new Habitacion("Sala", 20);
        Habitacion hab2 = new Habitacion("Cocina", 15);
        Habitacion hab3 = new Habitacion("Dormitorio", 25);
        Habitacion hab4 = new Habitacion("Baño", 8);
        casa1.agregarHabitacion(hab1);
        casa1.agregarHabitacion(hab2);
        casa1.agregarHabitacion(hab3);
        casa1.agregarHabitacion(hab4);
        casa1.mostrarCasa();
    }
}