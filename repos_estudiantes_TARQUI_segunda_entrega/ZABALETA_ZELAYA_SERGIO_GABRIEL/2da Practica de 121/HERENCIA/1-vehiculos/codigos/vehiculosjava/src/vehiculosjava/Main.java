package vehiculosjava;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancias
        List<Coche> coches = new ArrayList<>();
        coches.add(new Coche("Toyota", "Corolla", 2020, 25000, 4, "Gasolina"));
        coches.add(new Coche("Ford", "Mustang", 2023, 45000, 2, "Gasolina"));
        coches.add(new Coche("Tesla", "Model 3", 2024, 50000, 4, "Eléctrico"));

        List<Moto> motos = new ArrayList<>();
        motos.add(new Moto("Honda", "CBR600", 2022, 12000, 600, "4T"));
        motos.add(new Moto("Yamaha", "MT-07", 2023, 9000, 700, "2T"));

        // b) Mostrar información de todos los vehículos
        System.out.println("=== TODOS LOS VEHÍCULOS ===");
        for (Coche coche : coches) {
            coche.mostrar_info();
            System.out.println("---------------------");
        }
        for (Moto moto : motos) {
            moto.mostrar_info();
            System.out.println("---------------------");
        }
        // c) Mostrar coches con más de 4 puertas
        System.out.println("=== COCHES CON MÁS DE 4 PUERTAS ===");
        for (Coche coche : coches) {
            if (coche.getNumPuertas() > 4) {
                coche.mostrar_info();
                System.out.println("---------------------");
            }
        }
        // d) Mostrar vehículos del año actual (2025)
        System.out.println("=== VEHÍCULOS DEL AÑO ACTUAL (2025) ===");
        for (Coche coche : coches) {
            if (coche.getAnio() == 2025) {
                coche.mostrar_info();
                System.out.println("---------------------");
            }
        }
        for (Moto moto : motos) {
            if (moto.getAnio() == 2025) {
                moto.mostrar_info();
                System.out.println("---------------------");
            }
        }
    }
}