package Generecidad.Ejer3.codigo;

//3. Crea una clase genérica Catalogo<T> que almacene productos o libros.
//a) Agrega métodos para agregar y buscar elemento
//b) Prueba el catálogo con libros
//c) Prueba el catálogo con productos

public class Main {
    public static void main(String[] args) {
        Catalogo<Libro> libros = new Catalogo<>();
        libros.agregar(new Libro("Los Secretos de Youtube", "Thegrefg"));
        libros.agregar(new Libro("La Odisea", "Homero"));

        System.out.println("Está Los Secretos de Youtube ? " + libros.buscar(new Libro("Los Secretos de Youtube", "Thegrefg")));
        System.out.println("Libros en catálogo: " + libros.obtenerTodos());

        Catalogo<Producto> productos = new Catalogo<>();
        productos.agregar(new Producto("Chocolates", 60.00));
        productos.agregar(new Producto("Oreos", 3.50));

        System.out.println("Está Chocolates ? " + productos.buscar(new Producto("Chocolates", 60.00)));
        System.out.println("Productos en catálogo: " + productos.obtenerTodos());
    }
}