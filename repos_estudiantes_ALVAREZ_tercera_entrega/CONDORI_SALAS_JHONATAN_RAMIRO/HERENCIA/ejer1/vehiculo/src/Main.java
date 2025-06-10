public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2022, 15000, 4, "Gasolina");
        Coche coche2 = new Coche("Ford", "Fiesta", 2021, 12000, 2, "Diesel");
        Moto moto1 = new Moto("Honda", "CBR500R", 2025, 8000, "500cc", "4T");
        Moto moto2 = new Moto("Yamaha", "FZ25", 2025, 7000, "250cc", "4T");

        System.out.println("COCHES:");
        System.out.println(coche1.mostrarInfo());
        System.out.println(coche2.mostrarInfo());

        System.out.println("\nMOTOS:");
        System.out.println(moto1.mostrarInfo());
        System.out.println(moto2.mostrarInfo());

        System.out.println("\nCoches con más de 4 puertas:");
        Coche[] coches = {coche1, coche2};
        for (Coche c : coches) {
            if (c.getNumPuertas() > 4) {
                System.out.println(c.mostrarInfo());
            } else {
                System.out.println(c.getMarca() + " " + c.getModelo() + " no tiene más de 4 puertas.");
            }
        }
        System.out.println("\nVehículos del año 2025:");
        Vehiculo[] vehiculos = {coche1, coche2, moto1, moto2};
        for (Vehiculo v : vehiculos) {
            if (v.getAnio() == 2025) {
                System.out.println(v.mostrarInfo());
            }
        }
    }
}