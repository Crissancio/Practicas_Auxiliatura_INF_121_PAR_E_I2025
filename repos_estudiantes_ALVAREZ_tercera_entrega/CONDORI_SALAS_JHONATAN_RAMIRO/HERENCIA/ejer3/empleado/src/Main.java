import java.time.LocalDate;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("101", "Carlos", "López", "7654321", LocalDate.of(1998, 6, 15),
                "RU001", LocalDate.of(2021, 2, 1), "5"));
        estudiantes.add(new Estudiante("102", "Ana", "García", "7123456", LocalDate.of(2004, 3, 22),
                "RU002", LocalDate.of(2022, 1, 1), "2"));
        estudiantes.add(new Estudiante("103", "Luis", "Pérez", "7991234", LocalDate.of(1995, 11, 10),
                "RU003", LocalDate.of(2019, 8, 1), "7"));
        ArrayList<Docente> docentes = new ArrayList<>();
        docentes.add(new Docente("201", "Mario", "López", "7123876", LocalDate.of(1980, 10, 5),
                "NIT001", "Ingeniero", "Sistemas", "Masculino"));
        docentes.add(new Docente("202", "Elena", "García", "7982321", LocalDate.of(1985, 9, 20),
                "NIT002", "Arquitecta", "Diseño", "Femenino"));
        docentes.add(new Docente("203", "Pablo", "Pérez", "7992222", LocalDate.of(1975, 4, 1),
                "NIT003", "Ingeniero", "Civil", "Masculino"));
        System.out.println("\nEstudiantes mayores de 25 años:");
        for (Estudiante est : estudiantes) {
            if (est.getEdad() > 25) {
                est.mostrar();
            }
        }
        Docente mayor = null;
        for (Docente doc : docentes) {
            if (doc.getProfesion().equalsIgnoreCase("Ingeniero") &&
                doc.getSexo().equalsIgnoreCase("Masculino")) {
                if (mayor == null || doc.getEdad() > mayor.getEdad()) {
                    mayor = doc;
                }
            }
        }
        System.out.println("Docente masculino con profesión 'Ingeniero' y mayor edad:");
        if (mayor != null) {
            mayor.mostrar();
        }
        System.out.println("Estudiantes y docentes con apellidos coincidentes:");
        for (Estudiante est : estudiantes) {
            for (Docente doc : docentes) {
                if (est.getApellido().equalsIgnoreCase(doc.getApellido())) {
                    System.out.println("Coincidencia de apellido: " + est.getApellido());
                    est.mostrar();
                    doc.mostrar();
                }
            }
        }
    }
}