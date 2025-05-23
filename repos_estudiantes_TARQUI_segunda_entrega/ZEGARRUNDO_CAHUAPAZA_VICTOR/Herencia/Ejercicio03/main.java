package Herencia3;

public class main {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Carlos", "López", 5000, 10, "Finanzas", 1200);
        Gerente gerente2 = new Gerente("Ana", "Martínez", 4800, 5, "Recursos Humanos", 900);

        Desarrollador dev1 = new Desarrollador("Luis", "Pérez", 4000, 3, "Java", 12);
        Desarrollador dev2 = new Desarrollador("María", "Gómez", 4200, 2, "Python", 8);

        Gerente[] gerentes = { gerente1, gerente2 };
        Desarrollador[] desarrolladores = { dev1, dev2 };

        System.out.println("Salarios de Gerentes:");
        for (Gerente g : gerentes) {
            g.mostrarInfo();
            System.out.println("Salario Total: " + g.calcularSalario());
            System.out.println();
        }

        System.out.println("Salarios de Desarrolladores:");
        for (Desarrollador d : desarrolladores) {
            d.mostrarInfo();
            System.out.println("Salario Total: " + d.calcularSalario());
            System.out.println();
        }

        System.out.println("Gerentes con bono gerencial > 1000:");
        for (Gerente g : gerentes) {
            if (g.getBonoGerencial() > 1000) {
                g.mostrarInfo();
                System.out.println();
            }
        }

        System.out.println("Desarrolladores con más de 10 horas extras:");
        for (Desarrollador d : desarrolladores) {
            if (d.getHorasExtras() > 10) {
                d.mostrarInfo();
                System.out.println();
            }
        }
    }
}