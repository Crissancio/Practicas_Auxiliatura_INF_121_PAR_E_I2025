package Ejercicio1;

import java.util.ArrayList;

public class Casa {
    public String direccion;
    public ArrayList<Habitacion> habitaciones;

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

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void mostrarCasa() {
        System.out.println("Direccion de la casa: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion h : habitaciones) {
            h.mostrarInfo();
        }
    }
     public static void main(String[] args) {
        // b) Crea una casa y agrega varias habitaciones
        Casa casa = new Casa("Calle Heroes de Puno");

        Habitacion habitacion1 = new Habitacion("Sala", 25);
        Habitacion habitacion2 = new Habitacion("Cocina", 12);
        Habitacion habitacion3 = new Habitacion("Dormitorio", 20);
        Habitacion habitacion4 = new Habitacion("Baño", 14);

        casa.agregarHabitacion(habitacion1);
        casa.agregarHabitacion(habitacion2);
        casa.agregarHabitacion(habitacion3);
        casa.agregarHabitacion(habitacion4);
        // c) Muestra la información de la casa y sus habitaciones
        casa.mostrarCasa();
    }   
}