import java.util.ArrayList;
import java.util.List;

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    // Método para agregar estudiante
    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante != null) {
            estudiantes.add(estudiante);
        } else {
            throw new IllegalArgumentException("El estudiante no puede ser nulo");
        }
    }

    // Método para mostrar información de la universidad
    public String mostrarUniversidad() {
        StringBuilder info = new StringBuilder();
        info.append("Universidad: ").append(nombre).append("\nEstudiantes:\n");
        
        for (int i = 0; i < estudiantes.size(); i++) {
            info.append("  ").append(i + 1).append(". ").append(estudiantes.get(i).mostrarInfo()).append("\n");
        }
        
        info.append("Total estudiantes: ").append(estudiantes.size());
        return info.toString();
    }
}