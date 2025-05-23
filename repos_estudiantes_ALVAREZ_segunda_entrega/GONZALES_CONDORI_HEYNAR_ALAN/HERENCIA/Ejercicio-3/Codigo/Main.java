/*
Definir las clases:
Persona <ci, nombre, apellido, celular, fecha_Nac>
Estudiante (heredado de persona) <ru, fecha_Ingreso, semestre>
Docente (heredado de persona) <nit, profesión, especialidad>
a) Diseñar el diagrama UML de las clases anteriores.
b) Implementa las clases con sus constructores, datos por defecto y
mostrar.
c) Mostrar los estudiantes mayores de 25 años.
d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo
masculino y es el mayor de todos.
e) Mostrar a los estudiantes y docentes que tienen el mismo apellido.
*/
package Ejercicio03;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        List<Docente> docentes = new ArrayList<>();

        estudiantes.add(new Estudiante("123", "Ana", "López", "789456", LocalDate.of(1997, 5, 10), "RU01", LocalDate.of(2020, 3, 1), 7));
        estudiantes.add(new Estudiante("456", "Carlos", "Pérez", "789999", LocalDate.of(2004, 8, 20), "RU02", LocalDate.of(2022, 1, 10), 3));
        estudiantes.add(new Estudiante("789", "Luis", "García", "123123", LocalDate.of(1998, 9, 15), "RU03", LocalDate.of(2019, 2, 15), 9));

        docentes.add(new Docente("321", "Mario", "Pérez", "555555", LocalDate.of(1975, 3, 30), "NIT01", "Ingeniero", "Sistemas", "Masculino"));
        docentes.add(new Docente("654", "Laura", "García", "222333", LocalDate.of(1985, 7, 12), "NIT02", "Licenciada", "Matemáticas", "Femenino"));
        docentes.add(new Docente("987", "Pedro", "López", "111222", LocalDate.of(1965, 1, 20), "NIT03", "Ingeniero", "Civil", "Masculino"));

        // c) Estudiantes mayores de 25 años
        System.out.println("Estudiantes mayores de 25 años:");
        for (Estudiante e : estudiantes) {
            if (e.getEdad() > 25) {
                e.mostrar();
                System.out.println();
            }
        }

        // d) Docente masculino, ingeniero y el mayor de todos
        System.out.println("Docente masculino Ingeniero más antiguo:");
        Docente mayor = null;
        for (Docente d : docentes) {
            if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo().equalsIgnoreCase("Masculino")) {
                if (mayor == null || d.getEdad() > mayor.getEdad()) {
                    mayor = d;
                }
            }
        }
        if (mayor != null) {
            mayor.mostrar();
        }

        // e) Estudiantes y docentes con el mismo apellido
        System.out.println("\nEstudiantes y Docentes con el mismo apellido:");
        for (Estudiante est : estudiantes) {
            for (Docente doc : docentes) {
                if (est.getApellido().equalsIgnoreCase(doc.getApellido())) {
                    System.out.println("Coincidencia: " + est.getNombre() + " " + est.getApellido() + " - " + doc.getNombre() + " " + doc.getApellido());
                }
            }
        }
    }
}
