/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Fabricio
 * 3. Definir las clases:
Persona <ci, nombre, apellido, celular, fecha_Nac>
Estudiante (heredado de persona) <ru, fecha_Ingreso, semestre>
Docente (heredado de persona) <nit, profesión, especialidad>
a) Diseñar el diagrama UML de las clases anteriores.
b) Implementa las clases con sus constructores, datos por defecto y
mostrar.
c) Mostrar los estudiantes mayores de 25 años.
d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo
masculino y es el mayor de todos.
e) Mostrar a los estudiantes y docentes que tienen el mismo apellido
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int añoActual = 2025;

        Estudiante[] estudiantes = {
            new Estudiante("123", "Luis", "Gomez", "7654321", 1998, "RU100", "2021", 6),
            new Estudiante("124", "Ana", "Perez", "7654322", 2004, "RU101", "2023", 2),
            new Estudiante("125", "Mario", "Gomez", "7654323", 1997, "RU102", "2020", 8)
        };

        Docente[] docentes = {
            new Docente("200", "Carlos", "Gomez", "7650000", 1980, "NIT100", "Ingeniero", "Sistemas", 'M'),
            new Docente("201", "Lucia", "Perez", "7651111", 1985, "NIT101", "Licenciada", "Matemáticas", 'F')
        };

        System.out.println("Estudiantes mayores de 25 años:");
        for (Estudiante est : estudiantes) {
            if (est.calcularEdad(añoActual) > 25) est.mostrar();
        }

        System.out.println("\nDocente 'Ingeniero' masculino y mayor:");
        Docente mayor = null;
        for (Docente d : docentes) {
            if (d.profesion.equals("Ingeniero") && d.sexo == 'M') {
                if (mayor == null || d.calcularEdad(añoActual) > mayor.calcularEdad(añoActual)) {
                    mayor = d;
                }
            }
        }
        if (mayor != null) mayor.mostrar();

        System.out.println("\nCoincidencias de apellidos entre docentes y estudiantes:");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.apellido.equals(d.apellido)) {
                    e.mostrar();
                    d.mostrar();
                }
            }
        }
    }
}