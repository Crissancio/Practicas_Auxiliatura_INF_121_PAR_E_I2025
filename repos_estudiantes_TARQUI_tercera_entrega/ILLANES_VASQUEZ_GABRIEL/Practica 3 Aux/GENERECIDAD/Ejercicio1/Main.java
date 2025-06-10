package Genericidad1;

public class Main {
    public static void main(String[] args) {
        Caja<String> C1 = new Caja<>("Carta de Recomendacion");
        C1.guardar("Carta de Recomendacion");

        Caja<Integer> C2 = new Caja<>(250);
        C2.guardar(250);

        System.out.println("--------");
        System.out.println(C1.obtener());
        C1.mostrar();

        System.out.println("--------");
        System.out.println(C2.obtener());
        C2.mostrar();
    }
}
