import java.util.ArrayList;

class Estudiante {
    private String nombre;
    private String carrera;
    private int semestre;

    public Estudiante(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) { this.semestre = semestre; }

    public void mostrarInfo() {
        System.out.println(nombre + " | Carrera: " + carrera + " | Semestre: " + semestre);
    }
}

class Universidad {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() { return nombre; }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarUniversidad() {
        System.out.println("\nUniversidad: " + nombre);
        for (Estudiante e : estudiantes) {
            e.mostrarInfo();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Universidad u = new Universidad("Universidad Mayor de San Andres");
        Estudiante e1 = new Estudiante("Ana", "Ingeniería", 3);
        Estudiante e2 = new Estudiante("Luis", "Medicina", 5);
        Estudiante e3 = new Estudiante("Marta", "Derecho", 2);

        u.agregarEstudiante(e1);
        u.agregarEstudiante(e2);
        u.agregarEstudiante(e3);

        u.mostrarUniversidad();
    }
}
