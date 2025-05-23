public class Main {
    public static void main(String[] args) {
        // Crear libros independientes
        Libro l1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Libro l2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        Libro l3 = new Libro("1984", "George Orwell");

        // Crear biblioteca y agregar libros
        Biblioteca biblio = new Biblioteca("Biblioteca Central");
        biblio.agregarLibro(l1);
        biblio.agregarLibro(l2);
        biblio.agregarLibro(l3);

        // Mostrar información
        System.out.println("== Información de la Biblioteca ==");
        biblio.mostrarBiblioteca();
    }
}
