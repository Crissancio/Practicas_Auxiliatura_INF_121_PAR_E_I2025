package comp;

public class Main {
    public static void main(String[] args) {
        Casa miCasa = new Casa("Calle Falsa 123");

        Habitacion sala = new Habitacion("Sala", 20.5);
        Habitacion cocina = new Habitacion("Cocina", 15.0);
        Habitacion dormitorio = new Habitacion("Dormitorio", 25.0);

        miCasa.agregar_habitacion(sala);
        miCasa.agregar_habitacion(cocina);
        miCasa.agregar_habitacion(dormitorio);

        miCasa.mostrar_casa();
    }
}
