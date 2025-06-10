package GENERECIDAD.Ejercicio2.Java;

public class Main {
    public static void main(String[] args) {
        Par<Integer, String> estudiante = new Par<>(1, "Isaac Machaca");
        Par<String, Double> producto = new Par<>("X123", 45.90);

        estudiante.mostrarPar();
        producto.mostrarPar();
    }
}