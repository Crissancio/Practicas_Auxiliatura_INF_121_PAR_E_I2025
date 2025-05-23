package practicag2;
import java.util.ArrayList;
/**
 *
 * @Vladimir Ohara
 */
public class PracticaG2<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void agregar(T item) {
        items.add(item);
    }
    public boolean buscar(T item) {
        return items.contains(item);
    }
    public static void main(String[] args) {
        PracticaG2<String> libros = new PracticaG2<>();
        libros.agregar("Cien Años de Soledad");
        libros.agregar("1984");

        PracticaG2<String> productos = new PracticaG2<>();
        productos.agregar("Laptop");
        productos.agregar("Mouse");

        System.out.println("¿Está '1984' en libros? " + libros.buscar("1984"));
        System.out.println("¿Está 'Teclado' en productos? " + productos.buscar("Teclado"));
    }
}

