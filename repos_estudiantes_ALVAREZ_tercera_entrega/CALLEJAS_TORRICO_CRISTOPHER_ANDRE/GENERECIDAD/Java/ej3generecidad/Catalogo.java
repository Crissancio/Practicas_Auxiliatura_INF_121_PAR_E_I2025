package ej3genericidad;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Catalogo<T> {
    private List<T> elementos;

    public Catalogo() {
        elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public List<T> buscar(Predicate<T> criterio) {
        List<T> resultado = new ArrayList<>();
        for (T elemento : elementos) {
            if (criterio.test(elemento)) {
                resultado.add(elemento);
            }
        }
        return resultado;
    }

    public void mostrar() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
