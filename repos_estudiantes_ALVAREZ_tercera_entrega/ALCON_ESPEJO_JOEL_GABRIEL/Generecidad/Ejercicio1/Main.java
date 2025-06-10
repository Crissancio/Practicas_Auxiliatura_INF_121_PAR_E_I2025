public class Main {
    public static void main(String[] args) {
        
        Caja<String> cajaDeString = new Caja<>();
        Caja<Integer> cajaDeInteger = new Caja<>();
        
        // b) Almacenar 2 datos de diferente tipo
        cajaDeString.guardar("Hola Mundo");
        cajaDeInteger.guardar(42);
        
        // c) Mostrar el contenido de las cajas
        System.out.println("Contenido de la caja de String: " + cajaDeString.obtener());
        System.out.println("Contenido de la caja de Integer: " + cajaDeInteger.obtener());
    }
}
