package EJERCICIO2;

public class Libro {
    String titulo;
    String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + "', autor='" + autor + " ";
    }
}
