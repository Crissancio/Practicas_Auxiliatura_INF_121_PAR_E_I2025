import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainPersonas {
    public static void main(String[] args) {
        // Crear lista de personas (estudiantes y docentes)
        List<Persona> personas = new ArrayList<>();
        
        // Añadir estudiantes
        personas.add(new Estudiante("1234567", "Juan", "Perez", "77712345", 
                                  LocalDate.of(1995, 5, 15), 'M', 
                                  "123456", LocalDate.of(2020, 8, 1), 8));
        personas.add(new Estudiante("7654321", "Maria", "Lopez", "77754321", 
                                  LocalDate.of(2000, 10, 20), 'F', 
                                  "654321", LocalDate.of(2021, 8, 1), 6));
        personas.add(new Estudiante("9876543", "Carlos", "Gomez", "77798765", 
                                  LocalDate.of(1998, 3, 10), 'M', 
                                  "987654", LocalDate.of(2019, 8, 1), 10));
        
        // Añadir docentes
        personas.add(new Docente("1111111", "Pedro", "Martinez", "77711111", 
                               LocalDate.of(1980, 7, 25), 'M', 
                               "1111111", "Ingeniero", "Sistemas"));
        personas.add(new Docente("2222222", "Ana", "Lopez", "77722222", 
                               LocalDate.of(1975, 12, 5), 'F', 
                               "2222222", "Licenciada", "Educación"));
        personas.add(new Docente("3333333", "Luis", "Gomez", "77733333", 
                               LocalDate.of(1970, 1, 30), 'M', 
                               "3333333", "Ingeniero", "Redes"));

        // c) Mostrar estudiantes mayores de 25 años
        System.out.println("=== Estudiantes mayores de 25 años ===");
        for (Persona p : personas) {
            if (p instanceof Estudiante && p.calcularEdad() > 25) {
                p.mostrar();
            }
        }

        // d) Mostrar docente Ingeniero, masculino y mayor de todos
        System.out.println("\n=== Docente Ingeniero, masculino y mayor ===");
        Docente mayorIngeniero = null;
        int mayorEdad = 0;
        
        for (Persona p : personas) {
            if (p instanceof Docente) {
                Docente d = (Docente) p;
                if (d.getProfesion().equalsIgnoreCase("Ingeniero") && 
                    d.getSexo() == 'M' && 
                    d.calcularEdad() > mayorEdad) {
                    mayorIngeniero = d;
                    mayorEdad = d.calcularEdad();
                }
            }
        }
        
        if (mayorIngeniero != null) {
            mayorIngeniero.mostrar();
        } else {
            System.out.println("No se encontró docente que cumpla los criterios");
        }

        // e) Mostrar estudiantes y docentes con mismo apellido
        System.out.println("\n=== Personas con mismos apellidos ===");
        for (int i = 0; i < personas.size(); i++) {
            for (int j = i + 1; j < personas.size(); j++) {
                if (personas.get(i).getApellido().equalsIgnoreCase(personas.get(j).getApellido())) {
                    System.out.println("Coincidencia en apellido: " + personas.get(i).getApellido());
                    personas.get(i).mostrar();
                    personas.get(j).mostrar();
                }
            }
        }
    }
}