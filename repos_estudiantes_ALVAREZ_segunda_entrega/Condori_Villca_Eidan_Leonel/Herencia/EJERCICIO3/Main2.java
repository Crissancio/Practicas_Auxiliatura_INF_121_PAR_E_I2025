package Herencia;
public class Main2 {

    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("1001", "Luis", "Gomez", "71234567", "1997-04-12", "Masculino", "001", "2020-01-10", 8),
            new Estudiante("1002", "Marta", "Sanchez", "71345678", "2000-10-05", "Femenino", "002", "2021-02-15", 6),
            new Estudiante("1003", "Diego", "Vargas", "71456789", "2004-07-21", "Masculino", "003", "2023-03-20", 2)
        };

        Docente[] docentes = {
            new Docente("2001", "Carlos", "Gomez", "72567890", "1972-06-30", "Masculino", "011", "Ingeniero", "Electrónica"),
            new Docente("2002", "Laura", "Sanchez", "72678901", "1985-09-12", "Femenino", "022", "Arquitecta", "Diseño Urbano"),
            new Docente("2003", "Jorge", "Martinez", "72789012", "1970-02-18", "Masculino", "033", "Ingeniero", "Civil")
        };

        System.out.println("Estudiantes mayores de 25:");
        mayores25(estudiantes);

        System.out.println("\nDocente hombre, ingeniero y mayor:");
        MayorIngeniero(docentes);

        System.out.println("\nEstudiantes y docentes con el mismo apellido:");
        MismoApellido(estudiantes, docentes);
    }

    public static void mayores25(Estudiante[] estudiantes) {
        for (Estudiante e : estudiantes) {
            if (e.calcularEdad() > 25) {
                e.mostrar();
            }
        }
    }

    public static void MayorIngeniero(Docente[] docentes) {
        Docente mayor = null;
        for (Docente d : docentes) {
            if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo().equalsIgnoreCase("Masculino")) {
                if (mayor == null || d.calcularEdad() > mayor.calcularEdad()) {
                    mayor = d;
                }
            }
        }

        if (mayor != null) {
            mayor.mostrar();
        } else {
            System.out.println("No hay docente");
        }
    }

    public static void MismoApellido(Estudiante[] estudiantes, Docente[] docentes) {
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.getApellido().equalsIgnoreCase(d.getApellido())) {
                    System.out.println("Coincidencia de apellido: " + e.getApellido());
                    System.out.println("Estudiante:");
                    e.mostrar();
                    System.out.println("Docente:");
                    d.mostrar();
                }
            }
        }
    }
}
