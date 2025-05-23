public class App {
    public static void main(String[] args) throws Exception {
        Casa casa = new Casa("Calle 123");
        casa.agregarHabiitacoin("Habitacion 1", 20.5);
        casa.agregarHabiitacoin("Habitacion 2", 15.2);
        casa.agregarHabiitacoin("Habitacion 3", 25);

        System.out.println(casa);
    }
}
