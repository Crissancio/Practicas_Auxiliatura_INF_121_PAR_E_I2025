package GENERECIDAD.EJERCICIO_1;

public class Caja<T> {
    private T contenido;

    public void guardar(T elemento) {
        this.contenido = elemento;
    }

    public T obtener() {
        return contenido;
    }
}
