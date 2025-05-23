/*
Desarrolla un POO para un equipo de fútbol y sus jugadores. El equipo está
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
package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Tigres FC");

        // Crear jugadores de distintos tipos
        Portero portero = new Portero("Carlos Ruiz", 1, "Atajadas");
        Defensa defensa = new Defensa("Luis Gómez", 4, "Marcaje");
        Mediocampista mediocampista = new Mediocampista("Andrés Pérez", 8, "Pases");
        Delantero delantero = new Delantero("Marco Díaz", 10, "Goles");

        // Agregar jugadores al equipo
        equipo.agregar_jugador(portero);
        equipo.agregar_jugador(defensa);
        equipo.agregar_jugador(mediocampista);
        equipo.agregar_jugador(delantero);

        // Mostrar la información del equipo
        equipo.mostrar_equipo();
    }
}
