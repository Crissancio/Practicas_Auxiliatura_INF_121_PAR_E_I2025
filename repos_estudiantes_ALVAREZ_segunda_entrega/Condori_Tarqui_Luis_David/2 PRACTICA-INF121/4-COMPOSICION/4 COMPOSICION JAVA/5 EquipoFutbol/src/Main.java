
public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Tigre");

        equipo.agregarJugador(new Portero("Carlos Perez", 1, "Atajadas"));
        equipo.agregarJugador(new Defensa("Luis Torres", 4, "Marcaje"));
        equipo.agregarJugador(new Mediocampista("Juan Lopez", 8, "Pases"));
        equipo.agregarJugador(new Delantero("Pedro Gomez", 9, "Goles"));

        equipo.mostrarEquipo();
    }
}