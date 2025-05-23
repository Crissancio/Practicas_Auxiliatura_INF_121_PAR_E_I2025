public class UniversidadApp {

    static class Estudiante {
        private String nombre;
        private String carrera;
        private int semestre;

        public Estudiante(String nombre, String carrera, int semestre) {
            this.nombre = nombre;
            this.carrera = carrera;
            this.semestre = semestre;
        }

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        public String getCarrera() { return carrera; }
        public void setCarrera(String carrera) { this.carrera = carrera; }

        public int getSemestre() { return semestre; }
        public void setSemestre(int semestre) { this.semestre = semestre; }

        public String mostrarInfo() {
            return nombre + " - Carrera: " + carrera + ", Semestre: " + semestre;
        }
    }

    // Clase Universidad
    static class Universidad {
        private String nombre;
        private java.util.ArrayList<Estudiante> estudiantes;

        public Universidad(String nombre) {
            this.nombre = nombre;
            this.estudiantes = new java.util.ArrayList<>();
        }

        public void agregarEstudiante(Estudiante estudiante) {
            estudiantes.add(estudiante);
        }

        public void mostrarUniversidad() {
            System.out.println(" Universidad: " + nombre);
            System.out.println(" Estudiantes:");
            for (Estudiante est : estudiantes) {
                System.out.println("  " + est.mostrarInfo());
            }
        }
    }

    // Método main
    public static void main(String[] args) {
        System.out.println(" Noemí Chino Blanco\n");

        Universidad uni = new Universidad("Universidad Mayor de san andres");

        Estudiante e1 = new Estudiante("Jose alenjandro", "Ingeniería", 3);
        Estudiante e2 = new Estudiante("noemi chino", "Medicina", 5);
        Estudiante e3 = new Estudiante("maria juanita", "Arquitectura", 2);

        uni.agregarEstudiante(e1);
        uni.agregarEstudiante(e2);
        uni.agregarEstudiante(e3);

        uni.mostrarUniversidad();
    }
}
