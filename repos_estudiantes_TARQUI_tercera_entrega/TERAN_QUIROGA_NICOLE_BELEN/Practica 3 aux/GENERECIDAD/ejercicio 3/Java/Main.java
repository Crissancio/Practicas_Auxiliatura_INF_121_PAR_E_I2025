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
        libros.agregar("El principito");
        libros.agregar("100 dias sin ti");
        libros.mostrarTodos();
        System.out.println("Existe el principito?: " + libros.buscar("El principito"));
        Catalogo<String> productos = new Catalogo<>();
        productos.agregar("Tablet");
        productos.agregar("Celular");
        productos.mostrarTodos();
    }
}