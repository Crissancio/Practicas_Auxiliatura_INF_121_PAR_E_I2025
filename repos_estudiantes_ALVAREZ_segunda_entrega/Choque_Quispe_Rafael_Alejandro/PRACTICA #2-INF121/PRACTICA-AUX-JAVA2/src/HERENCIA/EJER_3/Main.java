package HERENCIA.EJER_3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Crear lista de estudiantes
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("123456", "Juan", "Perez", "77711111", 
            LocalDate.of(1995, 5, 15), "123456789", LocalDate.now(), 5));
        estudiantes.add(new Estudiante("654321", "Maria", "Lopez", "77722222", 
            LocalDate.of(2000, 8, 20), "987654321", LocalDate.now(), 3));
        estudiantes.add(new Estudiante("789012", "Carlos", "Garcia", "77733333", 
            LocalDate.of(1990, 3, 10), "456123789", LocalDate.now(), 7));

        // Crear lista de docentes
        List<Docente> docentes = new ArrayList<>();
        docentes.add(new Docente("321654", "Pedro", "Martinez", "77744444", 
            LocalDate.of(1980, 7, 25), "123", "ingeniero", "Sistemas"));
        docentes.add(new Docente("987123", "Ana", "Garcia", "77755555", 
            LocalDate.of(1975, 11, 30), "456", "licenciada", "Educacion"));
        docentes.add(new Docente("456789", "Luis", "Perez", "77766666", 
            LocalDate.of(1985, 2, 18), "789", "ingeniero", "Informatica"));

        //C) Estudiantes mayores de 25 años
        System.out.println("=== Estudiantes mayores de 25 anos ===");
        for (Estudiante est : estudiantes) {
            if (est.calcularEdad() > 25) {
                est.mostrar();
                System.out.println("-------------------");
            }
        }
        //D) Docente ingeniero, masculino y mayor
        System.out.println("\n=== Docente ingeniero, masculino y mayor ===");
        Docente mayorDocente = null;
        for (Docente doc : docentes) {
            if (doc.getProfesion().equalsIgnoreCase("ingeniero") && 
                doc.getNombre().endsWith("o")) { // Asumiendo que nombres masculinos terminan con "o"
                if (mayorDocente == null || doc.getFechaNac().isBefore(mayorDocente.getFechaNac())) {
                    mayorDocente = doc;
                }
            }
        }
        if (mayorDocente != null) {
            mayorDocente.mostrar();
        } else {
            System.out.println("No se encontro docente que cumpla los requisitos");
        }
        //E) Personas con mismo apellido
        System.out.println("\n=== Personas con mismo apellido ===");
        for (Estudiante est : estudiantes) {
            for (Docente doc : docentes) {
                if (est.getApellido().equalsIgnoreCase(doc.getApellido())) {
                    System.out.println("Estudiante y Docente con apellido " + est.getApellido() + ":");
                    est.mostrar();
                    System.out.println("---");
                    doc.mostrar();
                    System.out.println("-------------------");
                }
            }
        }
    }

}
