package defin;

public class Main {
    public static void main(String[] args) {
        // b) Instancias
        Gerente g1 = new Gerente("Ana", "López", 5000, 10, "Finanzas", 1200);
        Desarrollador d1 = new Desarrollador("Luis", "Pérez", 4000, 5, "Python", 12);

        System.out.println("Salario Gerente: " + g1.calcularSalario());
        System.out.println("Salario Desarrollador: " + d1.calcularSalario());

        // c) Gerentes con bono > 1000
        Gerente[] gerentes = {
            g1,
            new Gerente("Carlos", "Ruiz", 4800, 8, "TI", 800),
            new Gerente("Marta", "Gómez", 5200, 7, "Marketing", 1500)
        };

        System.out.println("\nGerentes con bono mayor a 1000:");
        for (Gerente g : gerentes) {
            if (g.getBonoGerencial() > 1000) {
                System.out.println("- " + g.getNombre() + " " + g.getApellido());
            }
        }

        // d) Desarrolladores con > 10 horas extras
        Desarrollador[] desarrolladores = {
            d1,
            new Desarrollador("Clara", "Méndez", 4100, 3, "Java", 8),
            new Desarrollador("Pedro", "Soto", 3900, 6, "C++", 15)
        };

        System.out.println("\nDesarrolladores con más de 10 horas extras:");
        for (Desarrollador d : desarrolladores) {
            if (d.getHorasExtras() > 10) {
                System.out.println("- " + d.getNombre() + " " + d.getApellido());
            }
        }
    }
}
