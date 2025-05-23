package ComposicionAgregacion.Ejer5.codigo;


import java.util.ArrayList;

public class Equipo {
    public String nombre;
    public ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<Jugador>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }
    public void mostrar_equipo() {
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("Jugadores:");
        for (Jugador jugador : jugadores) {
            System.out.println("Nombre: " + jugador.getNombre() + ", Número: " + jugador.getNumero() + ", Posición: " + jugador.getPosicion());
        }
        
    }

}
