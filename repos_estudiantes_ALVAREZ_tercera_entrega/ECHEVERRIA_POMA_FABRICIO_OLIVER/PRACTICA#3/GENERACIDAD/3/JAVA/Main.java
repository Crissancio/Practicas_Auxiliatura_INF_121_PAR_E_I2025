
/*
 * 
 * ---------------- EJERICICIO 3 ----------------
 * 
 * 
 * Crea una clase genérica Catalogo<T> que almacene productos o libros. 
 * a) Agrega métodos para agregar y buscar elemento 
 * b) Prueba el catálogo con libros 
 * c) Prueba el catálogo con productos
 * 
 */
public class Main {
    
    public static void main(String[] args) {
        //b)
        System.out.println("PRUEBA CON LIBROS:");
        System.out.println("------------------------------");
        
        Catalogo<Libro> catalogoLibros = new Catalogo<>();
        
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0307474278");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-8424116859");
        Libro libro3 = new Libro("1984", "George Orwell", "978-0451524935");
        
        catalogoLibros.agregar(libro1);
        catalogoLibros.agregar(libro2);
        catalogoLibros.agregar(libro3);
        
        System.out.println("\nTotal de libros en catálogo: " + catalogoLibros.size());
        catalogoLibros.mostrarTodos();
        
        System.out.println("\nBuscando libro '1984':");
        Libro libroEncontrado = catalogoLibros.buscar("1984");
        if (libroEncontrado != null) {
            System.out.println("Encontrado: " + libroEncontrado);
        } else {
            System.out.println("Libro no encontrado");
        }
        
        //c)
        System.out.println("\n\nPRUEBA CON PRODUCTOS:");
        System.out.println("------------------------------");
        
        Catalogo<Producto> catalogoProductos = new Catalogo<>();
        
        Producto producto1 = new Producto("Laptop Dell", 899.99, "DELL001");
        Producto producto2 = new Producto("Mouse Logitech", 29.99, "LOG002");
        Producto producto3 = new Producto("Teclado Mecánico", 79.99, "KEY003");
        
        catalogoProductos.agregar(producto1);
        catalogoProductos.agregar(producto2);
        catalogoProductos.agregar(producto3);
        
        System.out.println("\nTotal de productos en catálogo: " + catalogoProductos.size());
        catalogoProductos.mostrarTodos();
        
        System.out.println("\nBuscando producto 'Mouse Logitech':");
        Producto productoEncontrado = catalogoProductos.buscar("Mouse Logitech");
        if (productoEncontrado != null) {
            System.out.println("Encontrado: " + productoEncontrado);
        } else {
            System.out.println("Producto no encontrado");
        }
    }
}