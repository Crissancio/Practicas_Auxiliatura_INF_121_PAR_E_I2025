import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        Coche c1 = new Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina");
        Coche c2 = new Coche("Ford", "Explorer", 2025, 30000, 5, "Diesel");
        Moto m1 = new Moto("Yamaha", "YZF-R3", 2025, 6000, 321, "2T");
        Moto m2 = new Moto("Honda", "CBR600RR", 2023, 11500, 599, "4T");

        vehiculos.add(c1);
        vehiculos.add(c2);
        vehiculos.add(m1);
        vehiculos.add(m2);

        System.out.println("\n--- Información de vehículos ---");
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
            System.out.println();
        }

        System.out.println("--- Coches con más de 4 puertas ---");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche && ((Coche) v).getNumPuertas() > 4) {
                v.mostrarInfo();
                System.out.println();
            }
        }

        System.out.println("--- Vehículos del año 2025 ---");
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == 2025) {
                v.mostrarInfo();
                System.out.println();
            }
        }
    }
}
