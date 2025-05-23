public class Main {
    public static void main(String[] args) {
        // Crear estudiantes 
        Estudiante e1 = new Estudiante("Brayan Ramirez", "Ingenieria de Sistemas", 3);
        Estudiante e2 = new Estudiante("Luis Condori", "Medicina", 5);
        Estudiante e3 = new Estudiante("Claudia Perez", "Derecho", 2);

        Universidad uni = new Universidad("UMSA");
        uni.agregarEstudiante(e1);
        uni.agregarEstudiante(e2);
        uni.agregarEstudiante(e3);

        uni.mostrarUniversidad();
    }
}