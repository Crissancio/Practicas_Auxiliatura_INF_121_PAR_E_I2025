package Generecidad.Ejercicio3.Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 3: Clase Generica Catalogo ---");

        // b) 
        System.out.println("\n--- Probando Catalogo de Libros ---");
        Catalogo<Libro> catalogoLibros = new Catalogo<>(); 

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", "978-0307474474", 15.99);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-8424118029", 12.50);
        Libro libro3 = new Libro("1984", "George Orwell", "978-0451524935", 9.50);

        catalogoLibros.agregarElemento(libro1);
        catalogoLibros.agregarElemento(libro2);
        catalogoLibros.agregarElemento(libro3);

        catalogoLibros.mostrarCatalogo();

        Libro libroEncontrado1 = catalogoLibros.buscarElemento("cien años");
        if (libroEncontrado1 != null) {
            System.out.println("Encontrado: " + libroEncontrado1);
        } else {
            System.out.println("Libro no encontrado.");
        }

        Libro libroEncontrado2 = catalogoLibros.buscarElemento("84241");
        if (libroEncontrado2 != null) {
            System.out.println("Encontrado: " + libroEncontrado2);
        } else {
            System.out.println("Libro no encontrado.");
        }

        Libro libroNoEncontrado = catalogoLibros.buscarElemento("El Principito");
        if (libroNoEncontrado != null) {
            System.out.println("Encontrado: " + libroNoEncontrado);
        } else {
            System.out.println("Libro 'El Principito' no encontrado.");


        }
        // c) 
        System.out.println("\n--- Probando Catalogo de Productos ---");
        Catalogo<Producto> catalogoProductos = new Catalogo<>(); 

        Producto producto1 = new Producto("Monitor HP 24'", "MON-HP-001", 250.00);
        Producto producto2 = new Producto("Teclado Mecanico RGB", "TEC-GAMER-005", 85.99);
        Producto producto3 = new Producto("Mouse Optico Inalámbrico", "MOU-WIRE-010", 25.00);

        catalogoProductos.agregarElemento(producto1);
        catalogoProductos.agregarElemento(producto2);
        catalogoProductos.agregarElemento(producto3);

        catalogoProductos.mostrarCatalogo();

        Producto productoEncontrado1 = catalogoProductos.buscarElemento("monitor");
        if (productoEncontrado1 != null) {
            System.out.println("Encontrado: " + productoEncontrado1);
        } else {
            System.out.println("Producto no encontrado.");
        }

        Producto productoEncontrado2 = catalogoProductos.buscarElemento("GAMER-005");
        if (productoEncontrado2 != null) {
            System.out.println("Encontrado: " + productoEncontrado2);
        } else {
            System.out.println("Producto no encontrado.");
        }

        Producto productoNoEncontrado = catalogoProductos.buscarElemento("Webcam");
        if (productoNoEncontrado != null) {
            System.out.println("Encontrado: " + productoNoEncontrado);
        } else {
            System.out.println("Producto 'Webcam' no encontrado.");
        }
    }
}

