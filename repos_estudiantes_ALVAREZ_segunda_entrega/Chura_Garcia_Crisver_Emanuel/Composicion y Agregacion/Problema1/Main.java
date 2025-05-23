public class Main {
    public static void main(String[] args) {
        // "b) Crea una casa y agrega varias habitaciones."
        Casa casa = new Casa("Calle Max Ardiles, Zona Ascinalss");
        casa.agregar_habitacion(new Habitacion("Dormitorio principal", 50.23f));
        casa.agregar_habitacion(new Habitacion("Dormitorio de visitas", 49.93f));
        casa.agregar_habitacion(new Habitacion("Sala", 32.56f));
        casa.agregar_habitacion(new Habitacion("Cocina", 25.66f));
        casa.agregar_habitacion(new Habitacion("Baño", 25.30f));
        System.out.println("c) Muestra la información de la casa y sus habitaciones.");
        casa.mostrar_casa();
    }
}
