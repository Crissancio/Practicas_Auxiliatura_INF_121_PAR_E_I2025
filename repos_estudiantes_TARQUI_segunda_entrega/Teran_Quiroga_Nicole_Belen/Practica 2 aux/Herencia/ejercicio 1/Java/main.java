import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Vehiculo[] v2025 = new Vehiculo[4];
        v2025[0] = new Coche("Ford", "Focus", 2025, 20000, 5, "Diesel");
        v2025[1] = new Coche("Toyota", "Corolla", 2025, 22000, 4, "Gasolina");
        v2025[2] = new Moto("Yamaha", "R1", 2025, 15000, 1000, "Gasolina");
        v2025[3] = new Moto("Honda", "CBR", 2025, 14000, 600, "Gasolina");

        ArrayList<Coche> coches = new ArrayList<>();
        ArrayList<Moto> motos = new ArrayList<>();

        System.out.println("Vehículos 2025:");
        for (Vehiculo vehiculo : v2025) {
            if (vehiculo instanceof Coche) {
                coches.add((Coche) vehiculo);
            } else if (vehiculo instanceof Moto) {
                motos.add((Moto) vehiculo);
            }
        }

        System.out.println("\nCoches con más de 4 puertas:");
        for (Coche coche : coches) {
            if (coche.getNum_puertas() > 4) {
                coche.mostrar_info();
            }
        }

        System.out.println("\nTodos los coches:");
        for (Coche coche : coches) {
            coche.mostrar_info();
        }

        System.out.println("\nTodas las motos:");
        for (Moto moto : motos) {
            moto.mostrar_info();
        }
    }
}
