
package maincatalogo;

import java.util.ArrayList;

public class Catalogo<T> {
    private ArrayList<T> elementos;

    public Catalogo() {
        elementos = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    public boolean buscarElemento(T elemento) {
        return elementos.contains(elemento);
    }

    public void mostrarElementos() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}


