class Caja<T> {
    private T contenido;
    public void guardar(T dato) {
        contenido = dato;
    }

    public T obtener() {
        return contenido;
    }
}
public class Main {
    public static void main(String[] args) {
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Guardar algoo");
        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(123);
        System.out.println("Caja de texto: " + cajaTexto.obtener());
        System.out.println("Caja de número: " + cajaNumero.obtener());
    }
}
