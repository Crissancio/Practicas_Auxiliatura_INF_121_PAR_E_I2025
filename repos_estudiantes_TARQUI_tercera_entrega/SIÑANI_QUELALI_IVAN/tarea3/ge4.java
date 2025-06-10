import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Vector<T extends Comparable<T>> {
    private List<T> elementos = new ArrayList<>();
    public void agregar(T elemento) {
        elementos.add(elemento);
    }
    public T obtener(int i) {
        if (i >= 0 && i < elementos.size()) {
            return elementos.get(i);
        } else {
            return null; 
        }
    }
    public T obtenerMayor() {
        return Collections.max(elementos);
    }
    public T obtenerMenor() {
        return Collections.min(elementos);
    }
}
public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.agregar(10);
        vector.agregar(5);
        vector.agregar(20);
        
        System.out.println("Elemento en posición 1: " + vector.obtener(1));
        System.out.println("Valor mayor: " + vector.obtenerMayor());
        System.out.println("Valor menor: " + vector.obtenerMenor());
    }
}
//DIAGRAMA
//Clase Vector<T extends Comparable<T>>
//-------------------------------------
//- elementos: List<T>
//-------------------------------------
//+ agregar(T elemento): void
//+ obtener(int i): T
//+ obtenerMayor(): T
//+ obtenerMenor(): T
//-------------------------------------
//Clase Main
//-------------------------------------
//+ main(String[] args): void
//-------------------------------------
