
package appvehiculos;

public class AppVehiculos {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2022, 20000, 4, "Gasolina");
        Coche coche2 = new Coche("BMW", "Serie 3", 2025, 30000, 5, "Hibrido");
        Moto moto1 = new Moto("Honda", "CBR", 2021, 8000, 500, "4T");
        Moto moto2 = new Moto("Yamaha", "FZ", 2025, 8500, 250, "2T");

        Vehiculo[] vehiculos = { coche1, coche2, moto1, moto2 };

        System.out.println("--- Todos los vehiculos ---");
        for (Vehiculo v : vehiculos) {
            System.out.println(v.mostrarInfo());
        }

        System.out.println("\n--- Coches con mas de 4 puertas ---");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche) {
                Coche c = (Coche) v;
                if (c.getNumPuertas() >= 4) {
                    System.out.println(c.mostrarInfo());
                }
            }
        }

        System.out.println("\n--- Vehiculos modelo 2025 ---");
        for (Vehiculo v : vehiculos) {
            if (v.año == 2025) {
                System.out.println(v.mostrarInfo());
            }
        }
    }
}

