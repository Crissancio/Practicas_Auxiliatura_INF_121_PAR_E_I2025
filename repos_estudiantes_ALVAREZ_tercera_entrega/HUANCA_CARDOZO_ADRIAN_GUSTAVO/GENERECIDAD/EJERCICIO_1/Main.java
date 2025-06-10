package GENERECIDAD.EJERCICIO_1;

public class Main {
    public static void main(String[] args) {
        Caja<String> cajaDeTexto = new Caja<>();
        cajaDeTexto.guardar("Hola Mundo");

        Caja<Integer> cajaDeNumero = new Caja<>();
        cajaDeNumero.guardar(123);

        System.out.println("Contenido de la caja de texto: " + cajaDeTexto.obtener());
        System.out.println("Contenido de la caja de número: " + cajaDeNumero.obtener());
    }
}
