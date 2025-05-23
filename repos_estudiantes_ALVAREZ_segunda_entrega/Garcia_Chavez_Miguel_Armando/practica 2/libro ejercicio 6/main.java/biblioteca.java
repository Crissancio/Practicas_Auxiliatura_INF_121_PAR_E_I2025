import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private final String nombre;
    private final List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregar_libro(Libro libro) {
        libros.add(libro);
    }

    public void mostrar_biblioteca() {
        System.out.println("Biblioteca: " + nombre);
        System.out.println("Libros disponibles:");
        for (Libro l : libros) {
            l.mostrar_info();
        }
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public List<Libro> getLibros() { return libros; }
}
