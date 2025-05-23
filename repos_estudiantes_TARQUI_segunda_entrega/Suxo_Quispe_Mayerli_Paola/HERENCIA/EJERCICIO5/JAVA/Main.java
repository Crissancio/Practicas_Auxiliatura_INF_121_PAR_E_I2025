import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Gerente> gerentes = new ArrayList<>();
        ArrayList<Desarrollador> desarrolladores = new ArrayList<>();

        // Instancias
        gerentes.add(new Gerente("Luis", "Torres", 3000, 5, "TI", 1500));
        gerentes.add(new Gerente("Ana", "Gómez", 2800, 3, "RRHH", 800));

        desarrolladores.add(new Desarrollador("Carlos", "López", 2500, 2, "Java", 12));
        desarrolladores.add(new Desarrollador("Marta", "Fernández", 2600, 1, "Python", 8));

        // b) Mostrar salarios
        System.out.println("--- Salarios Calculados ---");
        for (Gerente g : gerentes) g.mostrar();
        for (Desarrollador d : desarrolladores) d.mostrar();

        // c) Gerentes con bono > 1000
        System.out.println("\n--- Gerentes con bono > 1000 ---");
        for (Gerente g : gerentes) {
            if (g.getBonoGerencial() > 1000) g.mostrar();
        }

        // d) Desarrolladores con más de 10 horas extra
        System.out.println("\n--- Desarrolladores con >10 horas extra ---");
        for (Desarrollador d : desarrolladores) {
            if (d.getHorasExtras() > 10) d.mostrar();
        }
    }
}
