public class Main {
    public static void main(String[] args) {
         // b) Crear instancias de Coche y Moto
        Coche coche1 = new Coche("Toyota", "Corolla", 2020, 25000.0, 4, "Gasolina");
        Coche coche2 = new Coche("Ford", "Mustang", 2022, 45000.0, 2, "Gasolina");
        Coche coche3 = new Coche("Volkswagen", "Golf", 2025, 30000.0, 5, "Diesel");
        
        Moto moto1 = new Moto("Honda", "CBR600RR", 2021, 12000.0, 600, "4 tiempos");
        Moto moto2 = new Moto("Yamaha", "MT-07", 2025, 8000.0, 689, "2 tiempos");
        Moto moto3 = new Moto("Kawasaki", "Ninja 400", 2023, 9000.0, 399, "4 tiempos");

        // Mostrar información de los vehículos
        System.out.println("=== Informacion de los coches ===");
        coche1.mostrar_info();
        System.out.println();
        coche2.mostrar_info();
        System.out.println();
        coche3.mostrar_info();
        
        System.out.println("\n=== Informacion de las motos ===");
        moto1.mostrar_info();
        System.out.println();
        moto2.mostrar_info();
        System.out.println();
        moto3.mostrar_info();

        // c) Mostrar coches con más de 4 puertas
        System.out.println("\n=== Coches con mas de 4 puertas ===");
        Coche[] coches = {coche1, coche2, coche3};
        for (Coche coche : coches) {
            if (coche.getNumPuertas() > 4) {
                coche.mostrar_info();
                System.out.println();
            }
        }

        // d) Mostrar coches y motos actuales (gestión 2025)
        System.out.println("\n=== Vehiculos del anio 2025 ===");
        Vehiculo[] vehiculos = {coche1, coche2, coche3, moto1, moto2, moto3};
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getAño() == 2025) {
                vehiculo.mostrar_info();
                System.out.println();
            }
        }
    }
}
