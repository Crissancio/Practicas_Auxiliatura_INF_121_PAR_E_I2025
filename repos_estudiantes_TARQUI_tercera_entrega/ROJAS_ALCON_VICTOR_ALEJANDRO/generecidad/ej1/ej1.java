class Caja<T> {
    private T contenido;

    public void guardar(T item) {
        contenido = item;
    }

    public T obtener() {
        return contenido;
    }
}

public class Main {
    public static void main(String[] args) {
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Hola Auxi");

        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(123456);

        System.out.println("Caja de texto: " + cajaTexto.obtener());
        System.out.println("Caja de número: " + cajaNumero.obtener());
    }
}