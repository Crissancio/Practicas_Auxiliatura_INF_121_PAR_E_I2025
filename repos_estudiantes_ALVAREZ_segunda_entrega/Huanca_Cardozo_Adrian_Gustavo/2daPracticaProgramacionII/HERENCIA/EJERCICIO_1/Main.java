package HERENCIA.EJERCICIO_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();


        Coche c1 = new Coche("Toyota", "Corolla", 2024, 20000, 4, "Gasolina");
        Coche c2 = new Coche("Ford", "Explorer", 2025, 35000, 5, "Diésel");


        Moto m1 = new Moto("Yamaha", "R1", 2025, 18000, 1000, "4 tiempos");
        Moto m2 = new Moto("Honda", "CBR500R", 2023, 8500, 500, "4 tiempos");


        vehiculos.add(c1);
        vehiculos.add(c2);
        vehiculos.add(m1);
        vehiculos.add(m2);

        System.out.println("=== Mostrar información de todos los vehículos ===");
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
            System.out.println("------------------------------");
        }

        System.out.println("=== Coches con más de 4 puertas ===");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche) {
                Coche c = (Coche) v;
                if (c.getNumPuertas() > 4) {
                    c.mostrarInfo();
                    System.out.println("------------------------------");
                }
            }
        }

        // d) Mostrar coches y motos actuales (año 2025)
        System.out.println("=== Vehículos del año 2025 ===");
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == 2025) {
                v.mostrarInfo();
                System.out.println("------------------------------");
            }
        }
    }
}
