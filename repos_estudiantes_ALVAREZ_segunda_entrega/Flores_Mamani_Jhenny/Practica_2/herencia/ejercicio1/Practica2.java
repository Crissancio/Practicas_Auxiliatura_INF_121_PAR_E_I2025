/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
package com.mycompany.practica2;

/**
 *
 * @author WINDOWS 11
 */
import java.util.ArrayList;
import java.util.List;

public class Practica2 {

    public static void main(String[] args) {

   
        List<Vehiculo> vehiculos = new ArrayList<>();
        Coche coche1 = new Coche("Suprime", "45FGG", 2025, 2340, 4, "Gas");
        Coche coche2 = new Coche("Tesla", "Model 3", 2025, 35000, 5, "Eléctrico");
        Moto moto1 = new Moto("Toyota", "5T", 2024, 4000, 31, "06");
        Moto moto2 = new Moto("Ford", "KGH", 2025, 1500, 70, "05");

        vehiculos.add(coche1);
        vehiculos.add(coche2);
        vehiculos.add(moto1);
        vehiculos.add(moto2);
        System.out.println("--- Vehículos registrados ---");
        for (Vehiculo v : vehiculos) {
            v.mostrarinfo();
            System.out.println();
        }

      // Iinciso c
        System.out.println("--- Coches con más de 4 puertas ---");
        mostrarCochesConMasDe4Puertas(vehiculos);

        // Inciso d
        System.out.println("--- Vehículos de gestión 2025 (Coches y Motos) ---");
        mostrarvehiculo2025(vehiculos);
    }

    public static void mostrarCochesConMasDe4Puertas(List<Vehiculo> vehiculos) {
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche) {
                Coche coche = (Coche) v;
                if (coche.getNumPuertas() > 4) {
                    coche.mostrarinfo();
                    System.out.println();
                }
            }
        }
    }

    public static void mostrarvehiculo2025(List<Vehiculo> vehiculos) {
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == 2025 && (v instanceof Coche || v instanceof Moto)) {
                v.mostrarinfo();
                System.out.println();
            }
        }
    }
}



