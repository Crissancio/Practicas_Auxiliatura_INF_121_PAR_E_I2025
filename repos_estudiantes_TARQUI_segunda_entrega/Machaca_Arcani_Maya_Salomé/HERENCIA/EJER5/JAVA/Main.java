/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER5;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Gerente> gerentes = new ArrayList<>();
        gerentes.add(new Gerente("Laura", "Perez", 3000, 10, "Finanzas", 1200));
        gerentes.add(new Gerente("Mario", "Suarez", 2500, 5, "Ventas", 800));

        ArrayList<Desarrollador> desarrolladores = new ArrayList<>();
        desarrolladores.add(new Desarrollador("Ana", "Lopez", 2000, 3, "Python", 15));
        desarrolladores.add(new Desarrollador("Luis", "Gomez", 2200, 4, "Java", 8));

        System.out.println("Salarios de gerentes:");
        for (Gerente g : gerentes) {
            g.mostrar();
            System.out.println("Salario total: " + g.calcularSalario());
            System.out.println();
        }

        System.out.println("Salarios de desarrolladores:");
        for (Desarrollador d : desarrolladores) {
            d.mostrar();
            System.out.println("Salario total: " + d.calcularSalario());
            System.out.println();
        }

        System.out.println("Gerentes con bono gerencial > 1000:");
        for (Gerente g : gerentes) {
            if (g.getBonoGerencial() > 1000) {
                g.mostrar();
                System.out.println();
            }
        }

        System.out.println("Desarrolladores con mas de 10 horas extras:");
        for (Desarrollador d : desarrolladores) {
            if (d.getHorasExtras() > 10) {
                d.mostrar();
                System.out.println();
            }
        }
    }
    
}
