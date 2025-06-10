/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p3.ejer3.gen;

/**
 *
 * @author Adrian
 */
/*
3. Crea una clase genérica Catalogo<T> que almacene productos o libros. 
a) Agrega métodos para agregar y buscar elemento 
b) Prueba el catálogo con libros 
c) Prueba el catálogo con productos 
*/
public class P3Ejer3Gen {
    public static void main(String[] args) {
        // b) probando con el catálogo de Libros
        Catalogo<Libro> libros = new Catalogo<>();
        
        libros.agregar(new Libro("El Principito", "Antoine de Saint-Exupéry"));
        libros.agregar(new Libro("Cien años de soledad", "Gabriel García Márquez"));
        
        System.out.println("Catalogo de Libros");
        System.out.println("Buscando el libro 'El Principito':");
        Libro libroEncontrado = libros.buscarPorTitulo("El Principito");
        if (libroEncontrado != null) {
            System.out.println("se encontro: " + libroEncontrado);
        } else {
            System.out.println("no se encontrado");
        }

        // c) probando con el catálogo de Productos
        Catalogo<Producto> productos = new Catalogo<>();
        
        productos.agregar(new Producto("Laptop", 1200.99));
        productos.agregar(new Producto("Teléfono", 599.50));
        
        System.out.println("Catalogo de Productos");
        System.out.println("Buscando 'Teléfono':");
        Producto productoEncontrado = productos.buscarPorNombre("Teléfono");
        if (productoEncontrado != null) {
            System.out.println("se encontrado: " + productoEncontrado);
        } else {
            System.out.println("no se encontrado");
        }
    }
}
