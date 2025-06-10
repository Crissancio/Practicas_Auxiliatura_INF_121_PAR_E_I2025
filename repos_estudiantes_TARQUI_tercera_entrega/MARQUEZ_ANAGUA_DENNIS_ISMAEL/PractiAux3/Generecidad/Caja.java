public class Caja<T> {
    private T contenido;

    public Caja() {
        this.contenido = null;
    }

    public void guardar(T item) {
        this.contenido = item;
    }

    public T obtener() {
        return this.contenido;
    }

    @Override
    public String toString() {
        return "Caja contiene: " + contenido;
    }

    public static void main(String[] args) {
        Caja<Integer> cajaEntera = new Caja<>();
        cajaEntera.guardar(23);
        System.out.println(cajaEntera);

        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("System of a Down - Prison Song");
        System.out.println(cajaTexto);
    }
}