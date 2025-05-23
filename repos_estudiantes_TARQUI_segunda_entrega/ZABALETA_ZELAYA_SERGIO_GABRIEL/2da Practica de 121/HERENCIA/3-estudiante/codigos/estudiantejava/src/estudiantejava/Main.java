package estudiantejava;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        List<Docente> docentes = new ArrayList<>();

        // Crear estudiantes
        estudiantes.add(new Estudiante("123456", "Juan", "Perez", "77712345", "15/05/1995", "Masculino", "123456789", "10/02/2020", 6));
        estudiantes.add(new Estudiante("654321", "Maria", "Gomez", "77754321", "20/10/2000", "Femenino", "987654321", "05/08/2021", 4));

        // Crear docentes
        docentes.add(new Docente("987654", "Carlos", "Lopez", "77798765", "12/03/1980", "Masculino", "987654321", "Ingeniero", "Sistemas"));
        docentes.add(new Docente("456789", "Ana", "Gomez", "77745678", "25/11/1975", "Femenino", "456789123", "Licenciada", "Educación"));

        // c) Mostrar estudiantes mayores de 25 años
        System.out.println("=== ESTUDIANTES MAYORES DE 25 AÑOS ===");
        for (Estudiante est : estudiantes) {
            if (est.calcularEdad() > 25) {
                est.mostrarInfo();
                System.out.println("---------------------");
            }
        }

        // d) Mostrar docente "Ingeniero", masculino y mayor de todos
        System.out.println("=== DOCENTE INGENIERO MASCULINO (MAYOR) ===");
        Docente docenteMayor = null;
        for (Docente doc : docentes) {
            if (doc.profesion.equals("Ingeniero") && doc.sexo.equals("Masculino")) {
                if (docenteMayor == null || doc.calcularEdad() > docenteMayor.calcularEdad()) {
                    docenteMayor = doc;
                }
            }
        }
        if (docenteMayor != null) {
            docenteMayor.mostrarInfo();
        } else {
            System.out.println("No se encontró al docente con esos criterios.");
        }

        // e) Mostrar estudiantes y docentes con mismo apellido
        System.out.println("=== PERSONAS CON MISMO APELLIDO ===");
        for (Estudiante est : estudiantes) {
            for (Docente doc : docentes) {
                if (est.apellido.equals(doc.apellido)) {
                    System.out.println("Estudiante y Docente con apellido " + est.apellido + ":");
                    est.mostrarInfo();
                    System.out.println("-----");
                    doc.mostrarInfo();
                    System.out.println("---------------------");
                }
            }
        }
    }
}