package ejercicio3;

public class Libro {
    private String titulo;
    private String autor;
    private String datosLibro;

    public Libro(String titulo, String autor, String datosLibro) {
        this.titulo = titulo;
        this.autor = autor;
        this.datosLibro = datosLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getDatosLibro() {
        return datosLibro;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + " por " + autor + " (Datos: " + datosLibro + ")";
    }
}