package Composicion5;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Choripanas FC");

        equipo.agregarJugador(new Portero("Carlos", 1, "Atajadas"));
        equipo.agregarJugador(new Defensa("Luis", 3, "Marcaje"));
        equipo.agregarJugador(new Mediocampista("Pedro", 8, "Pases"));
        equipo.agregarJugador(new Delantero("Juan", 9, "Goles"));

        equipo.mostrarEquipo();
    }
}
