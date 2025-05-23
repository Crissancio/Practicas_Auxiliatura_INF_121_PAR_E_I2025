// a) 
public class Estudiante {
    private String nombre;
    private String carrera;
    private int semestre;
    
    public Estudiante(String n, String c, int s) {
        this.nombre = n;
        this.carrera = c;
        this.semestre = s;
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
    public void mostrar_info() {
        System.out.println("nombre: " + nombre);
        System.out.println("carrera: " + carrera);
        System.out.println("semestre: " + semestre);
    }
}