import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Gerente gerente = new Gerente("Juan", "Perez", 3000, 5, "Ventas", 500);
    Gerente gerente2 = new Gerente("Alex", "Nina", 1000, 3, "Despidos", 1500);
    Desarrollador desarrollador = new Desarrollador("Maria", "Gomez", 1500, 2, "Java", 10);
    Desarrollador desarrollador2 = new Desarrollador("Jose", "Limachi", 9000, 10, "Rust", 24);
    
    System.out.println("Salario del gerente: " + gerente.calcularSalario());
    System.out.println("Salario del desarrollador: " + desarrollador.calcularSalario());
    System.out.println("");

    ArrayList<Empleado> empleados = new ArrayList<>();
    empleados.add(gerente);
    empleados.add(gerente2);
    empleados.add(desarrollador);
    empleados.add(desarrollador2);
    
    System.out.println("Gerentes con bono mayor a 1000:");
    gerentesConBonoMayorA1000(empleados);
    System.out.println("");

    System.out.println("Desarrolladores con mas de 10 horas extras:");
    desarroladormas10horasExtra(empleados);

    
    
  }

  public static void gerentesConBonoMayorA1000(List<Empleado> empleados) {
   for (Empleado empleado : empleados) {
     if (empleado instanceof Gerente) {
       Gerente gerente = (Gerente) empleado;
       if (gerente.bonoMayorA1000()) {
         gerente.mostrarInformacion();
       }
     }
   }
  }

  public static void desarroladormas10horasExtra(List<Empleado> empleados) {
    for (Empleado empleado : empleados) {
      if (empleado instanceof Desarrollador) {
        Desarrollador desarrollador = (Desarrollador) empleado;
        if (desarrollador.horasExtrasMayorA10()) {
          desarrollador.mostrarInformacion();
        }
      }
    }
  }
}