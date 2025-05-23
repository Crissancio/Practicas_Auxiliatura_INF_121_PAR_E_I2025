package main;

import java.util.ArrayList;
import java.util.List;

public class Casa {
     private String direccion;
     private List<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
        System.out.println("Se agrego '" + habitacion.getNombre() + "' a la casa en " + direccion);
    }

    public void mostrarCasa() {
        System.out.println("\n----- Casa en " + direccion + " -----");
        System.out.println("Habitaciones:");
        for (Habitacion h : habitaciones) {
            h.mostrarInfo();
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
