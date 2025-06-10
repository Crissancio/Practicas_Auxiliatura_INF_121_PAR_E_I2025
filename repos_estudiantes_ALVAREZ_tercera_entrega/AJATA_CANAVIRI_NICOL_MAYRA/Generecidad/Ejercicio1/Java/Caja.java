package Generecidad.Ejercicio1.Java;

public class Caja<T> { 
    private T contenido; 

    // a)
    public void guardar(T objeto) {
        this.contenido = objeto;
    }

    public T obtener() {
        return contenido;
    }

    @Override
    public String toString() {
        return "Contenido de la Caja: " + contenido;
    }
}
