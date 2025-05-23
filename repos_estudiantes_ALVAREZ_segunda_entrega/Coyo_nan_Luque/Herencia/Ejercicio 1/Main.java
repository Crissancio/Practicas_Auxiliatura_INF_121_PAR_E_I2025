public class Main {
    public static void main(String[] args) {
        // Crear instancias de Coche
        Coche coche1 = new Coche("Toyota", "V69", 2021, 25000.0, 4, "Gasolina");
        Coche coche2 = new Coche("Chevrolet", "C24", 2025, 28000.0, 5, "Electrico");
        Coche coche3 = new Coche("Lamborghini", "M21", 2022, 35000.0, 5, "Gasolina");
        Coche coche4 = new Coche("Suzuki", "TC-21", 2025, 27000.0, 4, "Diesel");

        Moto moto1 = new Moto("Scooter", "MD23", 2025, 8000.0, 452, "MonoCilindrico");
        Moto moto2 = new Moto("Honda", "BT32", 2020, 7000.0, 562, "Bicilindrico");
        Moto moto3 = new Moto("Ducati", "Ninja 400", 2024, 6000.0, 419, "Tricilindrico");

        System.out.println("Info Coches:");
        System.out.println(coche1.mostrarInfo());
        System.out.println(coche2.mostrarInfo());
        System.out.println(coche3.mostrarInfo());
        System.out.println(coche4.mostrarInfo());

        System.out.println("\nInfo Motos:");
        System.out.println(moto1.mostrarInfo());
        System.out.println(moto2.mostrarInfo());
        System.out.println(moto3.mostrarInfo());

        Coche[] coches = {coche1, coche2, coche3, coche4};
        Coche.mostrarCuatroPuertas(coches);

        Vehiculo[] vehiculos = {coche1, coche2, coche3, coche4, moto1, moto2, moto3};
        Vehiculo.mostrarAnio2025(vehiculos);
    }
}