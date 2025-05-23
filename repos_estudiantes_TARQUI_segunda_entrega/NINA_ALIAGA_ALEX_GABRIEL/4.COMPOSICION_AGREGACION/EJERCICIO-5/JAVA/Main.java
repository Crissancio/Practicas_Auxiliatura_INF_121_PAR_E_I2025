public class Main {
  public static void main(String[] args) {
    Equipo equipo = new Equipo("Equipo A");

    equipo.agregarJugador("Juan", 1, "Portero");
    equipo.agregarJugador("Pedro", 2, "Defensa");
    equipo.agregarJugador("Luis", 3, "Medio Campista");
    equipo.agregarJugador("Carlos", 4, "Delantero");
    equipo.agregarJugador("Miguel", 5, "Medio Campista");
    equipo.agregarJugador("Jorge", 6, "Defensa");
    equipo.agregarJugador("Jose", 7, "Delantero");
    equipo.agregarJugador("Antonio", 8, "Medio Campista");

    equipo.mostrarEquipo();
  }
}