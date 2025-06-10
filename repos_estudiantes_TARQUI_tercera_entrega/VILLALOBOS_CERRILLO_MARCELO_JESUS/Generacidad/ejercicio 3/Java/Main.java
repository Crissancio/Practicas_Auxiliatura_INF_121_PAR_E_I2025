import java.util.ArrayList;
class Catalogo<T> {
    private ArrayList<T> elementos = new ArrayList<>();
    public void agregar(T elemento) {
        elementos.add(elemento);
    }
    public boolean buscar(T elemento) {
        return elementos.contains(elemento);
    }
    public void mostrarTodos() {
        for (T e : elementos) {
            System.out.println(e);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Catalogo<String> libros = new Catalogo<>();
        libros.agregar("Cien Años de Soledad");
        libros.agregar("Don Quijote");
        libros.mostrarTodos();
        System.out.println("Existe Don Quijote?: " + libros.buscar("Don Quijote"));
        Catalogo<String> productos = new Catalogo<>();
        productos.agregar("Laptop");
        productos.agregar("Telefono");
        productos.mostrarTodos();
    }
}