package EJERCICIO2;

public class Main {
    public static void main(String[] args) {
        Catalogo<Libro> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar(new Libro("Crar o Morir", "Andres Oppenheimer"));
        catalogoLibros.agregar(new Libro("Los Secretos de la Mente Millonaria", "T. harv Eker"));
        catalogoLibros.agregar(new Libro("NeuroVentas", "Nestor Braidot"));

        Libro libroBuscado = catalogoLibros.buscar(libro -> libro.titulo.equals("NeuroVentas"));
        System.out.println("Libro : " + libroBuscado);

        Catalogo<Producto> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar(new Producto("Lapicero", 101));
        catalogoProductos.agregar(new Producto("Cuaderno", 102));
        catalogoProductos.agregar(new Producto("Borrador", 103));

        Producto productoBuscado = catalogoProductos.buscar(producto -> producto.codigo == 102);
        System.out.println("Producto: " + productoBuscado);
    }
}
