import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Desarrollador> desarrolladores = new ArrayList<>();
    static List<Gerente> gerentes = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("b) Crea instancias de Gerente y Desarrollador y muestra su salario calculado.");
        gerentes.add(new Gerente("Shigueru", "Miyamoto", 3600.00f, 30, "Desarrollo", 1500.00f));
        gerentes.add(new Gerente("Mauricio", "Carrasco", 1000.00f, 30, "Sonido", 985.59f));
        gerentes.add(new Gerente("Fernando", "Velazco", 900.00f, 30, "Arte", 900.56f));

        desarrolladores.add(new Desarrollador("Crisver Emanuel", "Chura Garcia", 1500, 0, "Java", 15));
        desarrolladores.add(new Desarrollador("Erick Alexander", "Huanca Calle", 1400, 3, "Python", 15));
        desarrolladores.add(new Desarrollador("Andres Edgar", "Laura Huallpa", 1620, 5, "C++", 7));
        desarrolladores.add(new Desarrollador("Jhosep", "Smith", 1564, 20, "C#", 2));
        desarrolladores.add(new Desarrollador("Michael", "Jackson", 1230, 25, "Ruby", 6));

        for (Gerente gerente : gerentes) {
            System.out.println("Gerente " + gerente.getNombre() + " - Salario: " + gerente.calcular_salario());
        }

        for (Desarrollador desarrollador : desarrolladores) {
            System.out.println(
                    "Desarrollador " + desarrollador.getNombre() + " - Salario: " + desarrollador.calcular_salario());
        }

        System.out.println("\nc) Muestra todos los gerentes que tienen un bono gerencial mayor a 1000.");
        for (Gerente gerente : gerentes) {
            if (gerente.getBono_gerencial() > 1000.00f) {
                System.out.println(gerente.getNombre() + " " + gerente.getApellido());
            }
        }

        System.out.println("\nd) Muestra todos los desarrolladores que trabajan más de 10 horas extras.");
        for (Desarrollador des : desarrolladores) {
            if (des.getHoras_extras() > 10) {
                System.out.println(des.getNombre() + " " + des.getApellido());
            }
        }
    }
}