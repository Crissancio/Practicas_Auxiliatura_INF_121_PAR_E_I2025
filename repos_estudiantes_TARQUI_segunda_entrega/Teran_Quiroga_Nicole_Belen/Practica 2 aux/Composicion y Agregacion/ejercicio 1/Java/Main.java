public class Main {
    public static void main(String[] args) {
        Casa c = new Casa("Calle Falsa 123");
        c.agregar(new Habitacion("Sala", 20));
        c.agregar(new Habitacion("Cocina", 10));
        c.agregar(new Habitacion("Dormitorio", 15));
        c.mostrar();
    }
}
