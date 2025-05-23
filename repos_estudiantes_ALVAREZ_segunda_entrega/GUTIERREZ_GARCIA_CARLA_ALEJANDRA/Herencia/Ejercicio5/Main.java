import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Gerente
        Gerente gerente1 = new Gerente("Ana", "Gutierrez", 5000, 10, "Ventas", 1200);
        Gerente gerente2 = new Gerente("Luis", "Castaños", 4500, 8, "Marketing", 800);

        // Crear instancias de Desarrollador
        Desarrollador dev1 = new Desarrollador("Carlos", "Amaru", 3000, 5, "Java", 12);
        Desarrollador dev2 = new Desarrollador("Mario", "Costas", 3200, 6, "Python", 8);

        // Calcular y mostrar salarios
        System.out.println("Salarios calculados:");
        System.out.println("Gerente 1: " + gerente1.calcular_salario());
        System.out.println("Gerente 2: " + gerente2.calcular_salario());
        System.out.println("Desarrollador 1: " + dev1.calcular_salario());
        System.out.println("Desarrollador 2: " + dev2.calcular_salario());

        ArrayList<Gerente> gerentes = new ArrayList<>();
        gerentes.add(gerente1);
        gerentes.add(gerente2);

        ArrayList<Desarrollador> desarrolladores = new ArrayList<>();
        desarrolladores.add(dev1);
        desarrolladores.add(dev2);

        // Mostrar gerentes con bono gerencial mayor a 1000
        System.out.println("\nGerentes con bono gerencial mayor a 1000:");
        for (int i = 0; i < gerentes.size(); i++) {
            gerentes.get(i).mostrarSiBonoMayorA(1000);
        }

        // Mostrar desarrolladores con mas de 10 horas extras
        System.out.println("\nDesarrolladores con mas de 10 horas extras:");
        for (int i = 0; i < desarrolladores.size(); i++) {
            desarrolladores.get(i).mostrarSiMasDeNHorasExtras(10);
        }
    }
}