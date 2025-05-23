import java.util.ArrayList;

public class Casa {
    private String direccion;
    private ArrayList<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public void agregar(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void mostrar() {
        System.out.println("Casa en " + direccion + ":");
        for (Habitacion h : habitaciones) {
            h.mostrar_info();
        }
    }
}
