public class Main {
    public static void main(String[] args) {
        // b) Crear una universidad y agregar estudiantes
        Universidad univCentral = new Universidad("Universidad Central");

        // Crear estudiantes (pueden existir independientemente de la universidad)
        Estudiante est1 = new Estudiante("María Gómez", "Ingeniería de Sistemas", 5);
        Estudiante est2 = new Estudiante("Carlos Pérez", "Medicina", 8);
        Estudiante est3 = new Estudiante("Ana Rodríguez", "Derecho", 3);
        Estudiante est4 = new Estudiante("Luis Martínez", "Administración", 6);

        // Agregar estudiantes a la universidad
        univCentral.agregarEstudiante(est1);
        univCentral.agregarEstudiante(est2);
        univCentral.agregarEstudiante(est3);
        univCentral.agregarEstudiante(est4);

        // c) Mostrar información de la universidad y sus estudiantes
        System.out.println(univCentral.mostrarUniversidad());

        // Demostración de que los estudiantes existen independientemente
        System.out.println("\nEstudiante fuera de la universidad:");
        System.out.println(new Estudiante("Pedro Sánchez", "Arquitectura", 4).mostrarInfo());
    }
}