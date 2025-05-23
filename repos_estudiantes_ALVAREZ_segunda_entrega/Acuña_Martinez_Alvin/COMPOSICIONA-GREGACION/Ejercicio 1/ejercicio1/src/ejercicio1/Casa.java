package ejercicio1;

import java.util.ArrayList;

public class Casa {
    private String direccion;
    private ArrayList<Habitacion> habitaciones;

    // a) Constructor, inicializa lista habitaciones
    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    // a) Método agregar_habitacion
    public void agregarHabitacion(Habitacion h) {
        habitaciones.add(h);
    }

    // a) Método mostrar_casa
    public void mostrarCasa() {
        System.out.println("Dirección: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion h : habitaciones) {
            h.mostrarInfo();
        }
    }
}
