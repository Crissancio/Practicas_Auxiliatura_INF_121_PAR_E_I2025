package Ejercicio1;

// Clase genérica Caja
public class Caja<T> {
    private T contenido;

    // Método para guardar un objeto en la caja
    public void guardar(T objeto) {
        this.contenido = objeto;
    }

    // Método para obtener el objeto de la caja
    public T obtener() {
        return contenido;
    }
}