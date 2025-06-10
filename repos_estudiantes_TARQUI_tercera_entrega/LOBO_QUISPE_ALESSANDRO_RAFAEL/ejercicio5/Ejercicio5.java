
package ejercicio5;

public class Ejercicio5 {


    public static void main(String[] args) {
        Equipo equipo = new Equipo("Los Titanes");

        equipo.agregarJugador(new Portero("Juan Perez", 1, "Atajadas"));
        equipo.agregarJugador(new Defensa("Carlos Ruiz", 4, "Marcaje"));
        equipo.agregarJugador(new MedioCampista("Luis Gomez", 8, "Pases precisos"));
        equipo.agregarJugador(new Delantero("Pedro Diaz", 10, "Goles espectaculares"));

        equipo.mostrarEquipo();
    }
    
}
