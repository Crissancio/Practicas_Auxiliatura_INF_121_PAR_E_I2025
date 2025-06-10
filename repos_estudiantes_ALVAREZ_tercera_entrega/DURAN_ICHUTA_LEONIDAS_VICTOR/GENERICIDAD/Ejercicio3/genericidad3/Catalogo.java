package genericidad3;

import java.util.ArrayList;
import java.util.List;
//a)
public class Catalogo<T> {
    private List<T> elementos;

    public Catalogo() {
        elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public boolean buscar(T elemento) {
        return elementos.contains(elemento);
    }

    public void mostrarCatalogo() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}