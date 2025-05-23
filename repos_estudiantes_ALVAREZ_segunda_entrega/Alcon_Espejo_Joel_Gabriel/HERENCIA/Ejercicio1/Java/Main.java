public class Main {
    public static void main(String[] args) {
        
        Coche coche1 = new Coche("Toyota", "Corolla", 2020, 25000, 4, "Gasolina");
        Coche coche2 = new Coche("Ford", "F-150", 2023, 45000, 2, "Diésel");
        Coche coche3 = new Coche("Honda", "Civic", 2025, 28000, 5, "Híbrido");
        
        Moto moto1 = new Moto("Harley-Davidson", "Sportster", 2022, 12000, 1200, "V-Twin");
        Moto moto2 = new Moto("Yamaha", "MT-07", 2025, 8500, 689, "Bicilíndrico");

        
        System.out.println("=== Información de todos los vehículos ===");
        coche1.mostrarInfo();
        coche2.mostrarInfo();
        coche3.mostrarInfo();
        moto1.mostrarInfo();
        moto2.mostrarInfo();

       
        System.out.println("\n=== Coches con más de 4 puertas ===");
        Coche[] coches = {coche1, coche2, coche3};
        for (Coche coche : coches) {
            if (coche.getNumPuertas() > 4) {
                coche.mostrarInfo();
            }
        }

      
        System.out.println("\n=== Vehículos del año actual (2025) ===");
        Vehiculo[] vehiculos = {coche1, coche2, coche3, moto1, moto2};
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getAño() == 2025) {
                vehiculo.mostrarInfo();
            }
        }
    }
}