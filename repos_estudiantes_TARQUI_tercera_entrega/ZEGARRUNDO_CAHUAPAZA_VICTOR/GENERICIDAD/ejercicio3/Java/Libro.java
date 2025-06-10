package ejercicio3;

public class Libro {
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }
    
    public String toString() {
        return "Libro: " + titulo;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Libro)) return false;
        Libro otro = (Libro) obj;
        return this.titulo.equals(otro.titulo);
    }

    public int hashCode() {
        return titulo.hashCode();
    }
}