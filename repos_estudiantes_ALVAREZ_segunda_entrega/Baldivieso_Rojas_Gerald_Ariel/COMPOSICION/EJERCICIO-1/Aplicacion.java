import java.util.ArrayList;
import java.util.List;

class Habitacion {
    private String nombre;
    private int tamano;

    public Habitacion(String nombre, int tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public void mostrarInfo() {
        System.out.println("Nombre de habitación: " + nombre + ", Tamaño en metros cuadrados: " + tamano);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getTamano() { return tamano; }
    public void setTamano(int tamano) { this.tamano = tamano; }
}

class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public List<Habitacion> getHabitaciones() { return habitaciones; }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void mostrarCasa() {
        System.out.println("Dirección de la casa: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion habitacion : habitaciones) {
            habitacion.mostrarInfo();
        }
    }
}

public class Aplicacion {
    public static void main(String[] args) {
        Casa casa1 = new Casa("Av. Siempre Viva 742");

        Habitacion hab1 = new Habitacion("Sala", 25);
        Habitacion hab2 = new Habitacion("Cocina", 12);
        Habitacion hab3 = new Habitacion("Dormitorio principal", 20);
        Habitacion hab4 = new Habitacion("Baño", 8);

        casa1.agregarHabitacion(hab1);
        casa1.agregarHabitacion(hab2);
        casa1.agregarHabitacion(hab3);
        casa1.agregarHabitacion(hab4);

        casa1.mostrarCasa();
    }
}
