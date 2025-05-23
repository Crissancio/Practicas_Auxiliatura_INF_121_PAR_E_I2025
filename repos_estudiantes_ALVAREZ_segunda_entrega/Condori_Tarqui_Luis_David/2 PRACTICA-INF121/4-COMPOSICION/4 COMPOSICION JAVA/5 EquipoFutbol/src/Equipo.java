// TEMA: COMPOSICIÓN + HERENCIA
// Enunciado:
// 5. Desarrolla un POO para un equipo de fútbol y sus jugadores. El equipo está compuesto por jugadores,
// y si el equipo se destruye, los jugadores también se destruyen.
// Además, los jugadores pueden ser de diferentes tipos: Portero, Defensa, Mediocampista, Delantero.
//
// Clase Padre: Jugador<nombre, número, posición>
// Métodos: mostrar_info() (muestra el nombre, número y posición del jugador)
//
// Clases Derivadas: Portero, Defensa, Mediocampista, Delantero (heredan de Jugador)
// Atributo adicional: habilidad_especial (ej: "Atajadas", "Marcaje", "Pases", "Goles")
//
// Clase: Equipo<nombre, jugadores (lista de objetos de tipo Jugador)>
// Métodos: agregar_jugador(jugador), mostrar_equipo() (muestra el nombre del equipo y la información de todos los jugadores)
//
// Incisos:
// a) Implementa las clases con sus constructores, getters y setters.
// b) Crea un equipo y agrega varios jugadores de diferentes tipos.
// c) Muestra la información del equipo y sus jugadores.

import java.util.ArrayList;

class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre);
        for (Jugador j : jugadores) {
            j.mostrarInfo();
        }
    }
}

