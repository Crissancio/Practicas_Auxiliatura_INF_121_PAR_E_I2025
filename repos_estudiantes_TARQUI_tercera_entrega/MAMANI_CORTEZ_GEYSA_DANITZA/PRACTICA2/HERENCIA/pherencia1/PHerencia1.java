/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pherencia1;

/**
 *
 * @author Administrador
 */
public class PHerencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2022, 20000, 4, "Gasolina");
        Moto moto1 = new Moto("Mercedes", "MT-03", 2021, 7500, 321, "4 tiempos");

        System.out.println("=== Información del Coche ===");
        coche1.mostrar_info();

        System.out.println("\n=== Información de la Moto ===");
        moto1.mostrar_info();
    }
    
}
