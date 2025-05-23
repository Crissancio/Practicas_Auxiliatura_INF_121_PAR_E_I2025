import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarBiblioteca() {
        System.out.println("Biblioteca: " + nombre);
        System.out.println("Libros disponibles:");
        for (Libro libro : libros) {
            System.out.println("  - " + libro.mostrarInfo());
        }
    }
}