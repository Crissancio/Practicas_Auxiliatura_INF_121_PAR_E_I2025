import java.util.ArrayList;
public class Catalogo<T> {
    private ArrayList<T> elementos = new ArrayList<>();
    public void agregar(T item) {
        elementos.add(item);
    }
    public boolean buscar(T item) {
        return elementos.contains(item);
    }
    public static void main(String[] args) {
        Catalogo<String> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar("El Quijote");
        catalogoLibros.agregar("1984");
        System.out.println("¿Está '1984' en el catálogo de libros? " + catalogoLibros.buscar("1984"));
        Catalogo<Integer> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar(101);
        catalogoProductos.agregar(202);
        System.out.println("¿Está el producto con código 303? " + catalogoProductos.buscar(303));
    }
}