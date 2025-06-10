package ej3genericidad;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Catalogo<Libro> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar(new Libro("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"));
        catalogoLibros.agregar(new Libro("Object-Oriented Software Engineering: A Use Case Driven Approach", "Ivar Jacobson"));
        catalogoLibros.agregar(new Libro("Refactoring: Improving the Design of Existing Code", "Martin Fowler"));

        System.out.println("Catálogo de Libros:");
        catalogoLibros.mostrar();

        System.out.println("\nBuscar libro de 'Ivar Jacobson':");
        List<Libro> librosFiltrados = catalogoLibros.buscar(libro -> libro.getAutor().equals("Ivar Jacobson"));
        for (Libro libro : librosFiltrados) {
            System.out.println(libro);
        }

        Catalogo<Producto> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar(new Producto("Laptop", 1500));
        catalogoProductos.agregar(new Producto("Mouse", 25));
        catalogoProductos.agregar(new Producto("Teclado", 45));

        System.out.println("\nCatálogo de Productos:");
        catalogoProductos.mostrar();

        System.out.println("\nBuscar producto con precio > 30:");
        List<Producto> productosFiltrados = catalogoProductos.buscar(p -> p.getPrecio() > 30);
        for (Producto producto : productosFiltrados) {
            System.out.println(producto);
        }
    }
}
