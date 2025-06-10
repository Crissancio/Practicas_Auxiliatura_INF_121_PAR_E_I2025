public class Main {
    public static void main(String[] args) {
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Hola mundo");

        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(123);

        System.out.println("Contenido de cajaTexto: " + cajaTexto.obtener());
        System.out.println("Contenido de cajaNumero: " + cajaNumero.obtener());
    }
}
