package jugadores;

public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 1;
    }

    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de Jugadores: " + cantidadJugadores);
    }

    public void agregarJugadores() {
        this.cantidadJugadores++;
        System.out.println("Se ha agregado 1 jugador. Cantidad total: " + cantidadJugadores);
    }
    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
        System.out.println("Se han agregado " + cantidad + " jugadores. Cantidad total: " + cantidadJugadores);
    }

    public static void main(String[] args) {
        Videojuego videojuego1 = new Videojuego("Animal Crossing: New Horizons", "Nintendo Switch");
        Videojuego videojuego2 = new Videojuego("The Last Of Us", "PlayStation 4", 4);

        videojuego1.mostrar();
        videojuego2.mostrar();

        videojuego1.agregarJugadores();
        videojuego2.agregarJugadores(3);
    }
}
