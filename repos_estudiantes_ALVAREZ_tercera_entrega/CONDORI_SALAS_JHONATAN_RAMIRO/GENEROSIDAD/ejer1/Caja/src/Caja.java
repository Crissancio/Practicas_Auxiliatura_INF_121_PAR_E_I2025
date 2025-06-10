public class Caja<T> {
    private T contenido;
    public void guardar(T valor) {
        this.contenido = valor;
    }
    public T obtener() {
        return contenido;
    }
    public static void main(String[] args) {
        Caja<Integer> cajaEntero = new Caja<>();
        cajaEntero.guardar(123);
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Hola mundo");
        System.out.println("Contenido de la caja de enteros: " + cajaEntero.obtener());
        System.out.println("Contenido de la caja de textos: " + cajaTexto.obtener());
    }
}