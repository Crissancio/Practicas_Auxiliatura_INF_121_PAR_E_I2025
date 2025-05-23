/*
Crea un POO para una universidad y sus estudiantes. La universidad contiene
estudiantes, pero los estudiantes pueden existir independientemente de la
universidad.
Estudiante< nombre, carrera, semestre>
Métodos: mostrar_info() (muestra el nombre, carrera y semestre del estudiante)
Universidad<nombre, estudiantes (lista de objetos de tipo Estudiante)>
Métodos: agregar_estudiante(estudiante), mostrar_universidad() (muestra el
nombre de la universidad y la información de todos los estudiantes)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea una universidad y agrega varios estudiantes.
c) Muestra la información de la universidad y sus estudiantes.

*/
package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        // Crear estudiantes independientes
        Estudiante e1 = new Estudiante("Ana Torres", "Ingeniería de Sistemas", 4);
        Estudiante e2 = new Estudiante("Luis Pérez", "Administración", 2);
        Estudiante e3 = new Estudiante("María Gómez", "Derecho", 5);

        // Crear universidad
        Universidad universidad = new Universidad("Universidad Central");

        // Agregar estudiantes a la universidad
        universidad.agregar_estudiante(e1);
        universidad.agregar_estudiante(e2);
        universidad.agregar_estudiante(e3);

        // Mostrar la información
        universidad.mostrar_universidad();
    }
}
