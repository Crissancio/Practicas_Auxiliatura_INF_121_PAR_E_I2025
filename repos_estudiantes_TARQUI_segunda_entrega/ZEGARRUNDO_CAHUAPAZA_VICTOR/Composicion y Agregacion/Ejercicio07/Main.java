package Composicion7;

public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("UMSA");

        universidad.agregarEstudiante(new Estudiante("Ana", "Informática", 3));
        universidad.agregarEstudiante(new Estudiante("Luis", "Medicina", 5));
        universidad.agregarEstudiante(new Estudiante("Carla", "Derecho", 2));

        universidad.mostrarUniversidad();
    }
}