package Generecidad.Ejercicio3.Java;

public class Libro implements Buscarable {
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;

    public Libro(String titulo, String autor, String isbn, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return String.format("Libro: '%s' por %s (ISBN: %s, Precio: $%.2f)", titulo, autor, isbn, precio);
    }

    @Override
    public boolean esSimilar(String criterio) {
        String lowerCaseCriterio = criterio.toLowerCase();
        return this.titulo.toLowerCase().contains(lowerCaseCriterio) ||
               this.isbn.toLowerCase().contains(lowerCaseCriterio);
    }
}
