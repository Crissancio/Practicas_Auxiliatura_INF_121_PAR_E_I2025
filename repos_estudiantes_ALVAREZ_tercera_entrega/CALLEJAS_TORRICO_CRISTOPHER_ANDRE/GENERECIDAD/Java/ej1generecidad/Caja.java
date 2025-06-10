package ej1genericidad;

public class Caja<T> {
    private T contenido;

    public Caja() {
        this.contenido = null;
    }

    public void guardar(T contenido) {
        this.contenido = contenido;
    }

    public T obtener() {
        return contenido;
    }

    @Override
    public String toString() {
        return "Caja contiene: " + contenido;
    }
}
