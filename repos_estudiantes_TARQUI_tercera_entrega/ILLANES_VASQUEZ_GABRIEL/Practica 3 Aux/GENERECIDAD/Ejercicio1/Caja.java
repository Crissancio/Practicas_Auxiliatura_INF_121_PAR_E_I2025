package Genericidad1;

public class Caja<T> {
    private T contenido;

    public Caja() {
    }

    public Caja(T c) {
        contenido = c;
    }

    public T obtener() {
        return contenido;
    }

    public void guardar(T contenido) {
        this.contenido = contenido;
    }

    public void mostrar() {
        System.out.println("El contenido es: " + contenido);
    }
}
