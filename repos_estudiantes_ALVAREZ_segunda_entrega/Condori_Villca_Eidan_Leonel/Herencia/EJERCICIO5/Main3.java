package Herencia;

public class Main3 {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Jorge", "Castro", 6000, 12, "Recursos Humanos", 1200);
        Gerente g2 = new Gerente("Sofia", "Mendoza", 5500, 7, "Operaciones", 900);
        Gerente g3 = new Gerente("Lucia", "Torres", 5200, 10, "IT", 1600);

        Desarrollador d1 = new Desarrollador("Pedro", "Rojas", 4500, 4, "Java", 15);
        Desarrollador d2 = new Desarrollador("Carla", "Vega", 4700, 6, "C++", 9);
        Desarrollador d3 = new Desarrollador("Erick", "Rivera", 4600, 5, "Python", 12);
        System.out.println("=== Salarios ===");
        System.out.println("Gerente 1: " + g1.calcular_salario());
        System.out.println("Gerente 2: " + g2.calcular_salario());
        System.out.println("Gerente 3: " + g3.calcular_salario());

        System.out.println("Desarrollador 1: " + d1.calcular_salario());
        System.out.println("Desarrollador 2: " + d2.calcular_salario());
        System.out.println("Desarrollador 3: " + d3.calcular_salario());
        System.out.println("\n=== Gerentes con bono > 1000 ===");
        Gerente[] gerentes = {g1, g2, g3};
        for (int i = 0; i < gerentes.length; i++) {
            if (gerentes[i].getBono_gerencial() > 1000) {
                System.out.println(gerentes[i].getNombre() + " " + gerentes[i].getApellido()
                        + " - Bono: " + gerentes[i].getBono_gerencial());
            }
        }
        System.out.println("\n=== Desarrolladores con más de 10 horas extras ===");
        Desarrollador[] desarrolladores = {d1, d2, d3};
        for (int i = 0; i < desarrolladores.length; i++) {
            if (desarrolladores[i].getHoras_extras() > 10) {
                System.out.println(desarrolladores[i].getNombre() + " " + desarrolladores[i].getApellido()
                        + " - Horas extras: " + desarrolladores[i].getHoras_extras());
            }
        }
    }
}
