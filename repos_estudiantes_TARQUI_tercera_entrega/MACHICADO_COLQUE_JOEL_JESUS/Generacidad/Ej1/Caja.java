package Generacidad.Ej1;

public class Caja<T> {
    private T contenido;

    public void guardar(T item) {
        this.contenido = item;
    }

    public T obtener() {
        return contenido;
    }

    public static void main(String[] args) {
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("¡Hola mundo!");
        System.out.println("Caja de texto: " + cajaTexto.obtener());

        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(123);
        System.out.println("Caja de número: " + cajaNumero.obtener());
    }
}
