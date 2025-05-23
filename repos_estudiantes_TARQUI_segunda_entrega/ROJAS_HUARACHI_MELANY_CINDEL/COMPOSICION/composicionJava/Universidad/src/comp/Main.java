package comp;

//b) Crea una universidad y agrega varios estudiantes.
//c) Muestra la información de la universidad y sus estudiantes.

public class Main {
 public static void main(String[] args) {
     Universidad uni = new Universidad("Universidad Nacional");

     Estudiante est1 = new Estudiante("Ana Pérez", "Ingeniería", 3);
     Estudiante est2 = new Estudiante("Luis Gómez", "Medicina", 2);
     Estudiante est3 = new Estudiante("María López", "Derecho", 5);

     uni.agregarEstudiante(est1);
     uni.agregarEstudiante(est2);
     uni.agregarEstudiante(est3);

     uni.mostrarUniversidad();
 }
}
