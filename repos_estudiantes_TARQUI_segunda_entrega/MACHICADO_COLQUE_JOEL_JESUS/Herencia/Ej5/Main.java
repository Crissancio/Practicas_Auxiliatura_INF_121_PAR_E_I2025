package Herencia.Ej5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Gerente> gerentes = new ArrayList<>();
        List<Desarrollador> desarrolladores = new ArrayList<>();
// INCISO B
        // Instancias de gerentes
        gerentes.add(new Gerente("Ana", "Lopez", 4000, 5, "TI", 1200));
        gerentes.add(new Gerente("Carlos", "Ruiz", 3500, 3, "Marketing", 900));

        // Instancias de desarrolladores
        desarrolladores.add(new Desarrollador("Luis", "Perez", 3000, 2, "Java", 12));
        desarrolladores.add(new Desarrollador("Marta", "Gomez", 3200, 4, "Python", 8));

        System.out.println("=== Sueldos Calculados ===");
        for (Gerente g : gerentes) {
            System.out.println("Gerente: " + g.getNombreCompleto() + " - Salario: $" + g.calcularSalario());
        }
        for (Desarrollador d : desarrolladores) {
            System.out.println("Dev: " + d.getNombreCompleto() + " - Salario: $" + d.calcularSalario());
        }
// INCISO C
        System.out.println("\n=== Gerentes con bono > 1000 ===");
        for (Gerente g : gerentes) {
            if (g.getBonoGerencial() > 1000) {
                System.out.println(g.getNombreCompleto() + " - Bono: $" + g.getBonoGerencial());
            }
        }
// INCISO D
        System.out.println("\n=== Desarrolladores con +10 horas extras ===");
        for (Desarrollador d : desarrolladores) {
            if (d.getHorasExtras() > 10) {
                System.out.println(d.getNombreCompleto() + " - Horas Extra: " + d.getHorasExtras());
            }
        }
    }
}
