package ejem5;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Gerente g1 = new Gerente("Ana", "Lopez", 5000, 5, "Marketing", 1200);
        Gerente g2 = new Gerente("Luis", "Mendez", 4500, 2, "Ventas", 800);

        Desarrollador d1 = new Desarrollador("Carlos", "Perez", 4000, 3, "Java", 12);
        Desarrollador d2 = new Desarrollador("Laura", "Ramirez", 4200, 4, "Python", 8);


        System.out.println("Salario de gerente " + g1.getNombre() + ": " + g1.calcularSalario());
        System.out.println("Salario de gerente " + g2.getNombre() + ": " + g2.calcularSalario());

        System.out.println("Salario de desarrollador " + d1.getNombre() + ": " + d1.calcularSalario());
        System.out.println("Salario de desarrollador " + d2.getNombre() + ": " + d2.calcularSalario());


        System.out.println("\nGerentes con bono gerencial mayor a 1000:");
        Gerente[] gerentes = { g1, g2 };
        for (Gerente g : gerentes) {
            if (g.getBonoGerencial() > 1000) {
                System.out.println(g.getNombre() + " " + g.getApellido() + " - Bono: " + g.getBonoGerencial());
            }
        }

        System.out.println("\nDesarrolladores con más de 10 horas extra:");
        Desarrollador[] desarrolladores = { d1, d2 };
        for (Desarrollador d : desarrolladores) {
            if (d.getHorasExtras() > 10) {
                System.out.println(d.getNombre() + " " + d.getApellido() + " - Horas extras: " + d.getHorasExtras());
            }
        }
	}

}
