
// 5. Desarrolla un POO para un equipo de fútbol y sus jugadores. El equipo está compuesto por jugadores, y si el equipo se destruye, los jugadores también se destruyen. Además, los jugadores pueden ser de diferentes tipos (portero, defensa, mediocampista, delantero).
//a) Implementa las clases con sus constructores, getters y setters.
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void agregar_jugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void mostrar_equipo() {
        System.out.println("Equipo: " + getNombre() + "\nJugadores: ");
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador player = jugadores.get(i);
            player.mostrar_info();
        }
    }
}
