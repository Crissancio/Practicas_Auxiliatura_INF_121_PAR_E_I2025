import java.util.ArrayList;
import java.util.List;

class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;

    // Constructor por defecto
    public Casa() {
        this.direccion = "Sin dirección";
        this.habitaciones = new ArrayList<>();
    }

    // Constructor con dirección
    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    // Getters y Setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    // Método para agregar habitación
    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    // Método para mostrar información de la casa
    public void mostrarCasa() {
        System.out.println("=== Información de la Casa ===");
        System.out.println("Dirección: " + direccion);
        System.out.println("\n=== Habitaciones ===");
        
        if (habitaciones.isEmpty()) {
            System.out.println("La casa no tiene habitaciones.");
        } else {
            for (Habitacion hab : habitaciones) {
                hab.mostrarInfo();
                System.out.println("---------------------");
            }
            System.out.println("Total habitaciones: " + habitaciones.size());
            
            // Calcular tamaño total
            double tamanoTotal = habitaciones.stream()
                .mapToDouble(Habitacion::getTamano)
                .sum();
            System.out.println("Tamaño total de la casa: " + tamanoTotal + " m²");
        }
    }
}