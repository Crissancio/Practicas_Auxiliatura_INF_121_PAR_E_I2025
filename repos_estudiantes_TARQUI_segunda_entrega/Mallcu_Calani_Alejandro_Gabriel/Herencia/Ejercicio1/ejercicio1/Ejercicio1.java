/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("--- a) Implementa las clases con sus constructores, getters y setters ---");
        System.out.println("Clases Vehiculo, Coche y Moto implementadas.\n");

        // --- b) Crea instancias de Coche y Moto y muestra su información usando el método mostrar_info(). ---
        System.out.println("--- b) Creación de instancias y muestra de información ---");
        Coche coche1 = new Coche("Toyota", "Corolla", 2023, 20000, 4, "Gasolina");
        Coche coche2 = new Coche("Honda", "Civic", 2025, 22000, 5, "Gasolina");
        Coche coche3 = new Coche("Ford", "Mustang", 2024, 45000, 2, "Gasolina");
        Coche coche4 = new Coche("Tesla", "Model S", 2025, 75000, 5, "Eléctrico");

        Moto moto1 = new Moto("Yamaha", "MT-07", 2022, 8000, 689, "Bicilíndrico");
        Moto moto2 = new Moto("Honda", "CBR500R", 2025, 7000, 471, "Bicilíndrico en paralelo");
        Moto moto3 = new Moto("Kawasaki", "Ninja 400", 2025, 5500, 399, "Bicilíndrico en paralelo");

        System.out.println("Información de los vehículos creados:");
        System.out.println("Coche 1: " + coche1.mostrarInfo());
        System.out.println("Coche 2: " + coche2.mostrarInfo());
        System.out.println("Coche 3: " + coche3.mostrarInfo());
        System.out.println("Coche 4: " + coche4.mostrarInfo());
        System.out.println("Moto 1: " + moto1.mostrarInfo());
        System.out.println("Moto 2: " + moto2.mostrarInfo());
        System.out.println("Moto 3: " + moto3.mostrarInfo() + "\n");

        // Lista de todos los vehículos para facilitar las búsquedas
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(coche1);
        listaVehiculos.add(coche2);
        listaVehiculos.add(coche3);
        listaVehiculos.add(coche4);
        listaVehiculos.add(moto1);
        listaVehiculos.add(moto2);
        listaVehiculos.add(moto3);

        // --- c) Muestra todos los coches que tienen más de 4 puertas. ---
        System.out.println("--- c) Coches con más de 4 puertas ---");
        List<Coche> cochesMas4Puertas = new ArrayList<>();
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo instanceof Coche) {
                Coche coche = (Coche) vehiculo; // Cast para acceder a métodos específicos de Coche
                if (coche.getNumPuertas() > 4) {
                    cochesMas4Puertas.add(coche);
                }
            }
        }

        if (!cochesMas4Puertas.isEmpty()) {
            for (Coche coche : cochesMas4Puertas) {
                System.out.println(coche.mostrarInfo());
            }
        } else {
            System.out.println("No hay coches con más de 4 puertas.");
        }
        System.out.println("");

        // --- d) Mostrar los coches y motos actuales (gestión 2025) ---
        System.out.println("--- d) Coches y motos del año 2025 ---");
        int anioActual = 2025; // Como se indica en la imagen "gestión 2025"

        List<Vehiculo> vehiculos2025 = new ArrayList<>();
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getAnio() == anioActual) {
                vehiculos2025.add(vehiculo);
            }
        }

        if (!vehiculos2025.isEmpty()) {
            System.out.println("Vehículos del año " + anioActual + ":");
            for (Vehiculo vehiculo : vehiculos2025) {
                System.out.println(vehiculo.mostrarInfo());
            }
        } else {
            System.out.println("No hay vehículos registrados del año " + anioActual + ".");
        }
    }
}