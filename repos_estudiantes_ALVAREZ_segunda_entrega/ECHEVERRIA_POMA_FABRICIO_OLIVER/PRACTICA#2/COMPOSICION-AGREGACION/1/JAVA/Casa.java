import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String dirección;
    private List<Habitacion> habitaciones;

    public Casa(String dirección) {
        this.dirección = dirección;
        this.habitaciones = new ArrayList<>();
    }

    //A
    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void agregar_habitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void mostrar_casa() {
        System.out.println("Dirección: " + dirección);
        System.out.println("Habitaciones:");
        for (Habitacion habitacion : habitaciones) {
            habitacion.mostrar_info();
        }
    }
}