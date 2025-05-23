package Ejercicio1java;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // b) Crear instancias de Coche y Moto
        ArrayList<Coche> coches = new ArrayList<>();
        ArrayList<Moto> motos = new ArrayList<>();

        coches.add(new Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina"));
        coches.add(new Coche("Ford", "Explorer", 2025, 30000, 5, "Diesel"));
        coches.add(new Coche("Tesla", "Model S", 2024, 80000, 4, "Eléctrico"));

        motos.add(new Moto("Yamaha", "MT-03", 2025, 5000, 321, "4 tiempos"));
        motos.add(new Moto("Honda", "CBR500R", 2023, 7000, 500, "4 tiempos"));

        // b) Mostrar información de coches
        System.out.println("=== Información de Coches ===");
        for (Coche c : coches) {
            c.mostrarInfo();
        }

        // b) Mostrar información de motos
        System.out.println("\n=== Información de Motos ===");
        for (Moto m : motos) {
            m.mostrarInfo();
        }

        // c) Mostrar todos los coches que tienen más de 4 puertas
        System.out.println("\n=== Coches con más de 4 puertas ===");
        for (Coche c : coches) {
            if (c.getNumPuertas() > 4) {
                c.mostrarInfo();
            }
        }

        // d) Mostrar coches y motos actuales (gestión 2025)
        System.out.println("\n=== Vehículos gestión 2025 ===");
        for (Coche c : coches) {
            if (c.getAnio() == 2025) {
                c.mostrarInfo();
            }
        }
        for (Moto m : motos) {
            if (m.getAnio() == 2025) {
                m.mostrarInfo();
            }
        }
    }
}