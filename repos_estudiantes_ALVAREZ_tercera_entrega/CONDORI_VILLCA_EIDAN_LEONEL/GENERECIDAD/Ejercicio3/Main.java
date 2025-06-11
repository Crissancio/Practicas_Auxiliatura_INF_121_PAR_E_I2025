package Ejercicio3;
//3. Crea una clase genérica Catalogo&lt;T&gt; que almacene productos o libros.
//a) Agrega métodos para agregar y buscar elemento
//b) Prueba el catálogo con libros
//c) Prueba el catálogo con productos
public class Main {
    public static void main(String[] args) {
        Catalogo<Libro> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar(new Libro("Don Quijote"));
        catalogoLibros.agregar(new Libro("Amor sin materia"));
        Catalogo<Producto> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar(new Producto("Lampara"));
        catalogoProductos.agregar(new Producto("Mesa"));
        System.out.println("Catálogo de Libros:");
        catalogoLibros.mostrar();
        System.out.println("Buscar 'Amor sin materia': " + catalogoLibros.buscar(new Libro("Amor sin materia")));
        System.out.println("\nCatálogo de Productos:");
        catalogoProductos.mostrar();
        System.out.println("Buscar 'Mesa': " + catalogoProductos.buscar(new Producto("Mesa")));
    }
}
