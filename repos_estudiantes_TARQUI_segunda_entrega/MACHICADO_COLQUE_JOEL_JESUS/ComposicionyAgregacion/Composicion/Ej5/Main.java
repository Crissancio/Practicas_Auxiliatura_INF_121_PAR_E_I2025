package ComposicionyAgregacion.Composicion.Ej5;

public class Main {
    public static void main(String[] args) {
        Equipo miEquipo = new Equipo("Real Madrid");

        miEquipo.agregarJugador(new Portero("Thibaut Courtois", 1, "Atajadas Felinas"));
        miEquipo.agregarJugador(new Defensa("Antonio Rudiger", 4, "Marcaje Hombre a Hombre"));
        miEquipo.agregarJugador(new Mediocampista("Luca Modric", 8, "Pases Láser"));
        miEquipo.agregarJugador(new Delantero("Vinicius Junior", 9, "Velocidad Explosiva"));

        miEquipo.mostrarEquipo();
    }
}
