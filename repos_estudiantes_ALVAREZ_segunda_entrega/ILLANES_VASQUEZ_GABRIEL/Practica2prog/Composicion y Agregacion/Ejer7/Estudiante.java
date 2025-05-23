package Compo;

public class Estudiante {
    private String nombre, carrera, semestre;

    public Estudiante() {
        this.nombre = "Sin nombre";
        this.carrera = "Sin carrera";
        this.semestre = "Sin semestre";
    }

    public Estudiante(String nom, String car, String sem) {
        nombre = nom;
        carrera = car;
        semestre = sem;
    }

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

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void mostrar_info() {
        System.out.println("Nombre: " + nombre + "  Carrera: " + carrera + "  Semestre: " + semestre);
    }
}
