package com.mycompany.practicach2;
import java.time.*;
import java.util.*;
public class PracticaCH2 {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Docente> docentes = new ArrayList<>();

        estudiantes.add(new Estudiante("123", "Luis", "Pérez", "7890", LocalDate.of(1998, 5, 10), "M",
                "RU123", LocalDate.of(2020, 3, 1), 6));
        estudiantes.add(new Estudiante("456", "Ana", "Gómez", "6543", LocalDate.of(2004, 1, 15), "F",
                "RU456", LocalDate.of(2022, 2, 15), 3));

        docentes.add(new Docente("789", "Carlos", "Pérez", "9876", LocalDate.of(1975, 8, 20), "M",
                "NIT123", "Ingeniero", "Sistemas"));
        docentes.add(new Docente("321", "Marta", "Gómez", "3210", LocalDate.of(1980, 6, 5), "F",
                "NIT456", "Licenciada", "Matemáticas"));

        System.out.println("\nEstudiantes mayores de 25 años:");
        for (Estudiante e : estudiantes) {
            if (e.calcularEdad() > 25) {
                e.mostrarInfo();
            }
        }

        Docente mayorIngeniero = null;
        for (Docente d : docentes) {
            if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo().equalsIgnoreCase("M")) {
                if (mayorIngeniero == null || d.calcularEdad() > mayorIngeniero.calcularEdad()) {
                    mayorIngeniero = d;
                }
            }
        }
        if (mayorIngeniero != null) {
            System.out.println("\nDocente hombre Ingeniero más viejo:");
            mayorIngeniero.mostrarInfo();
        }

        System.out.println("\nPersonas con el mismo apellido:");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.getApellido().equalsIgnoreCase(d.getApellido())) {
                    System.out.println("Coincidencia de apellido: " + e.getApellido());
                    e.mostrarInfo();
                    d.mostrarInfo();
                    System.out.println("----------");
                }
            }
        }
    }
}
