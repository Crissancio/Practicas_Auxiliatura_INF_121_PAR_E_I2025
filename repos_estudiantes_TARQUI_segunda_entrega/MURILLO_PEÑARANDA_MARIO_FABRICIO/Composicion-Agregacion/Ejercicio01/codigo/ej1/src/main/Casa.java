/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Fabricio
 */
class Casa {
    private String direccion;
    private ArrayList<Habitacion> habitaciones = new ArrayList<>();

    public Casa(String direccion) {
        this.direccion = direccion;
    }

    public void agregar_habitacion(Habitacion h) {
        habitaciones.add(h);
    }

    public void mostrar_casa() {
        System.out.println("Casa en: " + direccion);
        for (Habitacion h : habitaciones) {
            h.mostrar_info();
        }
    }
}