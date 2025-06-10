package Ejercicio1;

import java.util.ArrayList;

public class Casa {
    private String direccion;
    private ArrayList<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarHabitacion(String nombre, double tamaño) {
        Habitacion h = new Habitacion(nombre, tamaño);
        habitaciones.add(h);
    }

    public void mostrarCasa() {
        System.out.println("Direccion: " + direccion);
        System.out.println("Habitaciones:");
        for (int i = 0; i < habitaciones.size(); i++) {
            habitaciones.get(i).mostrar_info();
        }
    }
}
