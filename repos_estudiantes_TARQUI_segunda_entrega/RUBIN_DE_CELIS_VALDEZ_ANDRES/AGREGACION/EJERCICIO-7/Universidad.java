import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregar_estudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrar_universidad() {
        System.out.println("Universidad: " + nombre);
        System.out.println("Estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrar_info();
        }
    }
}
