/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.habitaciones;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;

class Habitacion {
    private String nombre;
    private int tamaño;

    public Habitacion(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String mostrarInfo() {
        return "- " + nombre + ": " + tamaño + " m²";
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamaño() {
        return tamaño;
    }
}

class Casa {
    private String direccion;
    private ArrayList<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion h) {
        habitaciones.add(h);
    }

    public void mostrarCasa() {
        System.out.println("Dirección de la casa: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion h : habitaciones) {
            System.out.println(h.mostrarInfo());
        }
    }
}

public class Habitaciones {
    public static void main(String[] args) {
        Casa casa = new Casa("Calle Falsa 123");
        casa.agregarHabitacion(new Habitacion("Cocina", 12));
        casa.agregarHabitacion(new Habitacion("Sala", 20));
        casa.agregarHabitacion(new Habitacion("Dormitorio", 15));

        casa.mostrarCasa();
    }
}
