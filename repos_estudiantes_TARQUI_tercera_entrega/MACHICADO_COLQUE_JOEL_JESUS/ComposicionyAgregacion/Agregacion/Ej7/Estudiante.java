package ComposicionyAgregacion.Agregacion.Ej7;


// Clase Estudiante (puede existir independientemente de la Universidad)
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

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    // Método mostrar_info
    public void mostrar_info() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
        System.out.println("------------------------");
    }
}
