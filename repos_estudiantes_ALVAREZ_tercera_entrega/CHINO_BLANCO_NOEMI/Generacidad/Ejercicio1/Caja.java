
public class Caja<T> {
    private T contenido;

    public void guardar(T objeto) {
        this.contenido = objeto;
    }

    public T obtener() {
        return contenido;
    }

    public static void main(String[] args) {
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("demostracion");

        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(1224);

        System.out.println("Contenido de cajaTexto: " + cajaTexto.obtener());
        System.out.println("Contenido de cajaNumero: " + cajaNumero.obtener());
        System.out.println("noemi chino blanco");
    }
}
