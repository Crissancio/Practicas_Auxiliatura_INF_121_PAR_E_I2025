package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Catalogo<Libro> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar(new Libro("Cien Años de Soledad"));
        catalogoLibros.agregar(new Libro("El Principito"));
        System.out.println("Libros en catálogo:");
        catalogoLibros.mostrarTodo();

        Catalogo<Producto> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar(new Producto("A123", 29.99));
        catalogoProductos.agregar(new Producto("B456", 45.50));
        System.out.println("\nProductos en catálogo:");
        catalogoProductos.mostrarTodo();
    }
}