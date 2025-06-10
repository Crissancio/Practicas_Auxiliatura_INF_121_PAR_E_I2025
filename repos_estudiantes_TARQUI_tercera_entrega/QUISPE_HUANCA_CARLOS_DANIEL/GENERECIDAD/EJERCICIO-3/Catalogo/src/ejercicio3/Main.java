package ejercicio3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Prueba del Catálogo");
        pruebaCatalogoLibros();
        pruebaCatalogoProductos();
    }

    public static void pruebaCatalogoLibros() {
        Catalogo<Libro> catalogoLibros = new Catalogo<>();

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0307474728");
        Libro libro2 = new Libro("1984", "George Orwell", "978-0451524935");

        catalogoLibros.agregarElemento(libro1);
        catalogoLibros.agregarElemento(libro2);

        System.out.println("\nCatálogo de Libros:");
        System.out.println(catalogoLibros);

        Libro libroEncontrado = catalogoLibros.buscarElemento("1984");
        System.out.println("\nLibro encontrado: " + libroEncontrado);
    }

    public static void pruebaCatalogoProductos() {
        Catalogo<Producto> catalogoProductos = new Catalogo<>();

        Producto producto1 = new Producto("Laptop", 900, "LP-12345");
        Producto producto2 = new Producto("Teléfono", 500, "TL-67890");

        catalogoProductos.agregarElemento(producto1);
        catalogoProductos.agregarElemento(producto2);

        System.out.println("\nCatálogo de Productos:");
        System.out.println(catalogoProductos);

        Producto productoEncontrado = catalogoProductos.buscarElemento("Laptop");
        System.out.println("\nProducto encontrado: " + productoEncontrado);
    }
}