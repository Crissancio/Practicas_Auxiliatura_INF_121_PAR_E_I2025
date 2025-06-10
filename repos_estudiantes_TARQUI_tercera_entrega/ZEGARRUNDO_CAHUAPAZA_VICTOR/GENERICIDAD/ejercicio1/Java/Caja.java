package ejercicio1;
public class Caja<T> {
    private T contenido;

    public void guardar(T valor) {
        this.contenido = valor;
    }

    public T obtener() {
        return contenido;
    }

    public static void main(String[] args) {
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("CapibarasFC");

        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(123);

        System.out.println("Caja de texto: " + cajaTexto.obtener());
        System.out.println("Caja de número: " + cajaNumero.obtener());
    }
}