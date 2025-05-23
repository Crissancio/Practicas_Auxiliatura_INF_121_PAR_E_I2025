package Herencia.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Crear estudiantes
        Estudiante[] estudiantes = new Estudiante[3];
        estudiantes[0] = new Estudiante();
        estudiantes[1] = new Estudiante(5);
        estudiantes[2] = new Estudiante(1313, "Daniela", "Romero", 789123, 1998, 3030, "05-marzo-2021", 8);

        // Crear docentes
        Docente[] docentes = new Docente[4];
        docentes[0] = new Docente();
        docentes[1] = new Docente("masculino");
        docentes[2] = new Docente(1001);
        docentes[3] = new Docente(1414, "Carlos", "Romero", 456789, 1975, 123456, "Ingeniero", "Sistemas", "masculino");

        int añoActual = 2025;

        // c) Mostrar estudiantes mayores de 25 años
        System.out.println("=== Estudiantes mayores de 25 años ===");
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getEdad(añoActual) > 25) {
                estudiantes[i].mostrar();
                System.out.println("Edad: " + estudiantes[i].getEdad(añoActual) + "\n");
            }
        }

        // d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo
        // masculino y es el mayor de todos
        System.out.println("=== Docente más mayor que es Ingeniero y masculino ===");
        Docente.mostrarDocenteMayor(docentes, "Ingeniero", "masculino", añoActual);

        // e) Mostrar a los estudiantes y docentes que tienen el mismo apellido
        System.out.println("\n=== Estudiantes y docentes con el mismo apellido ===");
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < docentes.length; j++) {
                if (estudiantes[i].getApellido().equalsIgnoreCase(docentes[j].getApellido())) {
                    System.out.println("Coincidencia de apellido: " + estudiantes[i].getApellido());
                    System.out.println("Estudiante:");
                    estudiantes[i].mostrar();
                    System.out.println("Docente:");
                    docentes[j].mostrar();
                    System.out.println();
                }
            }
        }
    }
}