import java.util.ArrayList;

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
    
    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
    
    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }
    
    public void mostrarCasa() {
        System.out.println("Casa ubicada en: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion habitacion : habitaciones) {
            System.out.println("  - " + habitacion.mostrarInfo());
        }
        System.out.println("Total de habitaciones: " + habitaciones.size());
    }
}
