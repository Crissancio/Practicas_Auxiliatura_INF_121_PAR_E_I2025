package Ejercicio3;
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

    public boolean buscar(T elemento) {
        return elementos.contains(elemento);
    }

    public void mostrar() {
    	for (int i = 0; i < elementos.size(); i++) {
    	    System.out.println(elementos.get(i));
    	}
    }
}
