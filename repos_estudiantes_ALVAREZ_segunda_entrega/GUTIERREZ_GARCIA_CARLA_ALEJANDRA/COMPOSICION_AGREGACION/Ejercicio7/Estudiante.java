package Ejercicio7;

public class Estudiante {
    private String nombre;
    private String carrera;
    private int semestre;

    public Estudiante(String n, String c, int s) {
        this.nombre = n;
        this.carrera = c;
        this.semestre = s;
    }

    public void mostrar_info() {
        System.out.println("Nombre: " + this.nombre + ", Carrera: " + this.carrera + ", Semestre: " + this.semestre);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setCarrera(String c) {
        this.carrera = c;
    }

    public void setSemestre(int s) {
        this.semestre = s;
    }
}
