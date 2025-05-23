package Herencia;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2025, 23000, 4, "Gasolina");
        Coche coche2 = new Coche("Ford", "Explorer", 2025, 32000, 5, "Diésel");
        Moto moto1 = new Moto("Yamaha", "R3", 2025, 8000, 321, "4T");
        Moto moto2 = new Moto("Honda", "CBR500R", 2024, 9500, 500, "4T");

        // Mostrar información
        System.out.println(coche1.mostrarInfo());
        System.out.println(coche2.mostrarInfo());
        System.out.println(moto1.mostrarInfo());
        System.out.println(moto2.mostrarInfo());

        // Mostrar coches con más de 4 puertas
        System.out.println("\nCoches con más de 4 puertas:");
        Coche[] coches = {coche1, coche2};
        for (Coche c : coches) {
            if (c.getNumPuertas() > 4) {
                System.out.println(c.mostrarInfo());
            }
        }

        // Mostrar vehículos del año 2025
        System.out.println("\nVehículos del año 2025:");
        Vehiculo[] vehiculos = {coche1, coche2, moto1, moto2};
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == 2025) {
                System.out.println(v.mostrarInfo());
            }
        }
    }
}

