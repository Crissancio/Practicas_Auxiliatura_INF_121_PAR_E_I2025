import java.util.ArrayList;

class Habitacion {
    private String nombre;
    private double tamano;

    public Habitacion(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public String mostrarInfo() {
        return "Habitación: " + nombre + ", Tamaño: " + tamano + " m²";
    }
}

class Casa {
    private String direccion;
    private ArrayList<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void mostrarCasa() {
        System.out.println("Casa ubicada en: " + direccion);
        for (Habitacion h : habitaciones) {
            System.out.println(h.mostrarInfo());
        }
    }
}
// SIN GETTERS NI SETTERS
class TestCasa {
    public static void main(String[] args) {
        Casa casa = new Casa("Av. Siempre Viva 742");
        casa.agregarHabitacion(new Habitacion("Sala", 25));
        casa.agregarHabitacion(new Habitacion("Cocina", 12));
        casa.agregarHabitacion(new Habitacion("Dormitorio", 20));

        casa.mostrarCasa();
    }
}