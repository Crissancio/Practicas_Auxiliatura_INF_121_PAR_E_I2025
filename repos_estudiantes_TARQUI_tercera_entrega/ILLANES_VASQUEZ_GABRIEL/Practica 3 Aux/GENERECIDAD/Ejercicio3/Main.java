package Generesidad2;

public class Main {
    public static void main(String[] args) {
        Catalogo<String> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar("El Principito");
        catalogoLibros.agregar("Cien Años de Soledad");
        catalogoLibros.agregar("La Odisea");

        System.out.println("Buscar 'El Principito': " + catalogoLibros.buscar("El Principito"));
        System.out.println("Buscar 'Harry Potter': " + catalogoLibros.buscar("Harry Potter"));
        System.out.println("Buscar 'La Odisea: " + catalogoLibros.buscar("La Odisea"));
        catalogoLibros.buscar("La Odisea");

        System.out.println("Libros en el catálogo:");
        catalogoLibros.mostrarTodo();

        System.out.println("--------");

        Catalogo<String> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar("Laptop");
        catalogoProductos.agregar("Teclado");

        System.out.println("Buscar 'Mouse': " + catalogoProductos.buscar("Mouse"));
        System.out.println("Buscar 'Teclado': " + catalogoProductos.buscar("Teclado"));

        System.out.println("Productos en el catálogo:");
        catalogoProductos.mostrarTodo();
    }
}
