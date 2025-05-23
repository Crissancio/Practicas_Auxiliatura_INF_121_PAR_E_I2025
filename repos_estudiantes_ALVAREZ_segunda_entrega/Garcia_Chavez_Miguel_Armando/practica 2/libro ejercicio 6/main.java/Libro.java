

class Libro {
    private final String título;
    private final String autor;

    public Libro(String título, String autor) {
        this.título = título;
        this.autor = autor;
    }

    public void mostrar_info() {
        System.out.println("Libro: " + título + " - Autor: " + autor);
    }

    // Getters y setters
    public String getTítulo() { return título; }
    public String getAutor() { return autor; }
}
