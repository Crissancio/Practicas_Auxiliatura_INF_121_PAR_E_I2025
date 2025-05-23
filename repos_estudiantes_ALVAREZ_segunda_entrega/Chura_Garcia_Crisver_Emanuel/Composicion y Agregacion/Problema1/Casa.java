//a) Implementa las clases con sus constructores, getters y setters.
import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Habitacion> getHabitaciones() {
        return this.habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void agregar_habitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void mostrar_casa() {
        System.out.println("Casa:" + "\ndireccion: " + getDireccion() + " habitaciones:");
        for (int i = 0; i < habitaciones.size(); i++) {
            Habitacion habitacion = habitaciones.get(i);
            habitacion.mostrar_info();
        }
    }
}
