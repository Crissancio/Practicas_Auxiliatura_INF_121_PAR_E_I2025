package ComposicionAgregacion.Ejer5.codigo;

public class Main {
    //5. Desarrolla un POO para un equipo de fútbol y sus jugadores. El equipo está
//compuesto por jugadores, y si el equipo se destruye, los jugadores también se
//destruyen. Además, los jugadores pueden ser de diferentes tipos (portero,
//defensa, mediocampista, delantero).
//Clase Padre: Jugador<nombre, número, posición>
//Métodos: mostrar_info() (muestra el nombre, número y posición del jugador)
//Clases Derivadas: Portero, Defensa, Mediocampista, Delantero (heredan de
//Jugador)
//Atributos adicionales: habilidad_especial (ej: "Atajadas", "Marcaje", "Pases",
//"Goles")
//Clase: Equipo<nombre, jugadores (lista de objetos de tipo Jugador)>
//Métodos: agregar_jugador(jugador), mostrar_equipo() (muestra el nombre del
//equipo y la información de todos los jugadores)
//a) Implementa las clases con sus constructores, getters y setters.
//b) Crea un equipo y agrega varios jugadores de diferentes tipos.
//c) Muestra la información del equipo y sus jugadores.
    public static void main(String[] args) {   
        Equipo equipo = new Equipo("Real Madrid");
        Jugador jugador1 = new Delantero("Cristiano Ronaldo", 7, "Goles");
        Jugador jugador2 = new Defensa("Sergio Ramos", 4, "Marcaje");
        Jugador jugador3 = new Mediocampista("Luka Modric", 10, "Pases");
        Jugador jugador4 = new Portero("Thibaut Courtois", 1, "Atajadas");
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);
        equipo.agregarJugador(jugador4);
        System.out.println(" -----------------------------------------------");
        System.out.println("Información del equipo:");
        equipo.mostrar_equipo();
        System.out.println(" -----------------------------------------------");
        System.out.println("Información de los jugadores:");
        jugador1.mostrar_info();
        System.out.println("---------------------------------");
        jugador2.mostrar_info();
        System.out.println("---------------------------------");
        jugador3.mostrar_info();
        System.out.println("---------------------------------");
        jugador4.mostrar_info();

    }

}
