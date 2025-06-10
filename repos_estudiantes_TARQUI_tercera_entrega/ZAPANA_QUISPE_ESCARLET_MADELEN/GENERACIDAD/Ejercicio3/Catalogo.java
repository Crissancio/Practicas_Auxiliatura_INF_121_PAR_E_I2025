import java.util.ArrayList;
import java.util.List;

public class Catalogo<T> {
    private List<T> elementos;

    public Catalogo() {
        elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public List<T> buscar(T criterio) {
        List<T> resultados = new ArrayList<>();
        for (T elemento : elementos) {
            if (elemento.equals(criterio)) {
                resultados.add(elemento);
            }
        }
        return resultados;
    }

    public void mostrar() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
