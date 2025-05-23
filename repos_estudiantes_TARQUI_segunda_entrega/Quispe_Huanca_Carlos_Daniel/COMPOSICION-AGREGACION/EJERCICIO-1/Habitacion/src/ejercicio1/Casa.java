package ejercicio1;

import java.util.ArrayList;

public class Casa {
    private String direccion;
    private ArrayList<Habitacion> habitaciones;
    
    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>(); // Composición en Java
    }
    
    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }
    
    public void mostrarCasa() {
        System.out.println("Casa en: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion habitacion : habitaciones) {
            habitacion.mostrarInfo();
        }
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}