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
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        if (semestre > 0) {
            this.semestre = semestre;
        } else {
            throw new IllegalArgumentException("El semestre debe ser mayor que cero");
        }
    }

    // Método para mostrar información
    public String mostrarInfo() {
        return "Nombre: " + nombre + ", Carrera: " + carrera + ", Semestre: " + semestre;
    }
}