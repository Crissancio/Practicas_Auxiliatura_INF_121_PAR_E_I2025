/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER1;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina");
        Coche coche2 = new Coche("Ford", "Explorer", 2023, 35000, 5, "Diesel");
        Moto moto1 = new Moto("Yamaha", "R3", 2025, 8000, 321, "4 tiempos");

        System.out.println("--- Info de vehiculos ---");
        coche1.mostrarInfo();
        System.out.println();
        coche2.mostrarInfo();
        System.out.println();
        moto1.mostrarInfo();

        System.out.println("\n--- Coches con mas de 4 puertas ---");
        Coche[] coches = {coche1, coche2};
        for (Coche coche : coches) {
            if (coche.getNumPuertas() > 4) {
                coche.mostrarInfo();
            }
        }

        System.out.println("\n--- Vehiculos del 2025 ---");
        Vehiculo[] vehiculos = {coche1, coche2, moto1};
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == 2025) {
                v.mostrarInfo();
            }
        }
    } 
}

