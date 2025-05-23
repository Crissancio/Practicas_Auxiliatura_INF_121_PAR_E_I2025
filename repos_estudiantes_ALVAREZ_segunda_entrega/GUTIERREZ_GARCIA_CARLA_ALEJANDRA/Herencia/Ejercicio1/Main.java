package HERENCIA.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Moto y Coche
        Moto moto1 = new Moto("Yamaha", "MT-07", 2023, 7500.0f, "Deportiva", 689);
        Moto moto2 = new Moto("Honda", "CB500X", 2025, 8000.0f, "Adventure", 471);
        Coche coche1 = new Coche("Toyota", "Corolla", 2022, 20000.0f, 4, "Gasolina");
        Coche coche2 = new Coche("Ford", "Explorer", 2025, 35000.0f, 5, "Diesel");

        // Mostrar información de todos los vehiculos
        System.out.println("Información de todos los vehículos:");
        moto1.mostrar_info();
        moto2.mostrar_info();
        coche1.mostrar_info();
        coche2.mostrar_info();

        // Mostrar coches con más de 4 puertas
        System.out.println("Coches con más de 4 puertas:");
        coche1.mostrar_puertas();
        coche2.mostrar_puertas();

        // Mostrar vehiculos actuales
        System.out.println("\nVehiculos actuales (2025):");
        moto1.mostrar_actual(2025);
        moto2.mostrar_actual(2025);
        coche1.mostrar_actual(2025);
        coche2.mostrar_actual(2025);
    }
}