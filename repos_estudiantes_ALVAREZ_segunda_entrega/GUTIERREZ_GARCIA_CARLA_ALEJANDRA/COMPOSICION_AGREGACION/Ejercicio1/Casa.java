import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;

    public Casa(String d) {
        this.direccion = d;
        this.habitaciones = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setDireccion(String d) {
        this.direccion = d;
    }

    public void agregar_habitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void mostrar_casa() {
        System.out.println("Direccion de la casa: " + this.direccion);
        System.out.println("Habitaciones:");
        for (int i = 0; i < habitaciones.size(); i++) {
            habitaciones.get(i).mostrar_info();
        }
    }
}