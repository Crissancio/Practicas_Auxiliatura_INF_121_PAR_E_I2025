import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Gerente> gerentes = new ArrayList<>();
        gerentes.add(new Gerente("Ana", "Lopez", 3000, 10, "TI", 1200));
        gerentes.add(new Gerente("Luis", "Perez", 2800, 5, "Ventas", 800));

        List<Desarrollador> desarrolladores = new ArrayList<>();
        desarrolladores.add(new Desarrollador("Carlos", "Diaz", 2500, 4, "Java", 12));
        desarrolladores.add(new Desarrollador("Maria", "Gomez", 2400, 3, "Python", 8));

        System.out.println("Salario de gerentes:");
        for (Gerente g : gerentes) {
            System.out.println(g.getNombre() + " " + g.getApellido() + ": " + g.calcular_salario());
        }

        System.out.println("\nSalario de desarrolladores:");
        for (Desarrollador d : desarrolladores) {
            System.out.println(d.getNombre() + " " + d.getApellido() + ": " + d.calcular_salario());
        }

        System.out.println("\nGerentes con bono mayor a 1000:");
        for (Gerente g : gerentes) {
            if (g.getBono_gerencial() > 1000) {
                System.out.println(g.getNombre() + " " + g.getApellido());
            }
        }

        System.out.println("\nDesarrolladores con mas de 10 horas extras:");
        for (Desarrollador d : desarrolladores) {
            if (d.getHoras_extras() > 10) {
                System.out.println(d.getNombre() + " " + d.getApellido());
            }
        }
    } 
}
