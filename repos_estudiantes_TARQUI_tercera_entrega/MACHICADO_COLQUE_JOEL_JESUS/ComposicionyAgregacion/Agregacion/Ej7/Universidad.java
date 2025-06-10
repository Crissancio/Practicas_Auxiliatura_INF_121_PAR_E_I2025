package ComposicionyAgregacion.Agregacion.Ej7;

import java.util.ArrayList;
import java.util.List;

// Clase Universidad (contiene una lista de estudiantes, pero no los "posee")
class Universidad {
    private String nombre;
    private List<Estudiante> estudiantes;

    // Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para agregar un estudiante
    public void agregar_estudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para mostrar la información de la universidad y sus estudiantes
    public void mostrar_universidad() {
        System.out.println("Universidad: " + nombre);
        System.out.println("=== Lista de Estudiantes ===");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrar_info();
        }
    }
}
