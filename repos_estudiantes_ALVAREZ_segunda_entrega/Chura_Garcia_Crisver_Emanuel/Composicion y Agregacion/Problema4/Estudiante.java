//4. Crea un POO para una universidad y sus estudiantes. La universidad contiene estudiantes, pero los estudiantes pueden existir independientemente de la universidad.
//a) Implementa las clases con sus constructores, getters y setters.
public class Estudiante {
    private String nombre;
    private String carrera;
    private int semestre;

    Estudiante(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return this.semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void mostrar_info() {
        System.out.println("Estudiante: " + getNombre() + " Carrera: " + getCarrera() + " Semestre: " + getSemestre());
    }
}