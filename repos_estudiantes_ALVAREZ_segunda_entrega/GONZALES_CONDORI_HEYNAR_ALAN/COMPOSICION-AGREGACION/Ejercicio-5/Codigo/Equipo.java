
package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregar_jugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void mostrar_equipo() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Jugadores:");
        for (Jugador j : jugadores) {
            j.mostrar_info();
            System.out.println();
        }
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
}
