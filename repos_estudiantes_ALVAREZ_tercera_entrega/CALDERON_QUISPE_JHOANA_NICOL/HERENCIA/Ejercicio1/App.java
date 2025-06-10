package Ejercicio1;

public class App {
    public static void main(String[] args) {
        Coche c1 = new Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina");
        Coche c2 = new Coche("Chevrolet", "TrailBlazer", 2023, 28000, 5, "Diesel");
        Moto m1 = new Moto("Honda", "CBR500R", 2025, 7500, 500, "4T");
        Moto m2 = new Moto("Yamaha", "FZ16", 2022, 3200, 160, "2T");

        c1.mostrarInfo();
        System.out.println();
        c2.mostrarInfo();
        System.out.println();
        m1.mostrarInfo();
        System.out.println();
        m2.mostrarInfo();
        System.out.println();

        Coche[] coches = { c1, c2 };
        for (Coche coche : coches) {
            if (coche.getNumPuertas() > 4) {
                coche.mostrarInfo();
                System.out.println();
            }
        }
        Vehiculo[] vehiculos = { c1, c2, m1, m2 };
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == 2025) {
                v.mostrarInfo();
                System.out.println();
            }
        }
    }
}
