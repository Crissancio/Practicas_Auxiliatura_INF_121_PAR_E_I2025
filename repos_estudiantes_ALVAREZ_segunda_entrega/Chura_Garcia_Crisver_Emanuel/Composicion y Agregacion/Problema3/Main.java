// 5. Desarrolla un POO para un equipo de fútbol y sus jugadores. El equipo está compuesto por jugadores, y si el equipo se destruye, los jugadores también se destruyen. Además, los jugadores pueden ser de diferentes tipos (portero, defensa, mediocampista, delantero).
public class Main {
    public static void main(String[] args) {
        // b) Crea un equipo y agrega varios jugadores de diferentes tipos.
        Equipo eq1 = new Equipo("Club Bolivar");
        eq1.agregar_jugador(new Portero("Carlos Lampe", 1, "Portero", "Atajada"));
        eq1.agregar_jugador(new Defensa("Jesus Sagredo", 2, "Defensa", "Saque rapido"));
        eq1.agregar_jugador(new Mediocampista("Ramiro Vaca", 11, "Central", "Tiro largo"));
        eq1.agregar_jugador(new Delantero("Bruno Savio", 10, "Delantero", "Remate"));
        System.out.println("c) Muestra la información del equipo y sus jugadores.");
        eq1.mostrar_equipo();

    }
}
