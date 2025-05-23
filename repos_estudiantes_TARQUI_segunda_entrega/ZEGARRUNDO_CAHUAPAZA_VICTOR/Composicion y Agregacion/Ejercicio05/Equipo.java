package Composicion5;

public class Equipo {
    private String nombre;
    private Jugador[] jugadores;
    private int cantidad;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new Jugador[11]; // equipo de hasta 11 jugadores
        this.cantidad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarJugador(Jugador jugador) {
        if (cantidad < jugadores.length) {
            jugadores[cantidad] = jugador;
            cantidad++;
        }
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre);
        for (int i = 0; i < cantidad; i++) {
            jugadores[i].mostrarInfo();
        }
    }
}
