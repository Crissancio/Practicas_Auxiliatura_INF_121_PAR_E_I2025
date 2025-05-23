/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Fabricio
 * 5. Desarrolla un POO para un equipo de fútbol y sus jugadores. El equipo está
compuesto por jugadores, y si el equipo se destruye, los jugadores también se
destruyen. Además, los jugadores pueden ser de diferentes tipos (portero,
defensa, mediocampista, delantero).
Clase Padre: Jugador<nombre, número, posición>
Métodos: mostrar_info() (muestra el nombre, número y posición del jugador)
Clases Derivadas: Portero, Defensa, Mediocampista, Delantero (heredan de
Jugador)
Atributos adicionales: habilidad_especial (ej: "Atajadas", "Marcaje", "Pases",
"Goles")
Clase: Equipo<nombre, jugadores (lista de objetos de tipo Jugador)>
Métodos: agregar_jugador(jugador), mostrar_equipo() (muestra el nombre del
equipo y la información de todos los jugadores)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea un equipo y agrega varios jugadores de diferentes tipos.
c) Muestra la información del equipo y sus jugadores.
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Tigres del Altiplano");
        equipo.agregar_jugador(new Portero("Luis", 1, "Atajadas Felinas"));
        equipo.agregar_jugador(new Defensa("Carlos", 4, "Marcaje Implacable"));
        equipo.mostrar_equipo();
    }
}
