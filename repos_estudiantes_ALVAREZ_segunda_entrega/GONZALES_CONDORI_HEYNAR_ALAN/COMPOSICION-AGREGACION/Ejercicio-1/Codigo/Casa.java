
package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public void agregar_habitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void mostrar_casa() {
        System.out.println("Dirección de la casa: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion h : habitaciones) {
            h.mostrar_info();
        }
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
}

