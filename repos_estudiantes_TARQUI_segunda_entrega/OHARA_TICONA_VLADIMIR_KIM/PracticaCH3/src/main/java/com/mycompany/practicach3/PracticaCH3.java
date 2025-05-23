/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicach3;
import java.util.*;
public class PracticaCH3 {

    public static void main(String[] args) {
        ArrayList<Gerente> gerentes = new ArrayList<>();
        ArrayList<Desarrollador> desarrolladores = new ArrayList<>();

        gerentes.add(new Gerente("Ana", "Ramírez", 3000, 10, "Ventas", 1200));
        gerentes.add(new Gerente("Carlos", "Mendoza", 3200, 8, "Finanzas", 900));

        desarrolladores.add(new Desarrollador("Luis", "Pérez", 2500, 5, "Java", 12));
        desarrolladores.add(new Desarrollador("María", "Gómez", 2400, 4, "Python", 8));

        System.out.println("--- Salarios Calculados ---");
        for (Gerente g : gerentes) g.mostrarInfo();
        for (Desarrollador d : desarrolladores) d.mostrarInfo();

        System.out.println("\n--- Gerentes con bono > $1000 ---");
        for (Gerente g : gerentes) {
            if (g.getBonoGerencial() > 1000) g.mostrarInfo();
        }

        System.out.println("\n--- Desarrolladores con más de 10 horas extras ---");
        for (Desarrollador d : desarrolladores) {
            if (d.getHorasExtras() > 10) d.mostrarInfo();
        }
    }
}
