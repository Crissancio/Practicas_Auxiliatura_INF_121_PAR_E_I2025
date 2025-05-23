package COMPOSICION_AGREGACION.EJER_1;
import java.util.ArrayList;
import java.util.List;
public class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }
    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void mostrarCasa() {
        System.out.println("=== Casa ===");
        System.out.println("Direccion: " + direccion);
        System.out.println("\n=== Habitaciones ===");
        
        for (Habitacion hab : habitaciones) {
            hab.mostrarInfo();
            System.out.println("-------------------");
        }
    }

    public List<Habitacion> getHabitaciones() {
        return new ArrayList<>(habitaciones); // Devuelve copia para proteger encapsulamiento
    }
}