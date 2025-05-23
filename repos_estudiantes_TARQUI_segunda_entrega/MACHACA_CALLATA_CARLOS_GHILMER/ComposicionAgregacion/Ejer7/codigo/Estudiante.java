package ComposicionAgregacion.Ejer7.codigo;

public class Estudiante {
    public String nombre;
    public String carrera;
    public String semestre;

    public Estudiante(String nombre, String carrera, String semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
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
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }
}