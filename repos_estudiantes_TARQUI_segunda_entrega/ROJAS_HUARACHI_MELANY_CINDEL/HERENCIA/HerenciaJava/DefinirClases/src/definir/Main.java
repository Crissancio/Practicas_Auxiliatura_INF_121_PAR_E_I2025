package definir;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        List<Docente> docentes = new ArrayList<>();

        Calendar cal = Calendar.getInstance();

        // Estudiantes
        cal.set(1998, Calendar.JUNE, 10);
        estudiantes.add(new Estudiante("123", "Ana", "Perez", "12345", cal.getTime(),
                "RU001", new Date(), 5));

        cal.set(2004, Calendar.APRIL, 20);
        estudiantes.add(new Estudiante("456", "Luis", "Gomez", "67890", cal.getTime(),
                "RU002", new Date(), 2));

        // Docentes
        cal.set(1975, Calendar.JANUARY, 5);
        docentes.add(new Docente("789", "Carlos", "Gomez", "54321", cal.getTime(),
                "NIT001", "Ingeniero", "Sistemas", "Masculino"));

        cal.set(1980, Calendar.MARCH, 12);
        docentes.add(new Docente("101", "Maria", "Perez", "12321", cal.getTime(),
                "NIT002", "Licenciada", "Matemáticas", "Femenino"));

        // (c) Estudiantes mayores de 25 años
        System.out.println("\nEstudiantes mayores de 25:");
        for (Estudiante e : estudiantes) {
            if (e.edad() > 25)
                e.mostrar();
        }

        // (d) Docente ingeniero, masculino y mayor
        System.out.println("\nDocente Ingeniero, Masculino y Mayor:");
        Docente mayor = null;
        for (Docente d : docentes) {
            if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo().equalsIgnoreCase("Masculino")) {
                if (mayor == null || d.edad() > mayor.edad()) {
                    mayor = d;
                }
            }
        }
        if (mayor != null)
            mayor.mostrar();

        // (e) Estudiantes y docentes con el mismo apellido
        System.out.println("\nEstudiantes y Docentes con el mismo apellido:");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.getApellido().equalsIgnoreCase(d.getApellido())) {
                    e.mostrar();
                    d.mostrar();
                }
            }
        }
    }
}
