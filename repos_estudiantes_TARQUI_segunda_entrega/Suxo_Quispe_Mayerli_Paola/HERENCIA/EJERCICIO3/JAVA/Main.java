import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Docente> docentes = new ArrayList<>();

        // Datos de prueba
        estudiantes.add(new Estudiante("123", "Ana", "López", "777111", "1995-04-20", "RU001", "2019-01-01", 8));
        estudiantes.add(new Estudiante("124", "Carlos", "Martínez", "777222", "2003-05-15", "RU002", "2022-02-01", 3));
        estudiantes.add(new Estudiante("125", "Luis", "Gómez", "777333", "1998-10-30", "RU003", "2020-03-01", 5));

        docentes.add(new Docente("201", "Miguel", "Gómez", "888111", "1975-09-10", "NIT001", "Ingeniero", "Sistemas", "masculino"));
        docentes.add(new Docente("202", "Lucía", "López", "888222", "1985-12-05", "NIT002", "Licenciada", "Matemáticas", "femenino"));
        docentes.add(new Docente("203", "Pedro", "Ramírez", "888333", "1980-08-25", "NIT003", "Ingeniero", "Civil", "masculino"));

        // c) Estudiantes mayores de 25 años
        System.out.println("\n--- Estudiantes mayores de 25 años ---");
        for (Estudiante e : estudiantes) {
            if (e.edad() > 25) {
                e.mostrar();
            }
        }

        // d) Docente Ingeniero masculino mayor
        Docente mayor = null;
        for (Docente d : docentes) {
            if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo().equalsIgnoreCase("masculino")) {
                if (mayor == null || d.edad() > mayor.edad()) {
                    mayor = d;
                }
            }
        }
        if (mayor != null) {
            System.out.println("\n--- Docente Ingeniero masculino mayor ---");
            mayor.mostrar();
        }

        // e) Coincidencias de apellidos
        System.out.println("\n--- Coincidencias de apellido entre estudiantes y docentes ---");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.getApellido().equalsIgnoreCase(d.getApellido())) {
                    System.out.println("\nEstudiante:");
                    e.mostrar();
                    System.out.println("Docente:");
                    d.mostrar();
                }
            }
        }
    }
}
