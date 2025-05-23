package Ejercicio1p;

import java.util.ArrayList;


class Habitacion {
    private String nombre;
    private double tamano;

    public Habitacion(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTamano() {
        return tamano;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public String mostrarInfo() {
        return "Habitación: " + nombre + ", Tamaño: " + tamano + " m²";
    }
}

class Casa {
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

    public void agregarHabitacion(Habitacion h) {
        habitaciones.add(h);
    }

    public void mostrarCasa() {
        System.out.println(" Dirección: " + direccion);
        System.out.println(" Habitaciones:");
        for (Habitacion h : habitaciones) {
            System.out.println("   " + h.mostrarInfo());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("noemi chino blanco");
        Casa casa1 = new Casa("Calle sucre, Zona nueva azuncio");

        Habitacion h1 = new Habitacion("Sala", 13);
        Habitacion h2 = new Habitacion("Comedor", 42);
        Habitacion h3 = new Habitacion("Dormitorio", 15);
        Habitacion h4 = new Habitacion("Baño", 65);

        casa1.agregarHabitacion(h1);
        casa1.agregarHabitacion(h2);
        casa1.agregarHabitacion(h3);
        casa1.agregarHabitacion(h4);

        casa1.mostrarCasa();
    }
}

