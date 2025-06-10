public class Main {
    public static void main(String[] args) {
        // b) Probar con libros
        Catalogo<Libro> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar(new Libro("Cien años de soledad", "Gabriel García Márquez"));
        catalogoLibros.agregar(new Libro("1984", "George Orwell"));

        System.out.println("Catálogo de Libros:");
        catalogoLibros.listarElementos();
        System.out.println("Buscando libro en posición 1: " + catalogoLibros.buscar(1));

        // c) Probar con productos
        Catalogo<Producto> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar(new Producto("Laptop", 1200.99));
        catalogoProductos.agregar(new Producto("Smartphone", 599.50));

        System.out.println("\nCatálogo de Productos:");
        catalogoProductos.listarElementos();
        System.out.println("Buscando producto en posición 0: " + catalogoProductos.buscar(0));
    }
}
