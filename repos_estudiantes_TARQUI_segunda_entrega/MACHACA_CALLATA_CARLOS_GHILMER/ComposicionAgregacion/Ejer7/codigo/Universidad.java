package ComposicionAgregacion.Ejer7.codigo;

public class Universidad {
    public String nombre;
    public Estudiante[] estudiantes;

    public Universidad(String nombre, Estudiante[] estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
    public void agregar_estudiante(Estudiante estudiante){
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] == null) {
                estudiantes[i] = new Estudiante(estudiante.getNombre(), estudiante.getCarrera(), estudiante.getSemestre());
                break;
            }
        }
        
    }
    public void mostrar_universidad() {
        System.out.println("Nombre de la Universidad: " + nombre);
        System.out.println("Lista de estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null) {
                estudiantes[i].mostrar_info();
            }
        }

    }
}