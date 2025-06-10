public class Main {

    public static void main(String[] args) {
        Catalogo<Libro> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar(new Libro("El hombre en busca de sentido", "Victor Frankl"));
        catalogoLibros.agregar(new Libro("Nacida en 1982", "Cho Nam-joo"));
        catalogoLibros.mostrar();

        System.out.println("Buscando libro:");
        for (Libro libro : catalogoLibros.buscar(new Libro("El hombre en busca de sentido", "Victor Frankl"))) {
            System.out.println(libro);
        }

        // Probar con productos
        Catalogo<Producto> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar(new Producto("Laptop", 999.99));
        catalogoProductos.agregar(new Producto("Impresora", 599.99));
        catalogoProductos.mostrar();

        System.out.println("Buscando producto:");
        for (Producto producto : catalogoProductos.buscar(new Producto("Laptop", 999.99))) {
            System.out.println(producto);
        }
    }
    
}
