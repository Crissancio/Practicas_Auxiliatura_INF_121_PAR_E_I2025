
package ejercicio1;
import java.util.ArrayList;
import java.util.List;

public class Casa {
     private String direccion;
    private List<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion h) {
        habitaciones.add(h);
    }

    public void mostrarCasa() {
        System.out.println("Direccion: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion h : habitaciones) {
            h.mostrarInfo();
        }
    }
}
