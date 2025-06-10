package EJERCICIO1;

public class Main {
    public static void main(String[] args) {
        Caja<Integer> cajaEntero = new Caja<>(123);
        System.out.println("Caja de numeros: " + cajaEntero.obtener());
        Caja<String> Texto = new Caja<String>("hola");
        System.out.println("Caja de texto: " + Texto.obtener());
    }
}
