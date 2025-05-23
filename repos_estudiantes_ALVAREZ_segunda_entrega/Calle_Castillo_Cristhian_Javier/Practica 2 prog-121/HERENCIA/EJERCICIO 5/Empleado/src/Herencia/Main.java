package Herencia;

public class Main {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Renzo", "Espinoza", 5000, 5, "TI", 1500);
        Desarrollador desarrollador1 = new Desarrollador("Sofía", "López", 4000, 3, "Python", 12);

        System.out.println("Salario del gerente: " + gerente1.calcularSalario());
        System.out.println("Salario del desarrollador: " + desarrollador1.calcularSalario());

        // Gerentes con bono mayor a 1000
        System.out.println("\nGerentes con bono gerencial mayor a 1000:");
        Gerente[] gerentes = {
            gerente1,
            new Gerente("Luis", "Fernandez", 5500, 4, "Contabilidad", 800),
            new Gerente("María", "Cruz", 6000, 6, "Ventas", 1200)
        };

        for (Gerente g : gerentes) {
            if (g.getBonoGerencial() > 1000) {
                System.out.println(g.getNombre() + " " + g.getApellido() + " - Bono: " + g.getBonoGerencial());
            }
        }

        // Desarrolladores con más de 10 horas extras
        System.out.println("\nDesarrolladores con más de 10 horas extras:");
        Desarrollador[] desarrolladores = {
            desarrollador1,
            new Desarrollador("Jorge", "Vega", 4200, 2, "Java", 8),
            new Desarrollador("Elena", "Ríos", 4500, 4, "C++", 15)
        };

        for (Desarrollador d : desarrolladores) {
            if (d.getHorasExtras() > 10) {
                System.out.println(d.getNombre() + " " + d.getApellido() + " - Horas extras: " + d.getHorasExtras());
            }
        }
    }
}

