public class MainBiblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("1984", "George Orwell");
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry");
        
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
 
        biblioteca.agregar_libro(libro1);
        biblioteca.agregar_libro(libro2);
        biblioteca.agregar_libro(libro3);
        biblioteca.mostrar_biblioteca();

        System.out.println("\nLibro independiente:");
        libro1.mostrar_info();
    }
}

cd "/workspaces/practica2/casa-habitacion ejercico 1/casa-habitacion"