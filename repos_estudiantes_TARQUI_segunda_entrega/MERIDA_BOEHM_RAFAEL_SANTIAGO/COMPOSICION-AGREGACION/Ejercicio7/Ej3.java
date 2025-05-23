package Ejercicio3;

public class Ej3 {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");

        Estudiante est1 = new Estudiante("Ana Pérez", "Ingeniería", 3);
        Estudiante est2 = new Estudiante("Luis Torres", "Medicina", 5);
        Estudiante est3 = new Estudiante("María López", "Derecho", 1);

        uni.agregarEstudiante(est1);
        uni.agregarEstudiante(est2);
        uni.agregarEstudiante(est3);

        uni.mostrarUniversidad();
    }
}