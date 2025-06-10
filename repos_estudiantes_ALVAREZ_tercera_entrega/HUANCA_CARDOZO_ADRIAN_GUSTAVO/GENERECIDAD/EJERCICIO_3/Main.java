package GENERECIDAD.EJERCICIO_3;

public class Main {
    public static void main(String[] args) {
        Catalogo<Libro> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar(new Libro("El Quijote"));
        catalogoLibros.agregar(new Libro("1984"));

        System.out.println(catalogoLibros.buscar(0));
        System.out.println(catalogoLibros.buscar(1));

        Catalogo<Producto> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar(new Producto("Laptop"));
        catalogoProductos.agregar(new Producto("Teléfono"));

        System.out.println(catalogoProductos.buscar(0));
        System.out.println(catalogoProductos.buscar(1));
    }
}
