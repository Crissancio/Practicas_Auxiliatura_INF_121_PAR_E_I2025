package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina");
        Coche coche2 = new Coche("Honda", "Civic", 2025, 22000, 5, "Híbrido");
        Moto moto1 = new Moto("Yamaha", "R6", 2025, 15000, 600, "2T");

        System.out.println("Información de los vehículos:");
        coche1.mostrarInfo();
        coche2.mostrarInfo();
        moto1.mostrarInfo();

        System.out.println("\nCoches con más de 4 puertas:");
        if (coche1.getNumPuertas() > 4) coche1.mostrarInfo();
        if (coche2.getNumPuertas() > 4) coche2.mostrarInfo();
    }
}