import java.util.ArrayList;
import java.util.List;

// Clase genérica Catálogo
class Catalogo<T> {
    private List<T> elementos;

    public Catalogo() {
        this.elementos = new ArrayList<>();
    }

    // a) Método para agregar elemento
    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    // a) Método para buscar elemento
    public T buscar(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            return elementos.get(indice);
        }
        return null;
    }

    public void listarElementos() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
