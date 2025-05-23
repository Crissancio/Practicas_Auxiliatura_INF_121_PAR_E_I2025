public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadDeJugadores;

    public Videojuego(String nombre, String plataforma, int cantidadDeJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadDeJugadores = cantidadDeJugadores;
    }

    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadDeJugadores = 1;
    }

    public Videojuego() {
        this.nombre = "Desconocido";
        this.plataforma = "Desconocida";
        this.cantidadDeJugadores = 1;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de jugadores: " + cantidadDeJugadores);
    }

    public void agregarJugadores() {
        cantidadDeJugadores += 1;
        System.out.println("Se agregó 1 jugador. Total: " + cantidadDeJugadores);
    }

    public void agregarJugadores(int cantidad) {
        cantidadDeJugadores += cantidad;
        System.out.println("Se agregaron " + cantidad + " jugadores. Total: " + cantidadDeJugadores);
    }
}
