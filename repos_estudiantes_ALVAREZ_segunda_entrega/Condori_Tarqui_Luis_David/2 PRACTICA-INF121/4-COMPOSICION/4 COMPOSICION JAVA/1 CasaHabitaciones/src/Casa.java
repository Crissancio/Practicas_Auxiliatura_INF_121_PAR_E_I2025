import java.util.ArrayList;

public class Casa {
    private String direccion;
    private ArrayList<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion h) {
        habitaciones.add(h);
    }

    public void mostrarCasa() {
        System.out.println("Dirección: " + direccion);
        for (Habitacion h : habitaciones) {
            h.mostrarInfo();
        }
    }
}

