package Herencia.Ej1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Coche> coches = new ArrayList<>();
        ArrayList<Moto> motos = new ArrayList<>();
// INCISO B
        // Instancias de coches
        coches.add(new Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina"));
        coches.add(new Coche("Chevrolet", "Suburban", 2024, 35000, 5, "Diesel"));
        coches.add(new Coche("Tesla", "Model S", 2025, 80000, 5, "Eléctrico"));

        // Instancias de motos
        motos.add(new Moto("Yamaha", "FZ", 2025, 3500, 250, "2 tiempos"));
        motos.add(new Moto("Kawasaki", "Ninja", 2023, 7000, 600, "4 tiempos"));

        System.out.println("\n Todos los coches:");
        for (Coche c : coches) {
            c.mostrar_info();
            System.out.println("-----------------");
        }
// INCISO C
        System.out.println("\n Coches con más de 4 puertas:");
        for (Coche c : coches) {
            if (c.getNumPuertas() > 4) {
                c.mostrar_info();
                System.out.println("-----------------");
            }
        }
// INCISO D
        System.out.println("\n Vehículos del año 2025:");
        for (Coche c : coches) {
            if (c.getAño() == 2025) {
                c.mostrar_info();
                System.out.println("-----------------");
            }
        }
        for (Moto m : motos) {
            if (m.getAño() == 2025) {
                m.mostrar_info();
                System.out.println("-----------------");
            }
        }
    }
}
