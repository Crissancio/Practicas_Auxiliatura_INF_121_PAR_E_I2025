import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("1234567", "Ana", "Gonzales", "77711122", LocalDate.of(1998, 5, 10), "E1001", LocalDate.of(2018, 2, 1), 8)); // 26 years old
        estudiantes.add(new Estudiante("7654321", "Pedro", "Mamani", "66633344", LocalDate.of(1995, 11, 20), "E1002", LocalDate.of(2015, 8, 1), 10)); // 29 years old
        estudiantes.add(new Estudiante("1122334", "Maria", "Quispe", "70055566", LocalDate.of(2002, 3, 15), "E1003", LocalDate.of(2020, 2, 1), 5)); // 23 years old
        estudiantes.add(new Estudiante("4455667", "Juan", "Vargas", "78899900", LocalDate.of(1990, 7, 25), "E1004", LocalDate.of(2010, 8, 1), 12)); // 34 years old
        estudiantes.add(new Estudiante("8765432", "Laura", "Gonzales", "71122233", LocalDate.of(2001, 9, 5), "E1005", LocalDate.of(2019, 2, 1), 7)); // 23 years old

        List<Docente> docentes = new ArrayList<>();
        docentes.add(new Docente("D1001", "Carlos", "Perez", "75511122", LocalDate.of(1970, 1, 1), "NIT111", "Ingeniero", "Sistemas", "Masculino")); // 55 years old
        docentes.add(new Docente("D1002", "Elena", "Lopez", "76633344", LocalDate.of(1980, 6, 15), "NIT222", "Licenciado", "Matemáticas", "Femenino")); // 44 years old
        docentes.add(new Docente("D1003", "Roberto", "Gomez", "70055566", LocalDate.of(1965, 9, 20), "NIT333", "Ingeniero", "Electrónica", "Masculino")); // 59 years old (This one!)
        docentes.add(new Docente("D1004", "Sofia", "Silva", "78899900", LocalDate.of(1975, 4, 10), "NIT444", "Arquitecto", "Urbanismo", "Femenino")); // 50 years old
        docentes.add(new Docente("D1005", "Daniel", "Herrera", "71122233", LocalDate.of(1960, 12, 5), "NIT555", "Ingeniero", "Civil", "Masculino")); // 64 years old

        System.out.println(" Estudiantes mayores de 25 años ");
        for (Estudiante est : estudiantes) {
            if (est.getEdad() > 25) {
                est.mostrar();
            }
        }
        System.out.println("\n");
        System.out.println("Docente Ingeniero, Masculino y el Mayor ");
        Docente docenteMayorIngenieroMasculino = null;
        int edadMayor = -1; 

        for (Docente doc : docentes) {
            if ("Ingeniero".equalsIgnoreCase(doc.getProfesion()) && "Masculino".equalsIgnoreCase(doc.getSexo())) {
                if (doc.getEdad() > edadMayor) {
                    edadMayor = doc.getEdad();
                    docenteMayorIngenieroMasculino = doc;
                }
            }
        }

        if (docenteMayorIngenieroMasculino != null) {
            docenteMayorIngenieroMasculino.mostrar();
        } else {
            System.out.println("No se encontró ningún docente que cumpla con los criterios.");
        }
        System.out.println("\n");

        System.out.println(" Estudiantes y Docentes con el mismo apellido ");
        boolean foundCommonApellido = false;
        for (Estudiante est : estudiantes) {
            for (Docente doc : docentes) {
                if (est.getApellido().equalsIgnoreCase(doc.getApellido())) {
                    System.out.println("Apellido en común: " + est.getApellido());
                    System.out.println("Estudiante:");
                    est.mostrar();
                    System.out.println("Docente:");
                    doc.mostrar();
                    foundCommonApellido = true;
                }
            }
        }
        if (!foundCommonApellido) {
            System.out.println("No se encontraron estudiantes y docentes con el mismo apellido.");
        }
    }
}