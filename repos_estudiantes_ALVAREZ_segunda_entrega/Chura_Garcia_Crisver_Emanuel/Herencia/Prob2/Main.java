import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Estudiante> estudiantes = new ArrayList<>();
    static List<Docente> docentes = new ArrayList<>();

    public static void main(String[] args) {
        agregarEstudiante(
                new Estudiante(13828325, "Crisver Emanuel", "Chura Garcia", 70145601, 1999, 1865765, "08/02/2024", 3));
        agregarEstudiante(
                new Estudiante(13828326, "Crismar Abraham", "Chura Garcia", 70145620, 2006, 1865800, "10/02/2025", 1));
        agregarEstudiante(
                new Estudiante(13828330, "Samuel Randy", "Chura Garcia", 70145622, 2009, 12345678, "05/02/2028", 1));
        agregarEstudiante(
                new Estudiante(12345678, "Erick Alexander", "Huanca", 12345678, 1999, 78945612, "08/02/2024", 3));
        agregarEstudiante(new Estudiante(78945612, "David", "Alejo", 74185296, 1998, 78945612, "08/03/2023", 4));

        agregarDocente(new Docente(789456213, "Felipez", "Andrade", 12345678, 1975, 78945, "docente",
                "Metodos numericos", "Masculino"));
        agregarDocente(new Docente(123456789, "Carmen", "Huanca", 74185296, 1878, 123546, "docente", "Base de datos",
                "Femenino"));
        agregarDocente(new Docente(740852960, "Rosa", "Mayta", 78952134, 1980, 789123, "Ingeniero", "Fisica aplicada",
                "Femenino"));
        agregarDocente(new Docente(102345678, "Fulanito", "Detal", 83214559, 1889, 456025, "Ingeniero", "Software",
                "Masculino"));

        System.out.println("b) Implementa las clases con sus constructores, datos por defecto y mostrar.");
        for (Estudiante estudiante : estudiantes) {
            estudiante.Mostrar();
        }

        for (Docente docente : docentes) {
            docente.Mostrar();
        }
        System.out.println("--------------");
        System.out.println("c) Mostrar los estudiantes mayores de 25 años.");
        for (Estudiante estudiante : estudiantes) {
            estudiante.EstudiantesMayores();
        }
        System.out.println("--------------");
        System.out.println(
                "d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo masculino y es el mayor de todos.");
        MostrarIngeMasMay();
        System.out.println("--------------");
        System.out.println("e) Mostrar a los estudiantes y docentes que tienen el mismo apellido.");
        MostrarApellido("Huanca");
    }

    // e) Mostrar a los estudiantes y docentes que tienen el mismo apellido.
    public static void MostrarApellido(String apellido) {
        for (Docente docente : docentes) {
            for (Estudiante estudiante : estudiantes) {
                if (estudiante.getApellido().equals(apellido) && docente.getApellido().equals(apellido)) {
                    docente.Mostrar();
                    estudiante.Mostrar();
                }
            }
        }
    }

    // d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo
    // masculino y es el mayor de todos.
    public static void MostrarIngeMasMay() {
        int may = 0;
        for (int i = 0; i < docentes.size(); i++) {
            Docente doc = docentes.get(i);
            if (doc.getProfesion().equals("Ingeniero")) {
                if (doc.getSexo().equals("Masculino")) {
                    int edad = 2025 - doc.getFecha_Nac();
                    if (edad > may) {
                        may = edad;
                    }
                }
            }
        }

        for (int i = 0; i < docentes.size(); i++) {
            Docente doc = docentes.get(i);
            if (doc.getProfesion().equals("Ingeniero")) {
                if (doc.getSexo().equals("Masculino")) {
                    int edad2 = 2025 - doc.getFecha_Nac();
                    if (edad2 == may) {
                        doc.Mostrar();
                    }
                }
            }
        }
    }

    public static void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public static void agregarDocente(Docente docente) {
        docentes.add(docente);
    }
}