package ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("12345", "Juan", "Perez", "70012345", "1995-05-15", "M", 
                                     "123456", "2020-01-10", 6));
        estudiantes.add(new Estudiante("67890", "Maria", "Gomez", "60098765", "2000-08-20", "F", 
                                     "789012", "2021-03-15", 4));
        estudiantes.add(new Estudiante("54321", "Carlos", "Lopez", "71054321", "1990-11-30", "M", 
                                     "345678", "2019-08-20", 8));
        estudiantes.add(new Estudiante("98765", "Ana", "Gomez", "60011223", "1998-03-10", "F", 
                                     "901234", "2020-02-05", 5));

        List<Docente> docentes = new ArrayList<>();
        docentes.add(new Docente("11223", "Pedro", "Martinez", "72033445", "1985-07-12", "M", 
                                "111222", "Ingeniero", "Sistemas"));
        docentes.add(new Docente("33445", "Luisa", "Gomez", "73055667", "1978-09-25", "F", 
                                "333444", "Licenciada", "Educación"));
        docentes.add(new Docente("55667", "Jorge", "Fernandez", "74077889", "1970-12-05", "M", 
                                "555666", "Ingeniero", "Electrónica"));
        docentes.add(new Docente("77889", "Mario", "Lopez", "75099001", "1965-04-18", "M", 
                                "777888", "Doctor", "Medicina"));

        System.out.println("\nEstudiantes mayores de 25 años:");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.calcularEdad() > 25) {
                estudiante.mostrar();
            }
        }

        List<Docente> docentesIngenierosMasculinos = new ArrayList<>();
        for (Docente docente : docentes) {
            if (docente.getProfesion().equals("Ingeniero") && docente.getSexo().equals("M")) {
                docentesIngenierosMasculinos.add(docente);
            }
        }

        if (!docentesIngenierosMasculinos.isEmpty()) {
            Docente mayor = docentesIngenierosMasculinos.get(0);
            for (Docente docente : docentesIngenierosMasculinos) {
                if (docente.calcularEdad() > mayor.calcularEdad()) {
                    mayor = docente;
                }
            }
            System.out.println("\nDocente Ingeniero masculino más mayor:");
            mayor.mostrar();
        }

        System.out.println("\nPersonas con el mismo apellido:");
        Map<String, List<Persona>> apellidos = new HashMap<>();
        
        for (Persona persona : estudiantes) {
            String apellido = persona.getApellido();
            apellidos.computeIfAbsent(apellido, k -> new ArrayList<>()).add(persona);
        }
        
        for (Persona persona : docentes) {
            String apellido = persona.getApellido();
            apellidos.computeIfAbsent(apellido, k -> new ArrayList<>()).add(persona);
        }

        for (Map.Entry<String, List<Persona>> entry : apellidos.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("\nApellido " + entry.getKey() + ":");
                for (Persona persona : entry.getValue()) {
                    if (persona instanceof Estudiante) {
                        System.out.println("Estudiante: " + persona.getNombre() + " " + persona.getApellido());
                    } else {
                        System.out.println("Docente: " + persona.getNombre() + " " + persona.getApellido());
                    }
                }
            }
        }
    }
}