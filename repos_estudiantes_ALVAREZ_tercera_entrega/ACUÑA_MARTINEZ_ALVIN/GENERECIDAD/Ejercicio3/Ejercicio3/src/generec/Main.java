package generec;

//b) y c)
public class Main {
 public static void main(String[] args) {
     // b)
     Catalogo<String> catalogoLibros = new Catalogo<>();
     catalogoLibros.agregar("El Quijote");
     catalogoLibros.agregar("Cien años de soledad");
     System.out.println("Libro encontrado: " + catalogoLibros.buscar("El Quijote"));

     // c)
     Catalogo<String> catalogoProductos = new Catalogo<>();
     catalogoProductos.agregar("Laptop");
     catalogoProductos.agregar("Celular");
     System.out.println("Producto encontrado: " + catalogoProductos.buscar("Tablet"));
 }
}