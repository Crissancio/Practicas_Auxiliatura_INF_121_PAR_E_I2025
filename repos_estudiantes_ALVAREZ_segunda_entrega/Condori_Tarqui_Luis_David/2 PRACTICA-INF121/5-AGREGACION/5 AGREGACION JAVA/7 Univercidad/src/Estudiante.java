public class Estudiante {
    private String nombre;
    private String carrera;
    private int semestre;

    public Estudiante(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " - Carrera: " + carrera + ", Semestre: " + semestre);
    }
}

