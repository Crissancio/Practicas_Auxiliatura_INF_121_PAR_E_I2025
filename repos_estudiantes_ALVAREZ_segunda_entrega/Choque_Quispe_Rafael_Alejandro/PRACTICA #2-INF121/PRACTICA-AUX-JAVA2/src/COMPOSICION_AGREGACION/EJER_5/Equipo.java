package COMPOSICION_AGREGACION.EJER_5;
import java.util.ArrayList;
import java.util.List;
public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
    public void mostrarEquipo() {
        System.out.println("=== Equipo: " + nombre + " ===");
        System.out.println("=== Jugadores ===");
        
        for (Jugador jugador : jugadores) {
            jugador.mostrarInfo();
            System.out.println("-------------------");
        }
    }
    public List<Jugador> getJugadores() {
        return new ArrayList<>(jugadores);
    }
}