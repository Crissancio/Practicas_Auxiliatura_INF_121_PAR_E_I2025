import java.util.ArrayList;

//Crea una clase genérica Catalogo<T> que almacene productos o libros. 
public class Catalogo<T> {
    private ArrayList<T> elementos = new ArrayList<>();

    // a) Agrega métodos para agregar y buscar elemento
    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public boolean buscar(T elemento) {
        return elementos.contains(elemento);
    }

    public void mostrar() {
        for (T e : elementos) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        // b) Prueba el catálogo con libros
        Catalogo<String> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar("El Principito");
        catalogoLibros.agregar("Cien Años de Soledad");

        System.out.println("Libros:");
        catalogoLibros.mostrar();
        System.out.println("¿Existe 'El Principito'? " + catalogoLibros.buscar("El Principito"));
        // c) Prueba el catálogo con productos
        Catalogo<String> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar("Laptop");
        catalogoProductos.agregar("Mouse");

        System.out.println("\nProductos:");
        catalogoProductos.mostrar();
        System.out.println("¿Existe 'Teclado'? " + catalogoProductos.buscar("Teclado"));
    }
}
