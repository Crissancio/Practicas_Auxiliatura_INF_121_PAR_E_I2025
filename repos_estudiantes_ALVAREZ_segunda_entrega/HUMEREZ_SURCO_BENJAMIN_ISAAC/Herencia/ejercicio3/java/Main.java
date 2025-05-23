//3. Definir las clases:
//Persona <ci, nombre, apellido, celular, fecha_Nac>
//Estudiante (heredado de persona) <ru, fecha_Ingreso, semestre>
//Docente (heredado de persona) <nit, profesión, especialidad>
//a) Diseñar el diagrama UML de las clases anteriores.
//b) Implementa las clases con sus constructores, datos por defecto y
//mostrar.
//c) Mostrar los estudiantes mayores de 25 años.
//d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo
//masculino y es el mayor de todos.
//e) Mostrar a los estudiantes y docentes que tienen el mismo apellido.

package Herencia.ejercicio3.java;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Docente> docentes = new ArrayList<>();

        estudiantes.add(new Estudiante("123", "Ana", "Perez", "78912345", LocalDate.of(1997, 5, 1), "RU123", LocalDate.of(2020, 2, 1), 8));
        estudiantes.add(new Estudiante("456", "Luis", "Gomez", "78912346", LocalDate.of(2004, 10, 10), "RU456", LocalDate.of(2023, 2, 1), 2));

        docentes.add(new Docente("789", "Mario", "Perez", "78912347", LocalDate.of(1970, 6, 15), "NIT123", "Ingeniero", "Sistemas", 'M'));
        docentes.add(new Docente("101", "Carlos", "Gomez", "78912348", LocalDate.of(1980, 1, 10), "NIT456", "Licenciado", "Matemáticas", 'M'));

        System.out.println("Estudiantes mayores de 25:");
        for (Estudiante e : estudiantes) {
            if (e.getEdad() > 25) e.mostrar();
        }

        Docente mayorDocente = null;
        for (Docente d : docentes) {
            if (d.profesion.equals("Ingeniero") && d.sexo == 'M') {
                if (mayorDocente == null || d.getEdad() > mayorDocente.getEdad()) {
                    mayorDocente = d;
                }
            }
        }

        System.out.println("\nDocente Ingeniero masculino más viejo:");
        if (mayorDocente != null) mayorDocente.mostrar();

        System.out.println("\nPersonas con el mismo apellido:");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.getApellido().equals(d.getApellido())) {
                    e.mostrar();
                    d.mostrar();
                }
            }
        }
    }
}
