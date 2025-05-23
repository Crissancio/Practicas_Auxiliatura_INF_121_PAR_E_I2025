
//4. Crea un POO para una universidad y sus estudiantes. La universidad contiene estudiantes, pero los estudiantes pueden existir independientemente de la universidad.
//a) Implementa las clases con sus constructores, getters y setters.
import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Estudiante> estudiantes;

    Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void agregar_estudainte(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrar_universidad() {
        System.out.println("Universidad: " + getNombre() + "\nEstudiantes: ");
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante est = estudiantes.get(i);
            est.mostrar_info();
        }
    }

}
