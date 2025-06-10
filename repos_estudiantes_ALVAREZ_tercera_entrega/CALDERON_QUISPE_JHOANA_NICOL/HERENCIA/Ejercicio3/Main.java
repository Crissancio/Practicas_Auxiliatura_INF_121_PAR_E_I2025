import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Rafael", "Calderon", 5000, 4, "Marketing", 1500);
        Desarrollador desarrollador1 = new Desarrollador("Jhoana", "Calderon", 4000, 3, "Python", 12);

        System.out.println("Gerente:");
        gerente1.mostrar();

        System.out.println("\nDesarrollador:");
        desarrollador1.mostrar();

        ArrayList<Gerente> gerentes = new ArrayList<>();
        gerentes.add(gerente1);
        gerentes.add(new Gerente("Zulema", "Gomez", 4800, 2, "Finanzas", 900));
        gerentes.add(new Gerente("Marcos", "Castro", 5100, 5, "Ventas", 1100));

        System.out.println("\nGerentes con bono gerencial mayor a 1000:");
        for (Gerente g : gerentes) {
            if (g.getBonoGerencial() > 1000) {
                g.mostrar();
            }
        }

        ArrayList<Desarrollador> desarrolladores = new ArrayList<>();
        desarrolladores.add(desarrollador1);
        desarrolladores.add(new Desarrollador("Nils", "Torres", 3800, 2, "Java", 8));
        desarrolladores.add(new Desarrollador("Diego", "Ramos", 4200, 4, "C++", 15));

        System.out.println("\nDesarrolladores con más de 10 horas extras:");
        for (Desarrollador d : desarrolladores) {
            if (d.getHorasExtras() > 10) {
                d.mostrar();
            }
        }
    }
}
