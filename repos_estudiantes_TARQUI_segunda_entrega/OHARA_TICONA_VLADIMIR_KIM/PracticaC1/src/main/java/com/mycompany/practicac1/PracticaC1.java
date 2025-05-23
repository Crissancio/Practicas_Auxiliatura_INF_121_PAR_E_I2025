/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practicac1;

/**
 *
 * @author Usuario
 */
public class PracticaC1 {

    public static void main(String[] args) {
        Casa c1 = new Casa("Av. Principal 123");

        c1.agregarHabitacion(new Habitacion("Sala", 20.5));
        c1.agregarHabitacion(new Habitacion("Cocina", 15.0));
        c1.agregarHabitacion(new Habitacion("Dormitorio", 18.3));
        c1.agregarHabitacion(new Habitacion("Baño", 6.7));

        c1.mostrarCasa();
    }
}
