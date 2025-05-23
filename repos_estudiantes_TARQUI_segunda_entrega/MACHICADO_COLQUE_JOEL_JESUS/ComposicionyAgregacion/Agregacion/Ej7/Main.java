package ComposicionyAgregacion.Agregacion.Ej7;

// Clase principal para probar todo
public class Main {
    public static void main(String[] args) {
        // Crear estudiantes
        Estudiante est1 = new Estudiante("Carlos Pérez", "Ingeniería", 3);
        Estudiante est2 = new Estudiante("María López", "Derecho", 5);
        Estudiante est3 = new Estudiante("Ana García", "Medicina", 2);

        // Crear universidad
        Universidad uni = new Universidad("UMSA");

        // Agregar estudiantes a la universidad
        uni.agregar_estudiante(est1);
        uni.agregar_estudiante(est2);
        uni.agregar_estudiante(est3);

        // Mostrar información
        uni.mostrar_universidad();
    }
}
