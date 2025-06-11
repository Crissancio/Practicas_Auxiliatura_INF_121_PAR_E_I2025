package Ejercicio3;

public class Libro {
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String toString() {
        return "Libro: " + titulo;
    }

    public boolean equals(Object o) {
        if (o instanceof Libro) {
            return titulo.equals(((Libro) o).titulo);
        }
        return false;
    }
}
