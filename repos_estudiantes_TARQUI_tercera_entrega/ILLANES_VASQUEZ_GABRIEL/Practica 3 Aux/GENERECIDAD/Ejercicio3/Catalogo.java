package Generesidad2;

import java.util.ArrayList;

public class Catalogo<T> {
    private ArrayList<T> elementos;

    public Catalogo() {
        elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public boolean buscar(T elemento) {
    for (T e : elementos) {
        if (e.equals(elemento)) {
            return true;
        }
    }
    return false;
    }


    public void mostrarTodo() {
        for (T e : elementos) {
            System.out.println("Elemento: " + e);
        }
    }
}
