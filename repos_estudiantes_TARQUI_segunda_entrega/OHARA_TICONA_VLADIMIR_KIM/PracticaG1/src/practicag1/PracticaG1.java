package practicag1;
/**
 *
 * Vladimir Ohara
 */
public class PracticaG1<T> {
    private T contenido;

    public void guardar(T item) {
        contenido = item;
    }

    public T obtener() {
        return contenido;
    }

    public static void main(String[] args) {
        PracticaG1<Integer> caja1 = new PracticaG1<>();
        caja1.guardar(100);

        PracticaG1<String> caja2 = new PracticaG1<>();
        caja2.guardar("Hola mundo");

        System.out.println("PracticaG1 1 contiene: " + caja1.obtener());
        System.out.println("PracticaG1 2 contiene: " + caja2.obtener());
    }
}

