/*
 Crea una clase genérica Catalogo<T> que almacene productos o libros.
a) Agrega métodos para agregar y buscar elemento
b) Prueba el catálogo con libros
c) Prueba el catálogo con productos
 */
package catalogo;
import java.util.ArrayList;
class Catalogo<T> {
    private ArrayList<T> elementos = new ArrayList<>();

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public boolean buscar(T elemento) {
        return elementos.contains(elemento);
    }

    public void mostrar() {
        for (T e : elementos) {
            System.out.println(e);
        }
    }
}

 
