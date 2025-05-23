import java.util.ArrayList;

public class Casa {
    private String direccion;
    private ArrayList<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public Casa() {
        this("Sin Dirección");
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
        if (habitacion != null) {
            habitaciones.add(habitacion);
        } else {
            System.out.println("Error: Solo se pueden agregar objetos de tipo Habitacion.");
        }
    }

    public void mostrarCasa() {
        System.out.println("Dirección de la Casa: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion h : habitaciones) {
            h.mostrarInfo();
        }
    }
}
