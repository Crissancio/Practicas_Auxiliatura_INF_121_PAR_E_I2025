package Composicion7;

public class Universidad {
    private String nombre;
    private Estudiante[] estudiantes;
    private int cantidad;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new Estudiante[100]; // máximo 100 estudiantes
        this.cantidad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (cantidad < estudiantes.length) {
            estudiantes[cantidad] = estudiante;
            cantidad++;
        }
    }

    public void mostrarUniversidad() {
        System.out.println("Universidad: " + nombre);
        for (int i = 0; i < cantidad; i++) {
            estudiantes[i].mostrarInfo();
        }
    }
}
