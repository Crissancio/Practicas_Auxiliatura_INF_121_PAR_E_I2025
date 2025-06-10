package Generacidad.Ejercicio2;


import java.util.ArrayList;

public class Catalogo<T> {
    private ArrayList<T> elementos;

    public Catalogo() {
        elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T buscar(String criterio) {
        for (T e : elementos) {
            if (e.toString().contains(criterio)) {
                return e;
            }
        }
        return null;
    }

    public void mostrarCatalogo() {
        for (T e : elementos) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Catalogo<String> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar("Adela zamudio");
        catalogoLibros.agregar("LA VACA");
        System.out.println(" Catálogo de Libros:");
        catalogoLibros.mostrarCatalogo();

        Catalogo<String> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar("Radio");
        catalogoProductos.agregar("antena");
        System.out.println(" Catálogo de Productos:");
        System.out.println("noemi chino blanco");
        catalogoProductos.mostrarCatalogo();
    }
}
 
    

