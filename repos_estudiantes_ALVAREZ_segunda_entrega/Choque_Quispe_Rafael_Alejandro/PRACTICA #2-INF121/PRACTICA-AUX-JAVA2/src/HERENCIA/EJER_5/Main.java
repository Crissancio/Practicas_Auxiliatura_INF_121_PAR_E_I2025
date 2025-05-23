package HERENCIA.EJER_5;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Gerente> gerentes = new ArrayList<>();
        gerentes.add(new Gerente("Carlos", "Gomez", 5000, 5, "TI", 1500));
        gerentes.add(new Gerente("Maria", "Lopez", 6000, 8, "RRHH", 800));
        gerentes.add(new Gerente("Juan", "Perez", 7000, 10, "Finanzas", 1200));
        List<Desarrollador> desarrolladores = new ArrayList<>();
        desarrolladores.add(new Desarrollador("Ana", "Martinez", 3000, 3, "Java", 15));
        desarrolladores.add(new Desarrollador("Luis", "Garcia", 3500, 4, "Python", 8));
        desarrolladores.add(new Desarrollador("Pedro", "Sanchez", 4000, 6, "C++", 12));
        //B) Mostrar salarios calculados
        System.out.println("=== Salarios calculados ===");
        for (Gerente ger : gerentes) {
            System.out.println("Gerente " + ger.getNombre() + ": $" + ger.calcularSalario());
        }
        for (Desarrollador dev : desarrolladores) {
            System.out.println("Desarrollador " + dev.getNombre() + ": $" + dev.calcularSalario());
        }
        //C) Gerentes con bono > 1000
        System.out.println("\n=== Gerentes con bono gerencial > 1000 ===");
        for (Gerente ger : gerentes) {
            if (ger.getBonoGerencial() > 1000) {
                System.out.println(ger.getNombre() + " " + ger.getApellido() + 
                                 " - Bono: $" + ger.getBonoGerencial());
            }
        }
        //D) Desarrolladores con >10 horas extras
        System.out.println("\n=== Desarrolladores con mas de 10 horas extras ===");
        for (Desarrollador dev : desarrolladores) {
            if (dev.getHorasExtras() > 10) {
                System.out.println(dev.getNombre() + " " + dev.getApellido() + 
                                 " - Horas extras: " + dev.getHorasExtras());
            }
        }
    }
}
