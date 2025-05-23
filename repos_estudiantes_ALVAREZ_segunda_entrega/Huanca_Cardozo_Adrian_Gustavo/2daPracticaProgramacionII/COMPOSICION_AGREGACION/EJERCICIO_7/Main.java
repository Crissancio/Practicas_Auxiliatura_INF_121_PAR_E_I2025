package COMPOSICION_AGREGACION.EJERCICIO_7;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan Pérez", "Ingeniería de Sistemas", 4);
        Estudiante estudiante2 = new Estudiante("Ana Gómez", "Medicina", 2);
        Estudiante estudiante3 = new Estudiante("Carlos Ruiz", "Derecho", 6);

        Universidad universidad = new Universidad("Universidad Nacional");

        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);
        universidad.agregarEstudiante(estudiante3);

        universidad.mostrarUniversidad();
    }
}
