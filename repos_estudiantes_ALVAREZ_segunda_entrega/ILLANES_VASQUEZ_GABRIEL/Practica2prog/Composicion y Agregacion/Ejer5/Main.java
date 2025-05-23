
package Com5;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("real madrid", 4);
        
        Portero portero = new Portero("iker casillas", 1, "atajadas");
        Defensa defensa = new Defensa("sergio ramos", 4, "destrozar");
        Mediocampista medio = new Mediocampista("toni kross", 8, "pases magicos");
        Delantero delantero = new Delantero("cristiano ronaldo", 7, "goles imposibles");

        equipo.agregarJugador(portero);
        equipo.agregarJugador(defensa);
        equipo.agregarJugador(medio);
        equipo.agregarJugador(delantero);

        equipo.mostrarEquipo();
    }
}
