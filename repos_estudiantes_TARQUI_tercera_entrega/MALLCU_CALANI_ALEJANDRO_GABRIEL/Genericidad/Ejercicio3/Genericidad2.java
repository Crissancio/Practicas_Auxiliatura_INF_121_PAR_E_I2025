/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.genericidad2;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
import java.util.List;

// Clase genérica Catalogo<T>
class Catalogo<T> {
    private List<T> elementos = new ArrayList<>();

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T buscar(T elemento) {
        for (T item : elementos) {
            if (item.equals(elemento)) {
                return item;
            }
        }
        return null;
    }
}

// Clase Libro
class Libro {
    String titulo;
    String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Libro) {
            Libro otro = (Libro) obj;
            return this.titulo.equals(otro.titulo);
        }
        return false;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor;
    }
}

// Clase Producto
class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Producto) {
            Producto otro = (Producto) obj;
            return this.nombre.equals(otro.nombre);
        }
        return false;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}

public class Genericidad2 {
    public static void main(String[] args) {
        // b) Prueba con libros
        Catalogo<Libro> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar(new Libro("El Principito", "Antoine de Saint-Exupéry"));

        System.out.println("📚 Buscando libro: El Principito");
        Libro libroBuscado = catalogoLibros.buscar(new Libro("El Principito", ""));
        if (libroBuscado != null) {
            System.out.println("Encontrado: " + libroBuscado);
        }

        // c) Prueba con productos
        Catalogo<Producto> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar(new Producto("Laptop", 999.99));

        System.out.println("\n🛒 Buscando producto: Laptop");
        Producto productoBuscado = catalogoProductos.buscar(new Producto("Laptop", 0));
        if (productoBuscado != null) {
            System.out.println("Encontrado: " + productoBuscado);
        }
    }
}

