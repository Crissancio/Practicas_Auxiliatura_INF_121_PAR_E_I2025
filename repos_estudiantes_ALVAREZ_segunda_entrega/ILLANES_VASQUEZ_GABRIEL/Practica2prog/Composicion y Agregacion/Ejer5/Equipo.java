
package Com5;

public class Equipo {
    private String nombre;
    private Jugador[] jugadores;
    private int cantidadJugadores;

    public Equipo(String nombre, int capacidad) {
        this.nombre = nombre;
        this.jugadores = new Jugador[capacidad];
        this.cantidadJugadores = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarJugador(Jugador jugador) {
        if (cantidadJugadores < jugadores.length) {
            jugadores[cantidadJugadores++] = jugador;
        } 
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Jugadores:");
        for (int i = 0; i < cantidadJugadores; i++) {
            jugadores[i].mostrarInfo();
        }
    }
}
