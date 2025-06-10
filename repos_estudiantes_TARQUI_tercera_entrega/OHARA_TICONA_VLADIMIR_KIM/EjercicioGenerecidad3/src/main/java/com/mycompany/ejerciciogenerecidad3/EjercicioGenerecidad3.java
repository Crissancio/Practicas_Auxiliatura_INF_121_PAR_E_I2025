package com.mycompany.ejerciciogenerecidad3;
import java.util.*;
/**
 *
 * @author Vladimir Ohara
 */
class Catalogo<T> {
    private List<T> elementos;

    public Catalogo() {
        elementos = new ArrayList<>();
    }
//Inciso A
    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public boolean buscar(T elemento) {
        return elementos.contains(elemento);
    }

    public void mostrarTodos() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
class Libro {
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Libro) {
            return this.titulo.equals(((Libro) obj).titulo);
        }
        return false;
    }
}
class Producto {
    private String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Producto) {
            return this.nombre.equals(((Producto) obj).nombre);
        }
        return false;
    }
}
public class EjercicioGenerecidad3 {

    public static void main(String[] args) {
        //El inciso B
       Catalogo<Libro> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar(new Libro("Cien Años de Soledad"));
        catalogoLibros.agregar(new Libro("El Principito"));

        System.out.println("Catálogo de Libros:");
        catalogoLibros.mostrarTodos();

       //El inciso C
        Catalogo<Producto> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar(new Producto("Laptop"));
        catalogoProductos.agregar(new Producto("Smartphone"));

        System.out.println("\nCatálogo de Productos:");
        catalogoProductos.mostrarTodos();
    }
}
