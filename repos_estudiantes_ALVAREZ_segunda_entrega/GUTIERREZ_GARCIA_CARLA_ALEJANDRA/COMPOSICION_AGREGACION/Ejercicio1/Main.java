public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Esteban Arce #1452");

        Habitacion habitacion1 = new Habitacion("Sala", 20);
        Habitacion habitacion2 = new Habitacion("Cocina", 15);
        Habitacion habitacion3 = new Habitacion("Dormitorio", 25);

        casa.agregar_habitacion(habitacion1);
        casa.agregar_habitacion(habitacion2);
        casa.agregar_habitacion(habitacion3);

        casa.mostrar_casa();
    }
}