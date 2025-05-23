package HERENCIA.Ejer3.codigo;

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


public class Main {
   
    public static void main(String[] args) {
        Persona persona = new Persona(12345678, "Juan", "Pérez", 987654321, "01/01/2000");
        Estudiante estudiante = new Estudiante(87654321, "Ana", "Martínez", 123456789, "02/02/1999", 12345, "01/03/2020", "2do");
        Docente docente = new Docente(23456789, "Luis", "Martínez", 987654321, "03/03/1980", 54321, "Ingeniero", "Sistemas");

        System.out.println("Datos de la Persona:");
        persona.mostrarDatos();
        System.out.println("\nDatos del Estudiante:");
        estudiante.mostrarDatos();
        estudiante.mostrarEdad();
        estudiante.mostrarMismoApellido();
        System.out.println("\nDatos del Docente:");
        docente.mostrarDatos();
        docente.mostrarProfesion();
        docente.mostrarMismoApellido();
    }

   
}
