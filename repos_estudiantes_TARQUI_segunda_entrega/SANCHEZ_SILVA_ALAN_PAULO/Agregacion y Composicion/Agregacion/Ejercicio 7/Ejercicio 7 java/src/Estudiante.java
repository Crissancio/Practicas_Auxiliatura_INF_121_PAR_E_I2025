public class Estudiante {
    public String nombre, carrera;
    public int semestre;
    public Estudiante(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String toString() {
        return "----------------Estudiante-------------------------"+"\n"+
        "Nombre: " + nombre + "\n" +
                "Carrera: " + carrera + "\n" +
                "Semestre: " + semestre + "\n";
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
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
}
