import java.util.ArrayList;
import java.util.List;

public class Catalogo<T> {
    private List<T> elementos;
    
    public Catalogo() {
        this.elementos = new ArrayList<>();
    }
    
    public void agregar(T elemento) {
        this.elementos.add(elemento);
        System.out.println("Elemento agregado al catálogo: " + elemento);
    }
    
    public T buscar(String criterio) {
        for (T elemento : elementos) {
            if (elemento instanceof Libro) {
                Libro libro = (Libro) elemento;
                if (libro.getTitulo().equals(criterio)) {
                    return elemento;
                }
            } else if (elemento instanceof Producto) {
                Producto producto = (Producto) elemento;
                if (producto.getNombre().equals(criterio)) {
                    return elemento;
                }
            }
        }
        return null;
    }
    
    public void mostrarTodos() {
        if (elementos.isEmpty()) {
            System.out.println("El catálogo está vacío");
        } else {
            System.out.println("Elementos en el catálogo:");
            for (int i = 0; i < elementos.size(); i++) {
                System.out.println((i + 1) + ". " + elementos.get(i));
            }
        }
    }
    
    public int size() {
        return elementos.size();
    }
}