
package maincaja;

// 1. Clase Caja<T>
public class Caja<T> {
    private T contenido;

    // a) Método guardar()
    public void guardar(T dato) {
        this.contenido = dato;
    }

    // a) Método obtener()
    public T obtener() {
        return contenido;
    }

    @Override
    public String toString() {
        return "Contenido: " + contenido;
    }
}

