/*
5. Desarrolla un POO para un equipo de fútbol y sus jugadores. El equipo está 
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
public class Main {
    public static void main(String[] args) {
        // b) 
        Equipo e1 = new Equipo("barcelona fc");
        
        // b) creando jugadores
        Portero p = new Portero("Ter Stegen", 1, "Atajadas imposibles");
        Defensa d = new Defensa("Messi", 4, "Marcaje fuerte");
        Mediocampista m = new Mediocampista("Pedri", 8, "Pases precisos");
        Delantero dl = new Delantero("Lewandowski", 9, "Goles de cabeza");
        Defensa d2 = new Defensa("Kounde", 23, "Velocidad");
        Mediocampista m2 = new Mediocampista("xavi", 6, "Regates");
        
        // b) Agregando jugadores al equipo
        e1.agregar_jugador(p);
        e1.agregar_jugador(dl);
        e1.agregar_jugador(d);
        e1.agregar_jugador(d2);
        e1.agregar_jugador(m);
        e1.agregar_jugador(m2);
        // c)
            e1.mostrar_equipo();
    }
}