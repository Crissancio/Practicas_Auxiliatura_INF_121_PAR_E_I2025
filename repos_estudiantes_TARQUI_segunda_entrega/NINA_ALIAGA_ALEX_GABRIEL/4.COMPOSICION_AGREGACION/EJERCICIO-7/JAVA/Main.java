public class Main {
  public static void main(String[] args) {
    Universidad universidad = new Universidad("Universidad XYZ");
    Estudiante estudiante1 = new Estudiante("Juan Pérez", "Ingeniería", 3);
    Estudiante estudiante2 = new Estudiante("María López", "Medicina", 2);
    Estudiante estudiante3 = new Estudiante("Carlos Gómez", "Derecho", 4);
    
    universidad.agregarEstudiante(estudiante1);
    universidad.agregarEstudiante(estudiante2);
    universidad.agregarEstudiante(estudiante3);
    
    System.out.println("Estudiantes en la universidad:");
    System.out.println("---------------------");
    universidad.mostrarEstudiantes();
  }
}