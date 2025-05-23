package HERENCIA.EJER_1;
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2020, 25000, 4, "Gasolina");
        Coche coche2 = new Coche("Ford", "F-150", 2023, 45000, 2, "Diesel");
        Coche coche3 = new Coche("Chevrolet", "Spark", 2025, 18000, 5, "Gasolina");
        Moto moto1 = new Moto("Honda", "CBR600", 2021, 12000, 600, "4-tiempos");
        Moto moto2 = new Moto("Yamaha", "MT-07", 2025, 15000, 700, "4-tiempos");
       //B) Mostrar informacion de los vehiculos mostrarinfo
        System.out.println("=== Informacion de vehiculos ===");
        coche1.mostrarInfo();
        System.out.println("-------------------");
        coche2.mostrarInfo();
       
        System.out.println("-------------------");
        coche3.mostrarInfo();
        
        //C) Mostrar coches con mas de 4 puertas
        System.out.println("\n=== Coches con mas de 4 puertas ===");
        Coche[] coches = {coche1, coche2, coche3};
        for (Coche coche : coches) {
            if (coche.getNumPuertas() > 4) {
                coche.mostrarInfo();
                System.out.println("-------------------");
            }
        }
        //D) Mostrar vehiculos de gestion 2025
        System.out.println("\n=== Vehiculos de gestion 2025 ===");
        Vehiculo[] vehiculos = {coche1, coche2, coche3, moto1, moto2};
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getAño() == 2025) {
                vehiculo.mostrarInfo();
                System.out.println("-------------------");
            }
        }
    }
    
}
