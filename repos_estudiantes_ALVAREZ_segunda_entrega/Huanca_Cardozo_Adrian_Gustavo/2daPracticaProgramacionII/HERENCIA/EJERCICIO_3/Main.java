package HERENCIA.EJERCICIO_3;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("123", "Ana", "Lopez", "789456", LocalDate.of(1995, 5, 15),
                "RU123", LocalDate.of(2020, 2, 1), 6);
        Estudiante est2 = new Estudiante("124", "Luis", "Garcia", "789457", LocalDate.of(2004, 6, 10),
                "RU124", LocalDate.of(2021, 3, 1), 3);

        Docente doc1 = new Docente("222", "Mario", "Lopez", "77777777", LocalDate.of(1970, 1, 10),
                "NIT789", "Ingeniero", "Sistemas", "M");
        Docente doc2 = new Docente("223", "Claudia", "Garcia", "77777778", LocalDate.of(1980, 4, 20),
                "NIT790", "Licenciada", "Matemáticas", "F");

        List<Estudiante> estudiantes = List.of(est1, est2);
        List<Docente> docentes = List.of(doc1, doc2);

        System.out.println("=== Estudiantes mayores de 25 años ===");
        for (Estudiante e : estudiantes) {
            if (e.getEdad() > 25) {
                e.mostrar();
                System.out.println("------------------");
            }
        }

        Docente mayorIngeniero = null;
        for (Docente d : docentes) {
            if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo().equalsIgnoreCase("M")) {
                if (mayorIngeniero == null || d.getEdad() > mayorIngeniero.getEdad()) {
                    mayorIngeniero = d;
                }
            }
        }

        System.out.println("=== Docente 'Ingeniero', masculino, y mayor ===");
        if (mayorIngeniero != null) {
            mayorIngeniero.mostrar();
        }

        System.out.println("=== Estudiantes y docentes con el mismo apellido ===");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.getApellido().equalsIgnoreCase(d.getApellido())) {
                    System.out.println("Coincidencia de apellido: " + e.getApellido());
                    System.out.println("Estudiante:");
                    e.mostrar();
                    System.out.println("Docente:");
                    d.mostrar();
                    System.out.println("------------------");
                }
            }
        }
    }
}
