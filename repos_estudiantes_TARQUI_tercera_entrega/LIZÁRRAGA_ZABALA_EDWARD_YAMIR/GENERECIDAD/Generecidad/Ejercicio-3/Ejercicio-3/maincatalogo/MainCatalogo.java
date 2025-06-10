
package maincatalogo;

public class MainCatalogo {
    public static void main(String[] args) {
        // b) Prueba del catálogo con libros
        Catalogo<Libro> catalogoLibros = new Catalogo<>();
        Libro l1 = new Libro("El Quijote", "Cervantes");
        Libro l2 = new Libro("Cien Anios de Soledad", "Gabriel Garcia Marquez");

        catalogoLibros.agregarElemento(l1);
        catalogoLibros.agregarElemento(l2);

        System.out.println("Catalogo de Libros:");
        catalogoLibros.mostrarElementos();

        System.out.println("Se encuentra 'El Quijote'? " + catalogoLibros.buscarElemento(new Libro("El Quijote", "Cervantes")));

        // c) Prueba del catálogo con productos
        Catalogo<Producto> catalogoProductos = new Catalogo<>();
        Producto p1 = new Producto("Laptop", 1000.0);
        Producto p2 = new Producto("Telefono", 500.0);

        catalogoProductos.agregarElemento(p1);
        catalogoProductos.agregarElemento(p2);

        System.out.println("\nCatalogo de Productos:");
        catalogoProductos.mostrarElementos();

        System.out.println("Se encuentra 'Laptop'? " + catalogoProductos.buscarElemento(new Producto("Laptop", 1000.0)));
    }
}


