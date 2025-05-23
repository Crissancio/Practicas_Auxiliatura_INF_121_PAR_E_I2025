package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("UMSA F.C.");

        equipo.agregar_jugador(new Portero("Carlos", 1, "Atajadas rapidas"));
        equipo.agregar_jugador(new Defensa("Luis", 4, "Marcaje ferreo"));
        equipo.agregar_jugador(new Mediocampista("Jorge", 8, "Pases precisos"));
        equipo.agregar_jugador(new Delantero("Marco", 9, "Goleador nato"));

        equipo.mostrar_equipo();
    }
}
