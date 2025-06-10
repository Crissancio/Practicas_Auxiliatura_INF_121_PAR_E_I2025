package EJERCICIO2;

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

    public T buscar(buscador<T> busc) {
        for (int i = 0; i < elementos.size(); i++) {
            T elemento = elementos.get(i);
            if (busc.coincide(elemento)) {
                return elemento;
            }
        }
        return null;
    }

    public List<T> getElementos() {
        return elementos;
    }

    public interface buscador<T> {
        boolean coincide(T elemento);
    }
}