public class Main {
    public static void main(String[] args) {

        Caja<String> cajaString = new Caja<>();
        cajaString.guardar("INF-121 Programación II");

        Caja<Integer> cajaInt = new Caja<>();
        cajaInt.guardar(123);

        System.out.println("Contenido caja String: " + cajaString.obtener());
        System.out.println("Contenido caja Integer: " + cajaInt.obtener());
    }
}