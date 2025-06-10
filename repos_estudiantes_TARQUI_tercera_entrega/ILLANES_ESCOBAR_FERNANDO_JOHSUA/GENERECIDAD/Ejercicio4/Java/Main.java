package GENERECIDAD.Ejercicio4.Java;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.agregar(5);
        vector.agregar(20);
        vector.agregar(13);

        System.out.println("Elemento en posición 1: " + vector.obtener(1));
        System.out.println("Mayor: " + vector.valorMayor());
        System.out.println("Menor: " + vector.valorMenor());
    }
}