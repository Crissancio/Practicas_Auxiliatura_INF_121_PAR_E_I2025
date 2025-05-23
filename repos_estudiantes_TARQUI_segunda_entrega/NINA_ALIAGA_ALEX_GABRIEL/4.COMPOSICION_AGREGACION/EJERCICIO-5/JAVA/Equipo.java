import java.util.ArrayList;

class Equipo {
  private String nombre;
  private ArrayList<Jugador> jugadores;

  public Equipo(String nombre) {
    this.nombre = nombre;
    this.jugadores = new ArrayList<>();
  }

  public void agregarJugador(String nombre, int numero, String pocision) {
    if (pocision.equals("Portero")) {
      jugadores.add(new Portero(nombre, numero));
    } else if (pocision.equals("Defensa")) {
      jugadores.add(new Defensa(nombre, numero));
    } else if (pocision.equals("Medio Campista")) {
      jugadores.add(new MedioCampista(nombre, numero));
    } else if (pocision.equals("Delantero")) {
      jugadores.add(new Delantero(nombre, numero));
    }
  }

  public void mostrarEquipo() {
    System.out.println("Equipo: " + nombre + "\n");
    System.out.println("------------------------------");
    System.out.println("Informacion de jugadores:\n");
    for (Jugador jugador : jugadores) {
      jugador.mostrarInfo();
      System.out.println();
    }
  }
}
