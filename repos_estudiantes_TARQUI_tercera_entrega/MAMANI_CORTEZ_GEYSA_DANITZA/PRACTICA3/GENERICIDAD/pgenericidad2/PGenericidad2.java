/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgenericidad2;

/**
 *
 * @author Administrador
 */
public class PGenericidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // b) Prueba con libros
        Catalogo<Libro> catalogoL = new Catalogo<>();
        Libro lib1 = new Libro("Vegetariana", "Han Kang");
        Libro lib2 = new Libro("El Principe", "Nicolas Maquiavelo");

        catalogoL.agregar(lib1);
        catalogoL.agregar(lib2);

        System.out.println("Catálogo de libros:");
        catalogoL.mostrar();
        System.out.println(catalogoL.buscar(lib1));

        // c) Prueba con productos
        Catalogo<Producto> catalogoP = new Catalogo<>();
        Producto prod1 = new Producto("Celular", 1709.99);
        Producto prod2 = new Producto("audifonos", 25.90);

        catalogoP.agregar(prod1);
        catalogoP.agregar(prod2);

        System.out.println("\nCatálogo de productos:");
        catalogoP.mostrar();
        System.out.println( catalogoP.buscar(prod2));
    }
    
}
