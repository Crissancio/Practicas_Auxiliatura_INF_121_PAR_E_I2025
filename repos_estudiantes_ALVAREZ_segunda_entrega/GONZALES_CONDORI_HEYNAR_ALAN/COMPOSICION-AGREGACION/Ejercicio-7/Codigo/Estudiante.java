
package Ejercicio7;

public class Estudiante {
    private String nombre;
    private String carrera;
    private int semestre;

    public Estudiante(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public void mostrar_info() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public String getCarrera() { return carrera; }
    public int getSemestre() { return semestre; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCarrera(String carrera) { this.carrera = carrera; }
    public void setSemestre(int semestre) { this.semestre = semestre; }
}
