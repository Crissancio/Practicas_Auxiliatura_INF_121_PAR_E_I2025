import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private String nombre;
    private String carrera;
    private int semestre;
    // Constructor
    public Estudiante(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }
    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) { this.semestre = semestre; }
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("  - " + nombre + " | " + carrera + " | Semestre: " + semestre);
    }
}

class Universidad {
    private String nombre;
    private List<Estudiante> estudiantes;
    // Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }
    // Método para agregar estudiantes
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    // Método para mostrar información
    public void mostrarUniversidad() {
        System.out.println("\n🏫 Universidad: " + nombre);
        System.out.println("📚 Estudiantes registrados:");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarInfo();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Crear universidad
        Universidad uni = new Universidad("Tecnologico Nacional");
        // Crear estudiantes
        Estudiante est1 = new Estudiante("Ana Lopez", "Ingenieria Informatica", 3);
        Estudiante est2 = new Estudiante("Carlos Ruiz", "Medicina", 5);
        Estudiante est3 = new Estudiante("Maria Garcia", "Derecho", 2);
        // Agregar estudiantes
        uni.agregarEstudiante(est1);
        uni.agregarEstudiante(est2);
        uni.agregarEstudiante(est3);
        // Mostrar información
        uni.mostrarUniversidad();
    }
}