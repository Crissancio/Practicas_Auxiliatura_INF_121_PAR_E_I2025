package Generacidad.Ej3;

import java.util.ArrayList;

public class Catalogo<T> {
    private ArrayList<T> elementos = new ArrayList<>();

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T buscar(int index) {
        if (index >= 0 && index < elementos.size()) {
            return elementos.get(index);
        }
        return null;
    }

    public static void main(String[] args) {
        // Catálogo de Libros
        Catalogo<String> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar("El Principito");
        catalogoLibros.agregar("Cien años de soledad");
        System.out.println("Libro encontrado: " + catalogoLibros.buscar(1));

        // Catálogo de Productos
        Catalogo<Double> catalogoPrecios = new Catalogo<>();
        catalogoPrecios.agregar(12.99);
        catalogoPrecios.agregar(8.50);
        System.out.println("Precio encontrado: " + catalogoPrecios.buscar(0));
    }
}
