package Polimorfismo.Ej1;

public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    // Constructor por defecto
    public Videojuego() {
        this.nombre = "Desconocido";
        this.plataforma = "Indefinida";
        this.cantidadJugadores = 1;
    }

    // Constructor con nombre y plataforma
    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 1;
    }

    // Constructor completo
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public void mostrar() {
        System.out.println("Videojuego: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Jugadores: " + cantidadJugadores);
    }

    // Sobrecarga de método: agregar un solo jugador
    public void agregarJugadores() {
        this.cantidadJugadores++;
    }

    // Sobrecarga de método: agregar varios jugadores
    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
    }
}
