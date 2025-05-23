package herencia;

public class App {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Carlos", "Valdez", 5950, 5, "Finanzas", 1800);
        Desarrollador desarrollador1 = new Desarrollador("Viviana", "Gómez", 4500, 3, "Python", 13);

        System.out.printf("Salario del gerente %s es %.2f Bs.%n", gerente1.getNombreCompleto(), gerente1.calcularSalario());
        System.out.printf("Salario del desarrollador %s es %.2f Bs.%n", desarrollador1.getNombreCompleto(), desarrollador1.calcularSalario());

        Gerente[] gerentes = {
            gerente1,
            new Gerente("Lucía", "Rojas", 4800, 3, "RRHH", 800),
            new Gerente("Mario", "Peña", 5200, 6, "Ventas", 1200)
        };

        System.out.println("\nGerentes con bono gerencial mayor a 1000:");
        for (Gerente g : gerentes) {
            if (g.getBonoGerencial() > 1000) {
                System.out.printf("%s - Bono: %.2f Bs.%n", g.getNombreCompleto(), g.getBonoGerencial());
            }
        }

        Desarrollador[] desarrolladores = {
            desarrollador1,
            new Desarrollador("Luis", "Martínez", 4500, 2, "Java", 8),
            new Desarrollador("Lizeth", "Quispe", 4300, 4, "C#", 15)
        };

        System.out.println("\nDesarrolladores con más de 10 horas extras:");
        for (Desarrollador d : desarrolladores) {
            if (d.getHorasExtras() > 10) {
                System.out.printf("%s - Horas extras: %d%n", d.getNombreCompleto(), d.getHorasExtras());
            }
        }
    }
}
