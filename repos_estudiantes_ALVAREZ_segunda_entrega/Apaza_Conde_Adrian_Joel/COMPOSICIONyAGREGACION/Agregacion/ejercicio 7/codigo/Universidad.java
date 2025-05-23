// a)
import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<Estudiante> estudiantes; // Agregación (no composición)
    
    public Universidad(String n) {
        this.nombre = n;
        this.estudiantes = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void agregar_estudiante(Estudiante e) {
        estudiantes.add(e);
    }
    public void mostrar_universidad() {
        System.out.println("La universidad " + nombre + ": ");
        System.out.println("\n estudiantes de la U: ");
        if (estudiantes.isEmpty()) {
            System.out.println("no hay estudiantes en la U");
        } else {
            for (Estudiante estudiante : estudiantes) {
                estudiante.mostrar_info();
            }
        }
    }
}