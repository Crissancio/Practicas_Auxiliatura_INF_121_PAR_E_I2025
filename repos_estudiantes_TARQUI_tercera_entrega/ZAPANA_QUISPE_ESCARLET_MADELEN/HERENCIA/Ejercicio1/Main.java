import java.util.ArrayList;
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // Instancias
        Coche coche1 = new Coche("Toyota", "Corolla", 2023, 25000f, 4, "Gasolina");
        Coche coche2 = new Coche("Renault", "5 E-Tech", 2025, 28000f, 5, "Electrico");
        Coche coche3 = new Coche("BYD", "Seagull", 2025, 19000f, 5, "Electrico");

        Moto moto1 = new Moto("Suzuki", "Gixxer", 2025, 15000f, "155cc", "4T");
        Moto moto2 = new Moto("Yamaha", "MT-09", 2024, 21000f, "890cc", "Y-AMT");

        vehiculos.add(coche1);
        vehiculos.add(coche2);
        vehiculos.add(coche3);
        vehiculos.add(moto1);
        vehiculos.add(moto2);

        System.out.println("=== Todos los vehiculos ===");
        for (Vehiculo v : vehiculos) {
            v.mostrar_info();
            System.out.println();
        }

        System.out.println("=== Coches con mas de 4 puertas ===");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche coche && coche.getNum_puertas() > 4) {
                coche.mostrar_info();
                System.out.println();
            }
        }

        System.out.println("=== Vehiculos del año 2025 ===");
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == 2025) {
                v.mostrar_info();
                System.out.println();
            }
        }
    }
    
}
