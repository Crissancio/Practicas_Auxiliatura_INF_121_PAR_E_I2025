//3. Crea una clase genérica Catalogo<T> que almacene productos o libros.


package genericidad3;

public class Genericidad3 {

    public static void main(String[] args) {
        // b)
        Catalogo<Libro> catalogoLibros = new Catalogo<>();
        Libro l1 = new Libro("Cien Anios de Soledad", "Gabriel Garcia Marquez");
        Libro l2 = new Libro("1984", "George Orwell");
        catalogoLibros.agregar(l1);
        catalogoLibros.agregar(l2);

        System.out.println("Catalogo de Libros:");
        catalogoLibros.mostrarCatalogo();
        System.out.println("¿Esta '1984'? " + catalogoLibros.buscar(new Libro("1984", "George Orwell")));
        System.out.println();

        //c) 
        Catalogo<Producto> catalogoProductos = new Catalogo<>();
        Producto p1 = new Producto("Laptop", 1500.0);
        Producto p2 = new Producto("Mouse", 25.0);
        catalogoProductos.agregar(p1);
        catalogoProductos.agregar(p2);

        System.out.println("Catalogo de Productos:");
        catalogoProductos.mostrarCatalogo();
        System.out.println("¿Esta el 'Mouse'? " + catalogoProductos.buscar(new Producto("Mouse", 25.0)));
    }
    
}
