public class Caja<T> {
    private T contenido;

    public void guardar(T valor) {
        contenido = valor;
    }

    public T obtener() {
        return contenido;
    }
}
