package GENERECIDAD.EJER_1;
public class Caja<T> {
    private T contenido;
    
    // a) Método para guardar un objeto en la caja
    public void guardar(T contenido) {
        this.contenido = contenido;
    }
    
    // a) Método para obtener el contenido de la caja
    public T obtener() {
        return contenido;
    }
}