package composicion;
public class AppEquipo {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Tigres FC");

        equipo.agregarJugador(new Portero("Carlos Pérez", 1, "Portero"));
        equipo.agregarJugador(new Defensa("Luis Gómez", 4, "Defensa"));
        equipo.agregarJugador(new Delantero("Jorge Díaz", 10, "Delantero"));

        equipo.mostrar_equipo();
    }
}
