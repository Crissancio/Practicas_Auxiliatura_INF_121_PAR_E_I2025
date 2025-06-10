package Generecidad.ejercicio3.java;

public class Main {
    public static void main(String[] args) {
        
        Catalogo<Libro> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar(new Libro("El Principito"));
        catalogoLibros.agregar(new Libro("1984"));
        catalogoLibros.mostrar();
        System.out.println("¿Contiene '1984'? " + catalogoLibros.buscar(new Libro("1984")));

        
        Catalogo<Producto> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar(new Producto("Laptop"));
        catalogoProductos.agregar(new Producto("Mouse"));
        catalogoProductos.mostrar();
        System.out.println("¿Contiene 'Teclado'? " + catalogoProductos.buscar(new Producto("Teclado")));
    }
    
}
