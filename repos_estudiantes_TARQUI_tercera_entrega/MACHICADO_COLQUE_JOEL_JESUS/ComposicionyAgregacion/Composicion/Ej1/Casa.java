package ComposicionyAgregacion.Composicion.Ej1;
import java.util.*;

public class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;

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

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void mostrarCasa() {
        System.out.println("Dirección: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion h : habitaciones) {
            h.mostrarInfo();
        }
    }
}
