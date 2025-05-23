package Herencia;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Coche("Toyota", "Corolla", 2022, 20000, 4, "Gasolina"));
        vehiculos.add(new Coche("Ford", "Mondeo", 2025, 30000, 5, "Diésel"));
        vehiculos.add(new Moto("Yamaha", "MT-07", 2025, 7500, 689, "2 tiempos"));
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
            System.out.println();
        }
        System.out.println("Coches con más de 4 puertas:");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche) {
                Coche c = (Coche) v;
                if (c.getNumPuertas() > 4) {
                    c.mostrarInfo();
                    System.out.println();
                }
            }
        }

        System.out.println("Vehículos actuales (2025):");
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == 2025) {
                v.mostrarInfo();
                System.out.println();
            }
        }
    }
}
