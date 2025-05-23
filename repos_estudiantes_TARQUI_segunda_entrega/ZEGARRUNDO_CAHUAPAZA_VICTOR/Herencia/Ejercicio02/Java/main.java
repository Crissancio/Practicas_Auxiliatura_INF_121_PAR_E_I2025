package Herencia2;

public class main {
    public static void main(String[] args) {
        int anioActual = 2025;

        Estudiante[] estudiantes = {
            new Estudiante("123", "Ana", "López", 7894561, 1997, "RU123", "2020-02-01", 7),
            new Estudiante("456", "Luis", "Martínez", 7894562, 2002, "RU456", "2021-03-10", 4),
            new Estudiante("789", "Laura", "Gómez", 7894563, 1995, "RU789", "2019-08-01", 9)
        };

        Docente[] docentes = {
            new Docente("321", "Carlos", "Martínez", 7899999, 1975, "NIT321", "Ingeniero", "Sistemas"),
            new Docente("654", "Pedro", "Pérez", 7888888, 1980, "NIT654", "Licenciado", "Matemáticas")
        };

        System.out.println("Estudiantes mayores de 25 años:");
        for (Estudiante e : estudiantes) {
            if (e.calcularEdad(anioActual) > 25) {
                e.mostrarInfo();
                System.out.println();
            }
        }

        Docente mayorIngeniero = null;
        for (Docente d : docentes) {
            if (d.getProfesion().equalsIgnoreCase("Ingeniero")) {
                if (mayorIngeniero == null || d.calcularEdad(anioActual) > mayorIngeniero.calcularEdad(anioActual)) {
                    mayorIngeniero = d;
                }
            }
        }

        if (mayorIngeniero != null) {
            System.out.println("Docente Ingeniero más viejo:");
            mayorIngeniero.mostrarInfo();
            System.out.println();
        }

        System.out.println("Coincidencias de apellido entre estudiantes y docentes:");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.getApellido().equalsIgnoreCase(d.getApellido())) {
                    System.out.println("Coincidencia entre: " + e.getNombre() + " y " + d.getNombre());
                    e.mostrarInfo();
                    d.mostrarInfo();
                    System.out.println();
                }
            }
        }
    }
}
