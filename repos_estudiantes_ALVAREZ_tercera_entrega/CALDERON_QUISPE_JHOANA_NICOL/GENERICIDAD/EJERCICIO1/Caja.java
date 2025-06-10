package EJERCICIO1;

public class Caja<T> {
    private T valor;

    public Caja(T valor) {
        this.valor = valor;
    }

    public void guardar(T nuevoValor) {
        this.valor = nuevoValor;
    }

    public T obtener() {
        return valor;
    }
}