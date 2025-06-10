
package ejercicio2;
import java.time.LocalDate;
import java.util.ArrayList;
public class Ejercicio2 {

    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Docente> docentes = new ArrayList<>();

        estudiantes.add(new Estudiante("123", "Ana", "Perez", "789123", LocalDate.of(1995, 5, 10), "RU01", LocalDate.of(2020, 2, 1), 8));
        estudiantes.add(new Estudiante("124", "Luis", "Lopez", "456789", LocalDate.of(2004, 3, 15), "RU02", LocalDate.of(2023, 1, 1), 2));
        estudiantes.add(new Estudiante("125", "Carlos", "Gomez", "456123", LocalDate.of(1996, 4, 22), "RU03", LocalDate.of(2019, 3, 1), 10));

        docentes.add(new Docente("201", "Mario", "Lopez", "123456", LocalDate.of(1980, 1, 10), "NIT01", "Ingeniero", "Software", "M"));
        docentes.add(new Docente("202", "Laura", "Perez", "654321", LocalDate.of(1985, 6, 20), "NIT02", "Matematico", "Estadistica", "F"));
        docentes.add(new Docente("203", "Pedro", "Gomez", "321654", LocalDate.of(1975, 12, 5), "NIT03", "Ingeniero", "Sistemas", "M"));

        // c) Mostrar estudiantes mayores de 25 años
        System.out.println("=== Estudiantes mayores de 25 anos ===");
        for (Estudiante e : estudiantes) {
            if (e.getEdad() > 25) {
                e.mostrar();
                System.out.println("----------------------");
            }
        }

        // d) Mostrar docente con profesion = "Ingeniero", sexo = "M", y el mayor de todos
        Docente mayorIngeniero = null;
        for (Docente d : docentes) {
            if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo().equalsIgnoreCase("M")) {
                if (mayorIngeniero == null || d.getFechaNac().isBefore(mayorIngeniero.getFechaNac())) {
                    mayorIngeniero = d;
                }
            }
        }

        System.out.println("=== Docente Ingeniero mas viejo y masculino ===");
        if (mayorIngeniero != null) {
            mayorIngeniero.mostrar();
        }

        // e) Mostrar estudiantes y docentes que tienen el mismo apellido
        System.out.println("=== Coincidencias de Apellido entre Estudiantes y Docentes ===");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.getApellido().equalsIgnoreCase(d.getApellido())) {
                    System.out.println("Coincidencia de apellido: " + e.getApellido());
                    System.out.println("Estudiante:");
                    e.mostrar();
                    System.out.println("Docente:");
                    d.mostrar();
                    System.out.println("----------------------");
                }
            }
            }
    }
    
}
