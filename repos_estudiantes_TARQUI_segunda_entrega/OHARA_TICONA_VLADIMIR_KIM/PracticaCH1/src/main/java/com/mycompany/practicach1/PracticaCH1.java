/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practicach1;

import java.util.*;

public class PracticaCH1 {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Coche coche1 = new Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina");
        Coche coche2 = new Coche("Ford", "Explorer", 2025, 35000, 5, "Diésel");
        Coche coche3 = new Coche("Chevrolet", "Onix", 2024, 18000, 4, "Gasolina");

        Moto moto1 = new Moto("Yamaha", "MT-07", 2025, 9000, 689, "4 tiempos");
        Moto moto2 = new Moto("Honda", "CBR500R", 2023, 7500, 471, "4 tiempos");

        vehiculos.add(coche1);
        vehiculos.add(coche2);
        vehiculos.add(coche3);
        vehiculos.add(moto1);
        vehiculos.add(moto2);

        System.out.println("\n--- Vehículos con más de 4 puertas ---");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche && ((Coche) v).getNumPuertas() > 4) {
                v.mostrarInfo();
                System.out.println();
            }
        }
        System.out.println("\n--- Vehículos del año 2025 ---");
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == 2025) {
                v.mostrarInfo();
                System.out.println();
            }
        }
    }
}
