package Ejercicio1;

import java.util.ArrayList;

public class Ej1 {
    public static void main(String[] args) {
        Casa casa = new Casa("Av. Siempre Viva 742");
        casa.agregar_habitacion(new Habitacion("Sala", 20));
        casa.agregar_habitacion(new Habitacion("Cocina", 12));
        casa.agregar_habitacion(new Habitacion("Dormitorio", 15));
        casa.agregar_habitacion(new Habitacion("Baño", 6));

        casa.mostrar_casa();
    }
}

class Habitacion {
    private String nombre;
    private int tamano;

    public Habitacion(String nombre, int tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public String get_nombre() {
        return nombre;
    }

    public void set_nombre(String nombre) {
        this.nombre = nombre;
    }

    public int get_tamano() {
        return tamano;
    }

    public void set_tamano(int tamano) {
        this.tamano = tamano;
    }

    public void mostrar_info() {
        System.out.println("Habitación: " + nombre + ", Tamaño: " + tamano + " m²");
    }
}

class Casa {
    private String direccion;
    private ArrayList<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public String get_direccion() {
        return direccion;
    }

    public void set_direccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Habitacion> get_habitaciones() {
        return habitaciones;
    }

    public void agregar_habitacion(Habitacion h) {
        habitaciones.add(h);
    }

    public void mostrar_casa() {
        System.out.println("Dirección de la casa: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion h : habitaciones) {
            h.mostrar_info();
        }
    }
}
