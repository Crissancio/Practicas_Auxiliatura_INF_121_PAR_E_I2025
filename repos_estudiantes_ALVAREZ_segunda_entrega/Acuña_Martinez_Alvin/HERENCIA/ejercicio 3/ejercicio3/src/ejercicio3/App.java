package ejercicio3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Docente> docentes = new ArrayList<>();

        // b) Creación de instancias
        estudiantes.add(new Estudiante("123", "Juan", "Perez", "7777777", "1995-05-20", "RU001", "2015-03-01", 10));
        estudiantes.add(new Estudiante("124", "Ana", "Gomez", "8888888", "2000-10-15", "RU002", "2019-03-01", 6));
        estudiantes.add(new Estudiante("125", "Luis", "Perez", "9999999", "1998-08-30", "RU003", "2017-03-01", 8));

        docentes.add(new Docente("200", "Carlos", "Lopez", "6666666", "1970-01-01", "NIT001", "Ingeniero", "Sistemas", "Masculino"));
        docentes.add(new Docente("201", "Maria", "Perez", "5555555", "1980-07-07", "NIT002", "Abogada", "Derecho Civil", "Femenino"));
        docentes.add(new Docente("202", "Jose", "Gomez", "4444444", "1965-03-03", "NIT003", "Ingeniero", "Electrónica", "Masculino"));

        // c) Mostrar estudiantes mayores de 25 años
        System.out.println("Estudiantes mayores de 25 años:");
        for (Estudiante e : estudiantes) {
            if (e.getEdad() > 25) {
                e.mostrar();
            }
        }

        // d) Mostrar docente ingeniero, masculino y el mayor de todos
        System.out.println("\nDocente ingeniero, masculino y mayor de todos:");
        Docente mayor = null;
        for (Docente d : docentes) {
            if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo().equalsIgnoreCase("Masculino")) {
                if (mayor == null || d.getEdad() > mayor.getEdad()) {
                    mayor = d;
                }
            }
        }
        if (mayor != null) mayor.mostrar();

        // e) Mostrar estudiantes y docentes con el mismo apellido
        System.out.println("\nEstudiantes y docentes con el mismo apellido:");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.getApellido().equalsIgnoreCase(d.getApellido())) {
                    System.out.println("Estudiante:");
                    e.mostrar();
                    System.out.println("Docente:");
                    d.mostrar();
                    System.out.println("---");
                }
            }
        }
    }
}
