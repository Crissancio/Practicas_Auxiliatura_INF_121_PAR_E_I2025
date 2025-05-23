package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2022, 25000, 4, "Gasolina");
        Coche coche2 = new Coche("Ford", "F-150", 2023, 45000, 2, "Diésel");
        Coche coche3 = new Coche("Honda", "Civic", 2025, 28000, 5, "Híbrido");

        Moto moto1 = new Moto("Harley-Davidson", "Sportster", 2021, 12000, 1200, "V-Twin");
        Moto moto2 = new Moto("Yamaha", "YZF-R1", 2025, 18000, 998, "4 cilindros");

        System.out.println("\nInformación de todos los vehículos:");
        System.out.println("Coche 1: " + coche1.mostrarInfo());
        System.out.println("Coche 2: " + coche2.mostrarInfo());
        System.out.println("Coche 3: " + coche3.mostrarInfo());
        System.out.println("Moto 1: " + moto1.mostrarInfo());
        System.out.println("Moto 2: " + moto2.mostrarInfo());

        System.out.println("\nCoches con más de 4 puertas:");
        List<Coche> coches = new ArrayList<>();
        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);

        for (Coche coche : coches) {
            if (coche.getNumPuertas() > 4) {
                System.out.println(coche.mostrarInfo());
            }
        }

        System.out.println("\nVehículos del año actual (2025):");
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(coche1);
        vehiculos.add(coche2);
        vehiculos.add(coche3);
        vehiculos.add(moto1);
        vehiculos.add(moto2);

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getAño() == 2025) {
                System.out.println(vehiculo.mostrarInfo());
            }
        }
    }
}